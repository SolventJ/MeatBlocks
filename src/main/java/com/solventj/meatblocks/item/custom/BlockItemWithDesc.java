package com.solventj.meatblocks.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class BlockItemWithDesc extends BlockItem {
    public BlockItemWithDesc(Block block, Properties properties, ChatFormatting format) {
        super(block, properties);
        this.format = format;
    }

    public ChatFormatting format;

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable(getBlock().getDescriptionId()+".desc").withStyle(format));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
