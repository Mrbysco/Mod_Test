package com.mrbysco.miab.client.models;

import com.mrbysco.miab.entity.AbstractMeme;
import com.mrbysco.miab.init.MemeItems;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class ModelRobbie<T extends AbstractMeme> extends ModelHumanBase<T> {

	public ModelRobbie() { }

	public ModelRobbie(float modelSize, boolean p_i46303_2_)
    {
        super(modelSize, p_i46303_2_);
    }

	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
    {
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
        ItemStack itemstack = entityIn.getHeldItemMainhand();

        if (!(itemstack.getItem() == MemeItems.sax))
        {
            float f = MathHelper.sin(this.swingProgress * (float)Math.PI);
            float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
            this.bipedRightArm.rotateAngleZ = 0.0F;
            this.bipedRightArm.rotateAngleY = 0.1F - f * 0.6F;
            this.bipedRightArm.rotateAngleX = -((float)Math.PI / 2F);
            this.bipedRightArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
            this.bipedRightArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
            this.bipedRightArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        }
    }
}