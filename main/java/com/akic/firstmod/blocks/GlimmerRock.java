package com.akic.firstmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GlimmerRock extends Block {

	public GlimmerRock(int i, Material rock) {
		super(rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeStone);
		this.setHardness(2f);
		this.setResistance(5f);
		this.setLightLevel(0.6f);
		this.setBlockName("Glimmering Rock");
		this.setBlockTextureName("firstmod:GlimmerRock");
		
		// TODO Auto-generated constructor stub
	}

}
