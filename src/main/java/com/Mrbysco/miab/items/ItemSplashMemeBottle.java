package com.Mrbysco.miab.items;

import com.Mrbysco.miab.entities.throwable.EntitySplashMeme;
import com.Mrbysco.miab.items.base.ItemCustomItem;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemSplashMemeBottle extends ItemCustomItem{

	public ItemSplashMemeBottle(String unlocalized, String registry) {
		super(unlocalized, registry);
		setMaxStackSize(8);
	}
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        ItemStack itemstack1 = playerIn.capabilities.isCreativeMode ? itemstack.copy() : itemstack.splitStack(1);
        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SPLASH_POTION_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!worldIn.isRemote)
        {
        	EntitySplashMeme entitymeme = new EntitySplashMeme(worldIn, playerIn, itemstack1);
        	entitymeme.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, -20.0F, 0.5F, 1.0F);
            worldIn.spawnEntity(entitymeme);
        }
        
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }
}