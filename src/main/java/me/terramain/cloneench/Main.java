package me.terramain.cloneench;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.ARROW_DAMAGE,7) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.ARROW_FIRE,6) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.ARROW_INFINITE,1) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.ARROW_KNOCKBACK,4) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.BINDING_CURSE,1) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.CHANNELING,1) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.DAMAGE_ALL,8) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.DAMAGE_ARTHROPODS,6) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.DAMAGE_UNDEAD,7) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.DEPTH_STRIDER,8) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.DIG_SPEED,10) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.DURABILITY,10) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.FIRE_ASPECT,8) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.FROST_WALKER,4) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.IMPALING,6) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.KNOCKBACK,4) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.LOOT_BONUS_BLOCKS,8) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.LOOT_BONUS_MOBS,8) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.LOYALTY,5) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.LUCK,5) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.LURE,6) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.MENDING,1) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.MULTISHOT,1) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.OXYGEN,7) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.PIERCING,6) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.PROTECTION_ENVIRONMENTAL,8) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.PROTECTION_EXPLOSIONS,5) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.PROTECTION_FALL,7) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.PROTECTION_FIRE,5) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.PROTECTION_PROJECTILE,6) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.QUICK_CHARGE,5) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.RIPTIDE,5) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.SILK_TOUCH,1) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.SOUL_SPEED,4) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.SWEEPING_EDGE,10) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.SWIFT_SNEAK,5) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.THORNS,7) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.VANISHING_CURSE,1) );
        Logic.enchantBlockingList.add( new EnchantBlocking(Enchantment.WATER_WORKER,8) );

        new CMD(this);
    }

    @Override
    public void onDisable() {

    }
}
