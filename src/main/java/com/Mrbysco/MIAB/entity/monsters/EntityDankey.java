package com.Mrbysco.MIAB.entity.monsters;

import com.Mrbysco.MIAB.entity.entitybases.EntityMemeBase;
import com.Mrbysco.MIAB.init.MiabSoundEvents;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityDankey extends EntityMemeBase 
{	
	public static String NAME = "Dankey Kang";
	
	private boolean isMounted = false;
	
	public EntityDankey(World world) {
	    super(world);
	    }
	
	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(32.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.245D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
	};
	
		@Override
	    protected SoundEvent getAmbientSound()
	    {
		return MiabSoundEvents.dankey_passive;
	    }
		
		@Override
	    protected SoundEvent getHurtSound(DamageSource p_184601_1_)
	    {
	        return MiabSoundEvents.dankey_hit;
	    }
		
		@Override
	    protected SoundEvent getDeathSound()
	    {
	        return MiabSoundEvents.dankey_death;
	    }

}