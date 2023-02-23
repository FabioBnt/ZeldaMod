package net.fabiobnt.zeldamod;

import net.fabiobnt.zeldamod.block.ModBlocks;
import net.fabiobnt.zeldamod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class Zeldamod implements ModInitializer {
    public static final String MOD_ID = "zeldamod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.debug("Initializing " + MOD_ID + "");
        ModItems.registerItems();
        ModBlocks.registerModBlocks();
    }
}
