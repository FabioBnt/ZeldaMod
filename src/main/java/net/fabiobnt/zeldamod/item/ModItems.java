package net.fabiobnt.zeldamod.item;

import net.fabiobnt.zeldamod.Zeldamod;
import net.fabiobnt.zeldamod.item.custom.tools.SwordItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final ToolItem SWORD = registerItem("sword",
            new SwordItem(ToolMaterials.IRON,3,-2.4F, new FabricItemSettings().group(ModItemGroup.ZELDA).maxCount(1)));
    public static final ToolItem MASTER_SWORD = registerItem("master_sword",
            new SwordItem(ToolMaterials.NETHERITE, 3, -2.4F,
                    new FabricItemSettings().group(ModItemGroup.ZELDA).maxCount(1)
                            .rarity(Rarity.EPIC).fireproof()));

    private static <T extends Item> T registerItem(String name, T item) {
        return  Registry.register(Registry.ITEM, new Identifier(Zeldamod.MOD_ID, name), item);
    }
    public static void registerItems() {
        // Register items here
        Zeldamod.LOGGER.debug("Registering Mod Items for " + Zeldamod.MOD_ID + "");
    }
}
