package com.Mrbysco.MIAB.items;

import com.Mrbysco.MIAB.MIAB;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemKnife extends ItemSword{
	private final float attackDamage;
	private final Item.ToolMaterial material;
    
    public ItemKnife(Item.ToolMaterial material, String UnlocalisedName, String RegistryName)
    {
    	super(material);
    	this.setUnlocalizedName(UnlocalisedName);
    	this.setRegistryName(RegistryName);
        this.material = material;
    	this.setNoRepair();
        this.maxStackSize = 1;
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(CreativeTabs.COMBAT);
        this.setCreativeTab(MIAB.tabMIAB);
        this.attackDamage = 2.0F + material.getDamageVsEntity();
	}
}
