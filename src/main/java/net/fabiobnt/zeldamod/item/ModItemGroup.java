package net.fabiobnt.zeldamod.item;

import net.fabiobnt.zeldamod.Zeldamod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ZELDA = FabricItemGroupBuilder.build(
            new Identifier(Zeldamod.MOD_ID, "zelda"), () -> new ItemStack(ModItems.SWORD));
}
