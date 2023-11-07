package me.terramain.cloneench;

import me.terramain.cloneench.EnchantBlocking;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Logic {
    public static List<EnchantBlocking> enchantBlockingList = new ArrayList<>();

    public static void clone(Player player){
        ItemStack itemStack1 = player.getInventory().getItemInMainHand();
        ItemStack itemStack2 = player.getInventory().getItemInOffHand();


        if (
                itemStack1.getType()!=itemStack2.getType() &&
                itemStack2.getType()!= Material.ENCHANTED_BOOK
        ){
            player.sendMessage("совместить можно только одинаковые предметы, или предмет с чародейской книгой");
            return;
        }


        ItemStack result = cloneItems(itemStack1,itemStack2);


        int price = result.getEnchantments().size();
        if (player.getLevel() < price){
            player.sendMessage("вам нехватает уровня опыта. Вам нужен уровень " + price);
            return;
        }
        player.setLevel(player.getLevel()-price);


        player.getInventory().setItemInMainHand(result);
        player.getInventory().setItemInOffHand(null);
    }

    private static ItemStack cloneItems(ItemStack itemStack1, ItemStack itemStack2){

        Map<Enchantment, Integer> enchantments1 = itemStack1.getEnchantments();
        Map<Enchantment, Integer> enchantments2 = itemStack2.getEnchantments();

        Map<Enchantment, Integer> enchantmentsResult = new HashMap<>();

        int i = 0;
        for ( Enchantment enchantment1 : enchantments1.keySet() ) {
            int level1 = enchantments1.get(enchantment1);
            System.out.println("level1="+level1);
            Integer levelFromResult1 = enchantmentsResult.get(enchantment1);
            if (levelFromResult1 == null || levelFromResult1 <= level1){

                enchantmentsResult.put(enchantment1,level1);

                int j = 0;
                for ( Enchantment enchantment2 : enchantments2.keySet() ) {
                    int level2 = enchantments2.get(enchantment2);
                    System.out.println("level2="+level2);
                    Integer levelFromResult2 = enchantmentsResult.get(enchantment2);
                    if (levelFromResult2==null || levelFromResult2 <= level2) {

                        enchantmentsResult.put(enchantment2,level2);

                        if (enchantment1.equals(enchantment2)){
                            System.out.println("equals");
                            enchantmentsResult.remove(enchantment1);
                            enchantmentsResult.remove(enchantment2);
                            if (level1==level2) {
                                int newLevel=level1+1;
                                enchantmentsResult.put(enchantment1,newLevel);
                                System.out.println("level1==level2; newLevel=" + newLevel);
                            }
                            else {
                                enchantmentsResult.put(enchantment1, Math.max(level1, level2));
                                System.out.println("level1!=level2");
                            }
                        }

                    }
                    j++;
                    System.out.println();
                }
            }

            i++;
            System.out.println();
            System.out.println();
        }

        ItemStack itemStack = new ItemStack(itemStack1);
        for (Map.Entry<Enchantment, Integer> entry : enchantmentsResult.entrySet()) {
            Enchantment enchantment = entry.getKey();
            int level = Math.min(
                    entry.getValue(),
                    getEnchantBlocking(enchantment).max_level
            );
            System.out.println(enchantment.getName()+" level: " + entry.getValue() + " max level: " + getEnchantBlocking(enchantment).max_level);
            itemStack.addUnsafeEnchantment(enchantment,level);
        }
        return itemStack;
    }


    public static EnchantBlocking getEnchantBlocking(Enchantment enchantment){
        for (EnchantBlocking enchantBlocking : enchantBlockingList) {
            if (enchantBlocking.enchant.equals(enchantment)) return enchantBlocking;
        }
        return null;
    }


}
