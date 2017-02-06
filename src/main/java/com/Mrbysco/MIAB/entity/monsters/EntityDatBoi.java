package com.Mrbysco.MIAB.entity.monsters;

import com.Mrbysco.MIAB.init.MiabSoundEvents;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityDatBoi extends EntityMemeBase 
{
	public static String NAME = "Dat Boi";
	
	private final EntityAIBreakDoor breakDoorAI = new EntityAIBreakDoor(this);
	private boolean canBreakDoors = true;
	
	private boolean isMounted = false;
	
	public EntityDatBoi(World world) {
	    super(world);
	    super.setSize(0.6F, 2.7F);
	    targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, false));
		}

	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
	};
	
	@Override
    protected SoundEvent getAmbientSound()
    {
        return MiabSoundEvents.boi_passive;
    }
	
	@Override
    protected SoundEvent getHurtSound()
    {
        return MiabSoundEvents.boi_passive;
    }
	
	@Override
    protected SoundEvent getDeathSound()
    {
        return MiabSoundEvents.boi_death;
    }

}