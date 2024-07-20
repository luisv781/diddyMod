package com.bruhhidk.entity.client;

import com.bruhhidk.entity.custom.DiddyEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class DiddyModel<T extends DiddyEntity> extends SinglePartEntityModel<T> {
    private final ModelPart main;

    public DiddyModel(ModelPart root) {
        this.main = root.getChild("main");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData main = modelPartData.addChild("main", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -3.5F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 22.0F, 0.0F));

        ModelPartData arm1 = main.addChild("arm1", ModelPartBuilder.create().uv(8, 8).cuboid(-2.5F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new Dilation(-0.2F)), ModelTransform.pivot(-2.0F, -1.8F, 0.0F));

        ModelPartData arm2 = main.addChild("arm2", ModelPartBuilder.create().uv(0, 8).cuboid(-2.5F, -0.4F, -0.5F, 3.0F, 1.0F, 1.0F, new Dilation(-0.2F)), ModelTransform.pivot(4.0F, -1.8F, 0.0F));

        ModelPartData leg1 = main.addChild("leg1", ModelPartBuilder.create().uv(0, 10).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(4, 10).cuboid(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.5F, 0.0F));

        ModelPartData leg2 = main.addChild("leg2", ModelPartBuilder.create().uv(8, 10).cuboid(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.5F, 0.0F));
        return TexturedModelData.of(modelData, 16, 16); //16, 16
    }
    @Override
    public void setAngles(DiddyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) { //float red, float green, float blue, float alpha
        //main.render(matrices, vertexConsumer, light, overlay);

        ImmutableList.of(this.main).forEach((modelPart -> {
            modelPart.render(matrices, vertexConsumer, light, overlay, color);
        }));
    }

    @Override
    public ModelPart getPart() {
        return main;
    }

}