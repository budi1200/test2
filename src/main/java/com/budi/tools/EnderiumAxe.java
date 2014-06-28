package com.budi.tools;

import com.budi.core.budimain;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class EnderiumAxe extends ItemAxe
{
    public EnderiumAxe(ToolMaterial material)
    {
        super(material);
        this.setCreativeTab(budimain.tabrandom);
    }
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
        par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.poison.id, 100, 2));
        return true;
    }
}
