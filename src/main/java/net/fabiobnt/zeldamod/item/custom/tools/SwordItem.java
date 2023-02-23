package net.fabiobnt.zeldamod.item.custom.tools;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class SwordItem extends net.minecraft.item.SwordItem {

    public SwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.of("It's dangerous to go alone! Take this!"));
        } else {
            tooltip.add(Text.translatable("A sword once wielded by a hero in an ancient age.").formatted(Formatting.ITALIC));
            tooltip.add(Text.translatable("Press SHIFT for more info").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }




}
