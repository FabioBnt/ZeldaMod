package net.fabiobnt.zeldamod.item;

import net.fabiobnt.zeldamod.Zeldamod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SWORD = registerItem("sword",
            new Item(
                    new FabricItemSettings().group(ModItemGroup.ZELDA)
                            .rarity(Rarity.COMMON)
                            .maxCount(1)
                            ));
    public static final Item MASTER_SWORD = registerItem("master_sword",
            new Item(new FabricItemSettings().group(ModItemGroup.ZELDA)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Zeldamod.MOD_ID, name), item);
    }
    public static void registerItems() {
        // Register items here
        Zeldamod.LOGGER.debug("Registering Mod Items for " + Zeldamod.MOD_ID + "");
    }
}
