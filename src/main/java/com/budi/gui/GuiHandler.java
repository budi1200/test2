package com.budi.gui;

import com.budi.container.ContainerEnderFurnace;
import com.budi.tileentity.TileEntityEnderFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;


import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public GuiHandler (){

	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityEnderFurnace tileEntityFurnace = (TileEntityEnderFurnace) world.getTileEntity(x, y, z);
			return new ContainerEnderFurnace(player.inventory, tileEntityFurnace);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityEnderFurnace tileentityenderfurnace = (TileEntityEnderFurnace) world.getTileEntity(x, y, z);
			return new GuiEnderFurnace(player.inventory, tileentityenderfurnace);
		}
		return null;
	}

}