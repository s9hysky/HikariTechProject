package com.RakuwakoVampire.bloodmemoryencounter.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block BLOOD_BLOCK = new BlockBase("blood_block", Material.IRON);
	public static final Block BLOOD_ORE = new BlockBase("blood_ore", Material.ROCK);

	/*
	 * To add a block, put a line here,
	 * -Create a json at assets.eo.blockstates
	 * -Create a json at assets.eo.models.block
	 * -Create a json at assets.eo.models.item
	 * -Add corresponding texture png
	 */

	//public static final Block GRID_BLOCK_1 = new BlockBase("test", Material.CLAY).setCreativeTab(ModCreativeTab.IDL_MISC).setHardness(15f);
}