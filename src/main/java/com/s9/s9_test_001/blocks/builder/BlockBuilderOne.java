package com.s9.s9_test_001.blocks.builder;

import com.s9.s9_test_001.blocks.BlockBase;
import com.s9.s9_test_001.blocks.tileEntity.builder.TileEntityBuilderOne;
import com.s9.s9_test_001.init.ModCreativeTab;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBuilderOne extends BlockBase implements ITileEntityProvider {

    public BlockBuilderOne(String name, Material material) {
        super(name, material);
        setCreativeTab(ModCreativeTab.IDL_MISC);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 3);
        setLightOpacity(1);
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        TileEntityBuilderOne t = new TileEntityBuilderOne();
        t.buildRatePerTick = 1f;
        return t;
    }
}
