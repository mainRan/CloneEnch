package me.terramain.cloneench;

import org.bukkit.enchantments.Enchantment;

public class EnchantBlocking {
    public Enchantment enchant;
    public int max_level;

    public EnchantBlocking() {}
    public EnchantBlocking(Enchantment enchant, int max_level) {
        this.enchant = enchant;
        this.max_level = max_level;
    }
}
