package com.s9andRakuwako.hikaritech.worldgen;

import com.s9andRakuwako.hikaritech.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

//public class WorldLimpidCrystal implements IWorldGenerator {
//    public WorldGenMinable genMinable = new WorldGenMinable(ModBlocks.LIMPID_CRYSTAL_ORE.getDefaultState(),4, BlockMatcher.forBlock(Blocks.STONE));
//
//    @Override
//    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
//        genMinable.generate(world, random, new BlockPos(chunkX*16+random.nextInt(16),random.nextInt(50),chunkZ*16+random.nextInt(16)));
//    }
//}

public class WorldLimpidCrystal implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        for (int i=0;i<12;i++) {
            BlockPos pos = new BlockPos(chunkX*16+random.nextInt(16),random.nextInt(50),chunkZ*16+random.nextInt(16));
            new WorldGenMinable(ModBlocks.LIMPID_CRYSTAL_ORE.getDefaultState(),8,BlockMatcher.forBlock(Blocks.STONE)).generate(world,random,pos);
        }
    }
}