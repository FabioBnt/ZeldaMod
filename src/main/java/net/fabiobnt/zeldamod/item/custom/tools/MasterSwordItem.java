package net.fabiobnt.zeldamod.item.custom.tools;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class MasterSwordItem extends SwordItem{
    public MasterSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.of("Its blade gleams with a sacred luster that can oppose the Calamity. Only a hero chosen by the sword itself may wield it."));
        } else {
            tooltip.add(Text.translatable("The Legendary sword that seals the darkness. ").formatted(Formatting.ITALIC));
            tooltip.add(Text.translatable("Press SHIFT for more info").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
