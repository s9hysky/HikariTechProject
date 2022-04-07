package com.s9andRakuwako.hikaritech.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import java.util.Random;

public class LimpidCrystalBlock extends BlockBase {
    public LimpidCrystalBlock(String name, Material material) {
        super(name, material);
        this.setHardness(2.5F);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe",2);
        this.setLightOpacity(0);
    }
    @Nonnull
    @Override
    public int quantityDropped(Random random) {
        return 1;
    }
    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
