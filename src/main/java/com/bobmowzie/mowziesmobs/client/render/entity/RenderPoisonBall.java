package com.bobmowzie.mowziesmobs.client.render.entity;

import com.bobmowzie.mowziesmobs.MowziesMobs;
import com.bobmowzie.mowziesmobs.client.model.entity.ModelPoisonBall;
import com.bobmowzie.mowziesmobs.server.entity.effects.EntityPoisonBall;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPoisonBall extends Render<EntityPoisonBall> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(MowziesMobs.MODID, "textures/effects/poison_ball.png");
    public ModelPoisonBall model;

    public RenderPoisonBall(RenderManager mgr) {
        super(mgr);
        model = new ModelPoisonBall();
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityPoisonBall entity) {
        return TEXTURE;
    }

    @Override
    public void doRender(EntityPoisonBall entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);
        GlStateManager.rotate(entityYaw, 0, -1, 0);
        bindTexture(TEXTURE);
        model.render(entity, 0.0725F, partialTicks);
        GlStateManager.popMatrix();
    }
}
