package com.mrbysco.miab.entity.memes;

import com.mrbysco.miab.entity.AbstractMeme;
import com.mrbysco.miab.init.MemeItems;
import com.mrbysco.miab.init.MemeLoot;
import com.mrbysco.miab.init.MemeSounds;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityRobbie extends AbstractMeme{

	public EntityRobbie(World worldIn) {
		super(worldIn);
	}

	protected void initEntityAI()
	{
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.0D, false));
		this.tasks.addTask(5, new EntityAIWander(this, 0.8D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
		this.applyEntityAI();
	}

	private void applyEntityAI() {
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false, new Class[0]));
	}
	
	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(22.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.4D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(30.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
	}
	
	@Override
    protected SoundEvent getAmbientSound()
    {
		if (!isHoldingSax())
		{
			return MemeSounds.robbie_passive;
		}
		else
		{
			return MemeSounds.robbie_sax;
		}
    }
	
	@Override
    protected SoundEvent getHurtSound(DamageSource source)
    {
        return MemeSounds.robbie_hit;
    }
	
	@Override
    protected SoundEvent getDeathSound()
    {
        return MemeSounds.robbie_death;
    }

	@Nullable
	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		if (rand.nextInt(10) < 3)
		{
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(MemeItems.sax));
		}

		return super.onInitialSpawn(difficulty, livingdata);
	}

	public boolean isHoldingSax() {
		return this.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem() == MemeItems.sax;
	}

	@Override
	public boolean canPickupItems() {
		return true;
	}

	@Override
	protected ResourceLocation getLootTable()
	{
		return MemeLoot.ROBBIE_LOOT;
	}
}