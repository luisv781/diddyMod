package com.bruhhidk;

import com.bruhhidk.block.ModBlocks;
import com.bruhhidk.entity.client.DiddyModel;
import com.bruhhidk.entity.client.DiddyEntityRenderer;
import com.bruhhidk.entity.ModEntities;
import com.bruhhidk.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class BrothaIdkClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.POTATO_DOOR, ModBlocks.POTATO_TRAPDOOR);

		EntityRendererRegistry.register(ModEntities.DIDDY_ENTITY, (DiddyEntityRenderer::new));
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MODEL_DIDDY_LAYER, DiddyModel::getTexturedModelData); //EntityModel::gettexturedmodeldata

	}
}