package com.s9.s9_test_001.blocks.blockMoroon;

import com.s9.s9_test_001.blocks.BlockBase;
import net.minecraft.block.material.Material;

public class BlockMoroonBase extends BlockBase {
    public BlockMoroonBase(String name, Material material) {
        super(name, material);
        setResistance(1.0F);
    }
}
