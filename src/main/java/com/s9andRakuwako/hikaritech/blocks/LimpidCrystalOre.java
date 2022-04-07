package com.s9andRakuwako.hikaritech.blocks;

import com.s9andRakuwako.hikaritech.item.ModItems;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.Random;

public class LimpidCrystalOre extends BlockBase{

    public LimpidCrystalOre(String name, Material material) {
        super(name, material);
        this.setHardness(2.5F);
        this.setHarvestLevel("pickaxe",2);
        this.setSoundType(SoundType.STONE);
    }
    @Nonnull
    @Override
    public Item getItemDropped(IBlockState state, Random rand,int fortune) {
        return ModItems.LIMPID_CRYSTAL;
    }
    @Override
    public int quantityDropped(Random random) {
        return (int)(Math.random()*2+1);
    }
    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        return 3;
    }
    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer Player) {
        return new ItemStack(this);
    }
    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune>0) {
            int bonusFactor = Math.max(random.nextInt(fortune+2)-1,0);
            return this.quantityDropped(random)*(bonusFactor+1);
        } else {
            return this.quantityDropped(random);
        }
    }
}