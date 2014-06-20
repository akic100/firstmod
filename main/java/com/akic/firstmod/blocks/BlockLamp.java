package com.akic.firstmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLamp extends Block {

	public BlockLamp(int i, Material glass) {
		super(glass);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setStepSound(soundTypeGlass);
		this.setHardness(.2f);
		this.setResistance(5f);
		this.setLightLevel(0.9f);
		this.setBlockName("Rainbow Lamp");
		this.setBlockTextureName("firstmod:Lamp");
	}
	
}
