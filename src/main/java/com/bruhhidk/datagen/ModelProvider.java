package com.bruhhidk.datagen;

import com.bruhhidk.block.ModBlocks;
import com.bruhhidk.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POTATO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIDDY_BLOCK);

        BlockStateModelGenerator.BlockTexturePool potatoPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POTATO_BLOCK);
        potatoPool.stairs(ModBlocks.POTATO_STAIRS);
        potatoPool.slab(ModBlocks.POTATO_SLAB);
        potatoPool.button(ModBlocks.POTATO_BUTTON);
        potatoPool.pressurePlate(ModBlocks.POTATO_PRESSURE_PLATE);
        potatoPool.fence(ModBlocks.POTATO_FENCE);
        potatoPool.fenceGate(ModBlocks.POTATO_FENCE_GATE);
        potatoPool.wall(ModBlocks.POTATO_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.POTATO_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.POTATO_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SHIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SHIT, Models.GENERATED);
    }
}
