package com.s9andRakuwako.hikaritech.blocks.tileEntity.builder;

import com.s9andRakuwako.hikaritech.blocks.tileEntity.builder.builderAction.BuilderActionBase;
import com.s9andRakuwako.hikaritech.blocks.tileEntity.builder.builderAction.BuilderActionBlock;
import net.minecraft.init.Blocks;

import java.util.Vector;

public class TileEntityBuilderOne extends TileEntityBuilderBase {

	public void InitTaskQueue(){
		int radius = 10;
		list = new Vector<BuilderActionBase>();
		for (int x = -radius; x <= radius; x++)
			for (int z = -radius; z <= radius; z++) {
				list.add(new BuilderActionBlock(Blocks.BRICK_BLOCK, x,-1,z));
			}
	}

	static
	{
		register("hikaritech:builder.builder_one", TileEntityBuilderOne.class);
	}
}
