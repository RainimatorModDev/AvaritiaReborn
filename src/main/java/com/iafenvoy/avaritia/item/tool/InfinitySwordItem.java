package com.iafenvoy.avaritia.item.tool;

import com.iafenvoy.avaritia.item.armor.InfinityArmorItem;
import com.iafenvoy.avaritia.registry.ModDamageType;
import com.iafenvoy.avaritia.registry.ModGameRules;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public class InfinitySwordItem extends SwordItem {
    public InfinitySwordItem() {
        super(InfinityMaterial.MATERIAL, 3, -2.0F, new Settings().rarity(Rarity.EPIC));
    }

    @Override
    public boolean postHit(ItemStack itemtack, LivingEntity entity, LivingEntity sourceentity) {
        if (entity instanceof PlayerEntity player) {
            if (player.isCreative() && !entity.getWorld().getGameRules().getBoolean(ModGameRules.INFINITY_KILL_CREATIVE))
                return false;
            if (InfinityArmorItem.fullyEquipped(player))
                return false;
        }
        Registry<DamageType> registry = entity.getDamageSources().registry;
        DamageSource source = new DamageSource(registry.getEntry(registry.get(ModDamageType.INFINITY)), sourceentity, sourceentity);
        entity.setInvulnerable(false);
        entity.damage(source, entity.getHealth());
        entity.setHealth(0);
        entity.onDeath(source);
        return true;
    }
}
