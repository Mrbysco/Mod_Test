package com.mrbysco.miab.entity.memes;

import com.mrbysco.miab.entity.AbstractMeme;
import com.mrbysco.miab.init.MemeLoot;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.OcelotAttackGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityBongoCat extends AbstractMeme{
	private static final DataParameter<Boolean> TAPPING = EntityDataManager.<Boolean>createKey(EntityBongoCat.class, DataSerializers.BOOLEAN);

	private int TickSinceTap = 0;
	private int TicksNotTapped = 0;

	public EntityBongoCat(EntityType<? extends EntityBongoCat> entityType, World worldIn) {
		super(entityType, worldIn);
		//TODO: this.setSize(0.6F, 1.5F);
	}

	protected void registerGoals()
	{
		this.goalSelector.addGoal(1, new SwimGoal(this));
		this.goalSelector.addGoal(7, new LeapAtTargetGoal(this, 0.3F));
		this.goalSelector.addGoal(8, new OcelotAttackGoal(this));
		this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 0.8D));
		this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8.0F));
		this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
		this.registerTargetGoals();
	}

	private void registerTargetGoals() {
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, ChickenEntity.class, false));
		this.targetSelector.addGoal(2, (new HurtByTargetGoal(this)).setCallsForHelp(EntityBongoCat.class));
	}
	
	@Override
	protected void registerAttributes() 
	{
		super.registerAttributes();
		
		getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
		getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.4D);
		getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(30.0D);
		getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
	}

	@Override
	protected void registerData() {
		super.registerData();
		this.dataManager.register(TAPPING, Boolean.valueOf(false));
	}

	public void setTapping(boolean isTapping)
	{
		this.getDataManager().set(TAPPING, Boolean.valueOf(isTapping));
	}

	public boolean isTapping()
	{
		return ((Boolean)this.getDataManager().get(TAPPING)).booleanValue();
	}

	@Override
	public void livingTick() {
		if(isTapping())
		{
			TickSinceTap++;

			if(world.rand.nextInt(50) < 4)
			{
				this.playSound(SoundEvents.BLOCK_NOTE_BLOCK_BASEDRUM, getSoundVolume(), getSoundPitch());
			}

			if(TickSinceTap > 30)
			{
				this.setTapping(false);
				TickSinceTap = 0;
			}
		}
		else
		{
			TicksNotTapped++;
		}

		if(TicksNotTapped > 30)
		{
			this.setTapping(true);
			TicksNotTapped = 0;
		}

		super.livingTick();
	}

	@Override
    protected SoundEvent getAmbientSound()
    {
        return null;
    }
	
	@Override
    protected SoundEvent getHurtSound(DamageSource source)
    {
        return SoundEvents.ENTITY_CAT_HURT;
    }
	
	@Override
    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_CAT_DEATH;
    }
	
	@Override
	public boolean canPickupItems() {
		return false;
	}

	@Override
	protected float getSoundVolume()
	{
		return 0.4F;
	}

	@Override
	@Nullable
	protected ResourceLocation getLootTable()
	{
		return MemeLoot.BONGO_LOOT;
	}
}
