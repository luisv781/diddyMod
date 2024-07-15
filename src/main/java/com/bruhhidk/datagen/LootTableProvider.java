package com.bruhhidk.datagen;

import com.bruhhidk.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.POTATO_BLOCK);
        addDrop(ModBlocks.DIDDY_BLOCK);

        addDrop(ModBlocks.POTATO_STAIRS);
        addDrop(ModBlocks.POTATO_BUTTON);
        addDrop(ModBlocks.POTATO_PRESSURE_PLATE);
        addDrop(ModBlocks.POTATO_FENCE);
        addDrop(ModBlocks.POTATO_FENCE_GATE);
        addDrop(ModBlocks.POTATO_WALL);
        addDrop(ModBlocks.POTATO_TRAPDOOR);
        addDrop(ModBlocks.POTATO_DOOR, doorDrops(ModBlocks.POTATO_DOOR));
        addDrop(ModBlocks.POTATO_SLAB, slabDrops(ModBlocks.POTATO_SLAB));
    }

}
