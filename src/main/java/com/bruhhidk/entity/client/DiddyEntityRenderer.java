package com.bruhhidk.entity.client;

import com.bruhhidk.BrothaIdk;
import com.bruhhidk.BrothaIdkClient;
import com.bruhhidk.entity.custom.DiddyEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class DiddyEntityRenderer extends MobEntityRenderer<DiddyEntity, DiddyModel<DiddyEntity>> {

    private static final Identifier TEXTURE = Identifier.of(BrothaIdk.MOD_ID, "textures/entity/diddy.png");

    public DiddyEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new DiddyModel<>(context.getPart(ModModelLayers.MODEL_DIDDY_LAYER)), 0.15f); // super(context, entityModel, f);
    }

    @Override
    public Identifier getTexture(DiddyEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(DiddyEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

        // resize because i was dumb
        matrixStack.scale(3.6f, 3.6f, 3.6f);

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
