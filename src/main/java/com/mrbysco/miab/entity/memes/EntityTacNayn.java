package com.mrbysco.miab.entity.memes;

import com.mrbysco.miab.init.MemeLoot;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.OcelotAttackGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityTacNayn extends CatEntity {

	public EntityTacNayn(EntityType<? extends CatEntity> entityType, World worldIn)
	{
		super(entityType, worldIn);
		//TODO: this.setSize(0.6F, 0.7F);
	}

	protected void registerGoals()
	{
		this.goalSelector.addGoal(1, new SwimGoal(this));
		this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 0.8D));
		this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8.0F));
		this.goalSelector.addGoal(7, new LeapAtTargetGoal(this, 0.3F));
		this.goalSelector.addGoal(8, new OcelotAttackGoal(this));
		this.goalSelector.addGoal(10, new WaterAvoidingRandomWalkingGoal(this, 0.8D));
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, EntityNyanCat.class, true));
		this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setCallsForHelp(EntityTacNayn.class));
	}

	protected void registerAttributes()
	{
		super.registerAttributes();
		this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
	}

	@Nullable
	protected ResourceLocation getLootTable()
	{
		return MemeLoot.NAYN_LOOT;
	}
}
