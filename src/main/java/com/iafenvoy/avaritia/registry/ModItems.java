package com.iafenvoy.avaritia.registry;

import com.iafenvoy.annotationlib.annotation.ModId;
import com.iafenvoy.annotationlib.annotation.TargetId;
import com.iafenvoy.annotationlib.annotation.registration.Group;
import com.iafenvoy.annotationlib.annotation.registration.ItemReg;
import com.iafenvoy.annotationlib.annotation.registration.Link;
import com.iafenvoy.annotationlib.api.IAnnotatedRegistryEntry;
import com.iafenvoy.annotationlib.util.TargetType;
import com.iafenvoy.avaritia.AvaritiaReborn;
import com.iafenvoy.avaritia.item.InfinityBucketItem;
import com.iafenvoy.avaritia.item.MatterClusterItem;
import com.iafenvoy.avaritia.item.SingularityItem;
import com.iafenvoy.avaritia.item.armor.InfinityArmorItem;
import com.iafenvoy.avaritia.item.tool.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

@ModId(AvaritiaReborn.MOD_ID)
public class ModItems implements IAnnotatedRegistryEntry {
    @ItemReg(group = @TargetId("main"))
    public static final Item DIAMOND_LATTICE = new Item(new FabricItemSettings());
    @ItemReg(group = @TargetId("main"))
    public static final Item CRYSTAL_MATRIX_INGOT = new Item(new FabricItemSettings());
    @ItemReg(group = @TargetId("main"))
    public static final Item NEUTRON_PILE = new Item(new FabricItemSettings());
    @ItemReg(group = @TargetId("main"))
    public static final Item NEUTRON_NUGGET = new Item(new FabricItemSettings());
    @ItemReg(group = @TargetId("main"))
    public static final Item NEUTRONIUM_INGOT = new Item(new FabricItemSettings());
    @ItemReg(group = @TargetId("main"))//TODO
    public static final Item ENDEST_PEARL = new Item(new FabricItemSettings());
    @ItemReg(group = @TargetId("main"))
    public static final Item SKULLFIRE_SWORD = new InfinitySwordItem();
    @ItemReg(group = @TargetId("main"))
    public static final Item SINGULARITY = new SingularityItem();
    @ItemReg(group = @TargetId("main"))
    public static final Item RECORD_FRAGMENT = new Item(new FabricItemSettings().fireproof());
    @ItemReg(group = @TargetId("main"))
    public static final Item COSMIC_MEATBALLS = new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).food(new FoodComponent.Builder().hunger(100).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 5 * 60 * 20, 1), 1).build()));
    @ItemReg(group = @TargetId("main"))
    public static final Item ULTIMATE_STEW = new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).food(new FoodComponent.Builder().hunger(100).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5 * 60 * 20, 1), 1).build()));
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_CATALYST = new Item(new FabricItemSettings().fireproof().rarity(Rarity.RARE));
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_INGOT = new Item(new FabricItemSettings().fireproof().rarity(Rarity.RARE));
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_BUCKET = new InfinityBucketItem();
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_HELMET = new InfinityArmorItem(ArmorItem.Type.HELMET);
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_CHESTPLATE = new InfinityArmorItem(ArmorItem.Type.CHESTPLATE);
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_LEGS = new InfinityArmorItem(ArmorItem.Type.LEGGINGS);
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_BOOTS = new InfinityArmorItem(ArmorItem.Type.BOOTS);
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_SWORD = new InfinitySwordItem();
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_AXE = new InfinityAxeItem();
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_PICKAXE = new InfinityPickaxeItem();
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_SHOVEL = new InfinityShovelItem();
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_HOE = new InfinityHoeItem();
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_BOW = new InfinityBowItem();
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_CROSSBOW = new InfinityCrossbowItem();
    @ItemReg(group = @TargetId("main"))
    public static final Item INFINITY_TOTEM = new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC));
    @Group(@TargetId("main"))
    @Link(type = TargetType.BLOCK, target = @TargetId("compressed_crafting_table"))
    public static Item COMPRESSED_CRAFTING_TABLE = null;
    @Group(@TargetId("main"))
    @Link(type = TargetType.BLOCK, target = @TargetId("double_compressed_crafting_table"))
    public static Item DOUBLE_COMPRESSED_CRAFTING_TABLE = null;
    @Group(@TargetId("main"))
    @Link(type = TargetType.BLOCK, target = @TargetId("crystal_matrix_block"))
    public static Item CRYSTAL_MATRIX_BLOCK = null;
    @Group(@TargetId("main"))
    @Link(type = TargetType.BLOCK, target = @TargetId("neutronium_block"))
    public static Item NEUTRONIUM_BLOCK = null;
    @Group(@TargetId("main"))
    @Link(type = TargetType.BLOCK, target = @TargetId("extreme_crafting_table"))
    public static Item EXTREME_CRAFTING_TABLE = null;
    @Group(@TargetId("main"))
    @Link(type = TargetType.BLOCK, target = @TargetId("neutron_collector"))
    public static Item NEUTRON_COLLECTOR = null;
    @Group(@TargetId("main"))
    @Link(type = TargetType.BLOCK, target = @TargetId("compressor"))
    public static Item COMPRESSOR = null;
    @Group(@TargetId("main"))
    @Link(type = TargetType.BLOCK, target = @TargetId("infinity_block"))
    public static Item INFINITY_BLOCK = null;
    @ItemReg(group = @TargetId("main"))
    public static final Item MATTER_CLUSTER = new MatterClusterItem();
}
