package com.RakuwakoVampire.bloodmemoryencounter.entity;

import com.RakuwakoVampire.bloodmemoryencounter.IdlFramework;
import com.RakuwakoVampire.bloodmemoryencounter.entity.creatures.moroon.EntityMoroonUnitBase;
import com.RakuwakoVampire.bloodmemoryencounter.entity.creatures.render.*;
import com.RakuwakoVampire.bloodmemoryencounter.entity.projectiles.EntityIdlProjectile;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityMoroonUnitBase.class, RenderMoroonHumanoid::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityIdlProjectile.class, renderManager -> new RenderBullet<>(renderManager, new ResourceLocation(IdlFramework.MODID,
                "textures/entity/projectiles/bullet_norm.png")));
    }
}
