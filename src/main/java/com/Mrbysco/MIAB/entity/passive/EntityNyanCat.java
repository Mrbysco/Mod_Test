package com.Mrbysco.MIAB.entity.passive;

import com.Mrbysco.MIAB.entity.entitybases.EntityCatBase;
import com.Mrbysco.MIAB.entity.monsters.EntityTacNyan;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIOcelotAttack;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityNyanCat extends EntityCatBase
{
	public static String NAME = "Nyan Cat";
	private boolean isMounted = false;
	
    private EntityAIAvoidEntity<EntityTacNyan> avoidEntity;

	
	public EntityNyanCat(World worldIn) {
	    super(worldIn);
	}
	
	@Override
	protected void initEntityAI()
    {
    this.tasks.addTask(1, new EntityAISwimming(this));
    this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityTacNyan.class, 6.0F, 1.0D, 1.2D));
    this.tasks.addTask(5, new EntityAIWander(this, 0.8D));
    this.tasks.addTask(7, new EntityAILeapAtTarget(this, 0.3F));
    this.tasks.addTask(8, new EntityAIOcelotAttack(this));
    this.tasks.addTask(10, new EntityAIWander(this, 0.8D));
    }
	
	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.245D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
	};
	
	@Override
    protected SoundEvent getAmbientSound()
    {
	return SoundEvents.ENTITY_CAT_AMBIENT;
    }
	
	@Override
    protected SoundEvent getHurtSound()
    {
		return SoundEvents.ENTITY_CAT_HURT;
    }
	
	@Override
    protected SoundEvent getDeathSound()
    {
		return SoundEvents.ENTITY_CAT_DEATH;
    }
}