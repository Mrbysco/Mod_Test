package com.Mrbysco.miab.entities.hostile;

import com.Mrbysco.miab.entities.base.EntityMemeBase;
import com.Mrbysco.miab.init.MemeSounds;

import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityRoadmanShaq extends EntityMemeBase 
{
	public static String NAME = "Roadman Shaq";
	
	private boolean isMounted = false;
	
	public EntityRoadmanShaq(World world) {
	    super(world);
	    }
	
	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
	};
	
		@Override
	    protected SoundEvent getAmbientSound()
	    {
	        return MemeSounds.shaq_passive;
	    }
		
		@Override
	    protected SoundEvent getHurtSound(DamageSource p_184601_1_)
	    {
	        return MemeSounds.shaq_hit;
	    }
		
		@Override
	    protected SoundEvent getDeathSound()
	    {
	        return MemeSounds.shaq_death;
	    }

		@Override
		public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
			this.playSound(MemeSounds.shaq_summon, 1F, 1F);
			if (rand.nextInt(2) < 1) 
			{
				setCustomNameTag(NAME);
			}
			return super.onInitialSpawn(difficulty, livingdata);
		}
}