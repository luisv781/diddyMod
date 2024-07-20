package com.bruhhidk.block.custom;

import com.bruhhidk.sound.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DiddyBlock extends Block {

    public DiddyBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(Text.translatable("tooltip.brotha-idk.diddy_block.tooltip"));
        super.appendTooltip(stack, context, tooltip, options);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        world.playSound(null, pos, ModSounds.DIDDY_SOUND, SoundCategory.BLOCKS, 1f, 1f);

        super.onPlaced(world, pos, state, placer, itemStack);
    }
}
