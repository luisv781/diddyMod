package com.bruhhidk.block;

import com.bruhhidk.BrothaIdk;
import com.bruhhidk.block.custom.DiddyBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block POTATO_BLOCK = registerBlock("potato_block",
            new Block(AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block POTATO_STAIRS = registerBlock("potato_stairs",
            new StairsBlock(ModBlocks.POTATO_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block POTATO_SLAB = registerBlock("potato_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PUMPKIN)));

    public static final Block POTATO_BUTTON = registerBlock("potato_button",
            new ButtonBlock(BlockSetType.OAK, 50, AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block POTATO_PRESSURE_PLATE = registerBlock("potato_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.PUMPKIN)));

    public static final Block POTATO_FENCE = registerBlock("potato_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block POTATO_FENCE_GATE = registerBlock("potato_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.PUMPKIN)));
    public static final Block POTATO_WALL = registerBlock("potato_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PUMPKIN)));

    public static final Block POTATO_DOOR = registerBlock("potato_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.PUMPKIN).nonOpaque()));
    public static final Block POTATO_TRAPDOOR = registerBlock("potato_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.PUMPKIN).nonOpaque()));



    public static final Block DIDDY_BLOCK = registerBlock("diddy_block",
            new DiddyBlock(AbstractBlock.Settings.create().hardness(10)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BrothaIdk.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(BrothaIdk.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {

    }

}
