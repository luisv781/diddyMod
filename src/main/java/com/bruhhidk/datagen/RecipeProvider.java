package com.bruhhidk.datagen;

import com.bruhhidk.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider {

    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        //offerSmelting offerBlasting
        offerReversibleCompactingRecipes(exporter, RecipeCategory.TOOLS, Items.BEEF, RecipeCategory.MISC,
                ModBlocks.DIDDY_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.POTATO, RecipeCategory.FOOD,
                ModBlocks.POTATO_BLOCK);
        createStairsRecipe(ModBlocks.POTATO_STAIRS, Ingredient.ofItems(Items.POTATO))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.POTATO_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTATO_SLAB, Items.POTATO);
        offerPressurePlateRecipe(exporter, ModBlocks.POTATO_PRESSURE_PLATE, Items.POTATO);
        createFenceRecipe(ModBlocks.POTATO_FENCE, Ingredient.ofItems(Items.POTATO))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.POTATO_FENCE)));

        createFenceGateRecipe(ModBlocks.POTATO_FENCE_GATE, Ingredient.ofItems(Items.POTATO))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.POTATO_FENCE_GATE)));

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTATO_WALL, Items.POTATO);
        createDoorRecipe(ModBlocks.POTATO_DOOR, Ingredient.ofItems(Items.POTATO))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.POTATO_DOOR)));

        createTrapdoorRecipe(ModBlocks.POTATO_TRAPDOOR, Ingredient.ofItems(Items.POTATO))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.POTATO_TRAPDOOR)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.POTATO_BUTTON)
                .input(Items.POTATO).criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.POTATO_BUTTON)));

    }
}
