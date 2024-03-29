package com.s9andRakuwako.hikaritech.entity;

import com.s9andRakuwako.hikaritech.IdlFramework;
import com.s9andRakuwako.hikaritech.entity.creatures.moroon.EntityMoroonUnitBase;
import com.s9andRakuwako.hikaritech.entity.creatures.render.*;
import com.s9andRakuwako.hikaritech.entity.projectiles.EntityIdlProjectile;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityMoroonUnitBase.class, RenderMoroonHumanoid::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityIdlProjectile.class, renderManager -> new RenderBullet<>(renderManager, new ResourceLocation(IdlFramework.MODID,
                "textures/entity/projectiles/bullet_norm.png")));
    }
}
