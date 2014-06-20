package com.akic.firstmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import com.akic.firstmod.blocks.BlockLamp;
import com.akic.firstmod.blocks.GlimmerRock;
import com.akic.firstmod.items.ObsidianStick;
import com.akic.firstmod.items.RefinedGlimmer;
import com.akic.firstmod.lib.ProxyCommon;
import com.akic.firstmod.lib.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = com.akic.firstmod.lib.References.MODID, version = com.akic.firstmod.lib.References.VERSION)
public class FirstMod
{
   @SidedProxy(clientSide = References.Client, serverSide = References.Common)
	
   
   
   
   public static ProxyCommon proxy;
   
   //Enum Tool Material
   public static ToolMaterial glimmerm = EnumHelper.addToolMaterial("Glimmer Rock", 3, 2000, 8f, 5f, 22);
   
   //Tools
   
   //items
   public static Item ObsidianStick = new ObsidianStick(4999);
   public static Item RefinedGlimmer = new RefinedGlimmer(3001);
    
   //Blocks
   public static final Block Lamp = new BlockLamp(4998, Material.glass);
   public static final Block GlimmerRock = new GlimmerRock(3000, Material.rock);

    @EventHandler
    public void init(FMLInitializationEvent event)
    { 	
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.farmland), Blocks.dirt, Items.stone_hoe);
    	GameRegistry.addShapedRecipe(new ItemStack(Blocks.command_block), "X X", "YXY", "X X", 'X', Blocks.bookshelf, 'Y', Blocks.netherrack);
    	GameRegistry.addSmelting(Blocks.coal_block, new ItemStack(Blocks.obsidian), 20f);
    	GameRegistry.addSmelting(GlimmerRock, new ItemStack(com.akic.firstmod.items.RefinedGlimmer), 20f);
        GameRegistry.registerBlock(Lamp, "Lamp");
        GameRegistry.registerBlock(GlimmerRock, "Glimmering Rock");
        GameRegistry.registerItem(RefinedGlimmer, "Refined Glimmering Stone");
        
        
        //language
        LanguageRegistry.addName(Lamp, "Rainbow Lamp");
        LanguageRegistry.addName(GlimmerRock, "Glimmering Rock");
        LanguageRegistry.addName(RefinedGlimmer, "Refined Glimmering Rock");
    }
    @EventHandler
    public void load(FMLInitializationEvent event) {
    	proxy.registerRenderInformation();
    }
    
	public FirstMod() {
    	//Item Registry
    		//GameReg
    			GameRegistry.registerItem(ObsidianStick, "OStick");
    			
    		//LangReg
    			LanguageRegistry.addName(ObsidianStick, "Obsidian Stick");
    	
    	
    }
    
}
