package net.fabiobnt.zeldamod.block;

import net.fabiobnt.zeldamod.Zeldamod;
import net.fabiobnt.zeldamod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block JAR_BLOCK = registerBlock("jar",
            new Block(FabricBlockSettings.of(Material.DECORATION).breakInstantly().sounds(BlockSoundGroup.GLASS)), ModItemGroup.ZELDA);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Zeldamod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name , Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(Zeldamod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks() {
        // Register blocks here
        Zeldamod.LOGGER.debug("Registering Mod Blocks for " + Zeldamod.MOD_ID + "");
    }
}
