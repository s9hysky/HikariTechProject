package com.s9andRakuwako.hikaritech.entity.creatures.render;

import com.s9andRakuwako.hikaritech.entity.creatures.EntityModUnit;
import com.s9andRakuwako.hikaritech.entity.creatures.model.ModelIDLConstruction;
import com.s9andRakuwako.hikaritech.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderConstruction extends RenderLiving<EntityModUnit> {
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/idl_construction.png");
    public RenderConstruction(RenderManager manager){
        super(manager, new ModelIDLConstruction(), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityModUnit entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityModUnit entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);

    }
}
