package com.bruhhidk.item;

import com.bruhhidk.BrothaIdk;
import com.bruhhidk.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup idkGroup = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BrothaIdk.MOD_ID, "bruhidk"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bruhidk"))
                    .icon(() -> new ItemStack(ModItems.SHIT)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.SHIT);
                        entries.add(ModItems.GREEN_SHIT);

                        entries.add(ModBlocks.DIDDY_BLOCK);
                        entries.add(ModBlocks.POTATO_BLOCK);

                        entries.add(ModBlocks.POTATO_STAIRS);
                        entries.add(ModBlocks.POTATO_SLAB);
                        entries.add(ModBlocks.POTATO_BUTTON);
                        entries.add(ModBlocks.POTATO_PRESSURE_PLATE);
                        entries.add(ModBlocks.POTATO_FENCE);
                        entries.add(ModBlocks.POTATO_FENCE_GATE);
                        entries.add(ModBlocks.POTATO_WALL);
                        entries.add(ModBlocks.POTATO_DOOR);
                        entries.add(ModBlocks.POTATO_TRAPDOOR);
                    })).build());

    public static void registerItemGroups() {

    }

}
