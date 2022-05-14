package com.pan233.marryme.item;

import com.pan233.marryme.MarryMeMod;
import com.pan233.marryme.item.armor.AngeArmor;
import com.pan233.marryme.item.costom.MusicDisc;
import com.pan233.marryme.item.costom.Ring;
import com.pan233.marryme.sound.MarryMeSounds;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class MarryMeItems {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MarryMeMod.MOD_ID, "group"), () -> new ItemStack(MarryMeItems.RING));
    public static final Item RING = registerItems("ring", new Ring(new FabricItemSettings().group(ITEM_GROUP).rarity(Rarity.UNCOMMON).maxCount(1).fireproof()));
    public static final Item ANGE_HELMET = registerItems("ange_helmet", new AngeArmor(MarryMeArmorMaterial.ANGE, EquipmentSlot.HEAD, new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ITEM_GROUP)));
    public static final Item ANGE_CHEST = registerItems("ange_chest", new AngeArmor(MarryMeArmorMaterial.ANGE, EquipmentSlot.CHEST, new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ITEM_GROUP)));
    public static final Item MARRYING_MUSIC_DISC = registerItems("marry_music_disc", new MusicDisc(7, MarryMeSounds.MARRYING, new FabricItemSettings().group(ITEM_GROUP).maxCount(1)));

    public static void registerModItems() {
        MarryMeMod.LOGGER.info("Register Mod Item " + MarryMeMod.MOD_ID);
    }

    public static Item registerItems(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MarryMeMod.MOD_ID, name), item);
    }
}
