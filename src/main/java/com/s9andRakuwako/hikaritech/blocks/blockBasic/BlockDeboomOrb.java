package com.s9andRakuwako.hikaritech.blocks.blockBasic;

import com.s9andRakuwako.hikaritech.blocks.BlockBase;
import com.s9andRakuwako.hikaritech.blocks.tileEntity.orbs.TileEntityDeBoomOrb;
import com.s9andRakuwako.hikaritech.init.ModCreativeTab;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

public class BlockDeboomOrb extends BlockBase implements ITileEntityProvider {

	public static final int NULLIFY_DISTANCE = 7;

	public BlockDeboomOrb(String name, Material material) {
		super(name, material);
		this.hasTileEntity = true;
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(1500.0F);
		setHarvestLevel("pickaxe", 3);
		setLightOpacity(1);
		setCreativeTab(ModCreativeTab.BME_MISC);
	}

	//optional
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return super.getItemDropped(state, rand, fortune);
	}
	
	@Override
	public int quantityDropped(Random rand) {
//		int max = 4;
//		int min = 1;
//		return rand.nextInt(max) + min;
		
		return super.quantityDropped(rand);
	}

	/**
	 * Returns a new instance of a block's tile entity class. Called on placing the block.
	 */
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityDeBoomOrb();
	}


}
