package com.mrbysco.miab.client.models.knuckles;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelKnucklesSaiyan extends ModelBase {
    public ModelRenderer chest;
    public ModelRenderer left_arm;
    public ModelRenderer right_arm;
    public ModelRenderer left_leg;
    public ModelRenderer right_leg;
    public ModelRenderer head;
    public ModelRenderer chest_front;
    public ModelRenderer chest_back;
    public ModelRenderer chest_right;
    public ModelRenderer chest_left;
    public ModelRenderer chest_part;
    public ModelRenderer chest_part2;
    public ModelRenderer chest_part3;
    public ModelRenderer chest_part4;
    public ModelRenderer left_arm_2;
    public ModelRenderer right_hand;
    public ModelRenderer right_arm_2;
    public ModelRenderer right_hand_1;
    public ModelRenderer left_foot;
    public ModelRenderer right_foot;
    public ModelRenderer head_top;
    public ModelRenderer mouth;
    public ModelRenderer mouth_top;
    public ModelRenderer nose;
    public ModelRenderer hair_1;
    public ModelRenderer hair_2;
    public ModelRenderer hair_3;
    public ModelRenderer hair_4;
    public ModelRenderer hair_5;
    public ModelRenderer hair_6;
    public ModelRenderer hair_7;
    public ModelRenderer hair_8;

    public ModelKnucklesSaiyan() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.right_hand_1 = new ModelRenderer(this, 39, 54);
        this.right_hand_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.right_hand_1.addBox(-10.0F, 1.2F, -0.5F, 3, 3, 3, 0.0F);
        this.chest_front = new ModelRenderer(this, 28, 36);
        this.chest_front.setRotationPoint(-4.0F, -3.0F, -2.0F);
        this.chest_front.addBox(0.0F, 0.0F, 0.0F, 8, 6, 2, 0.0F);
        this.right_hand = new ModelRenderer(this, 14, 54);
        this.right_hand.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.right_hand.addBox(6.5F, 1.2F, -0.5F, 3, 3, 3, 0.0F);
        this.left_arm = new ModelRenderer(this, 0, 60);
        this.left_arm.mirror = true;
        this.left_arm.setRotationPoint(3.0F, 10.0F, -1.0F);
        this.left_arm.addBox(3.0F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
        this.mouth_top = new ModelRenderer(this, 22, 0);
        this.mouth_top.setRotationPoint(-0.5F, -1.0F, -2.5F);
        this.mouth_top.addBox(-2.0F, 0.0F, -0.4F, 4, 1, 1, 0.0F);
        this.hair_5 = new ModelRenderer(this, 20, 13);
        this.hair_5.mirror = true;
        this.hair_5.setRotationPoint(2.4F, -2.2F, -0.5F);
        this.hair_5.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(hair_5, 0.0F, 0.0F, -0.5235987755982988F);
        this.hair_6 = new ModelRenderer(this, 0, 13);
        this.hair_6.setRotationPoint(-0.5F, -3.8F, -0.5F);
        this.hair_6.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(hair_6, 0.7853981633974483F, 0.0F, 0.0F);
        this.hair_7 = new ModelRenderer(this, 0, 13);
        this.hair_7.setRotationPoint(-2.5F, -3.2F, -0.5F);
        this.hair_7.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(hair_7, 0.7853981633974483F, 0.0F, -0.7853981633974483F);
        this.right_foot = new ModelRenderer(this, 50, 6);
        this.right_foot.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.right_foot.addBox(-0.5F, 4.0F, -2.8F, 2, 2, 4, 0.0F);
        this.hair_4 = new ModelRenderer(this, 20, 13);
        this.hair_4.setRotationPoint(-3.4F, -2.2F, -0.5F);
        this.hair_4.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(hair_4, 0.0F, 0.0F, 0.5235987755982988F);
        this.chest = new ModelRenderer(this, 0, 36);
        this.chest.setRotationPoint(0.0F, 13.0F, -2.0F);
        this.chest.addBox(-5.0F, -5.0F, 0.0F, 10, 10, 4, 0.0F);
        this.left_leg = new ModelRenderer(this, 40, 0);
        this.left_leg.setRotationPoint(2.0F, 17.0F, 0.0F);
        this.left_leg.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.chest_back = new ModelRenderer(this, 28, 44);
        this.chest_back.setRotationPoint(-4.0F, -3.0F, 3.2F);
        this.chest_back.addBox(0.0F, 0.0F, 0.0F, 8, 6, 2, 0.0F);
        this.right_leg = new ModelRenderer(this, 56, 0);
        this.right_leg.setRotationPoint(-2.0F, 17.0F, 0.0F);
        this.right_leg.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.chest_part3 = new ModelRenderer(this, 0, 52);
        this.chest_part3.setRotationPoint(-4.5F, 0.0F, -0.5F);
        this.chest_part3.addBox(-0.5F, -3.0F, -0.5F, 1, 6, 1, 0.0F);
        this.hair_3 = new ModelRenderer(this, 12, 13);
        this.hair_3.setRotationPoint(-2.5F, -4.0F, -0.5F);
        this.hair_3.addBox(-1.0F, -2.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(hair_3, 0.0F, 0.0F, -1.2217304763960306F);
        this.right_arm_2 = new ModelRenderer(this, 38, 60);
        this.right_arm_2.setRotationPoint(-5.4F, -0.2F, 0.0F);
        this.right_arm_2.addBox(-4.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(right_arm_2, 0.0F, 0.0F, -0.6108652381980153F);
        this.head = new ModelRenderer(this, 0, 5);
        this.head.setRotationPoint(0.5F, 6.0F, 0.0F);
        this.head.addBox(-4.0F, -2.0F, -2.0F, 7, 4, 4, 0.0F);
        this.mouth = new ModelRenderer(this, 22, 2);
        this.mouth.setRotationPoint(-0.5F, -0.5F, -2.5F);
        this.mouth.addBox(-3.0F, 0.0F, -0.5F, 6, 2, 1, 0.0F);
        this.chest_part2 = new ModelRenderer(this, 0, 50);
        this.chest_part2.setRotationPoint(0.0F, 3.5F, -0.5F);
        this.chest_part2.addBox(-4.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
        this.head_top = new ModelRenderer(this, 0, 0);
        this.head_top.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.head_top.addBox(-3.0F, -1.0F, -2.0F, 5, 1, 3, 0.0F);
        this.nose = new ModelRenderer(this, 17, 0);
        this.nose.setRotationPoint(-0.5F, -0.2F, -3.0F);
        this.nose.addBox(-0.5F, -0.6F, -0.5F, 1, 1, 1, 0.0F);
        this.left_arm_2 = new ModelRenderer(this, 14, 60);
        this.left_arm_2.mirror = true;
        this.left_arm_2.setRotationPoint(5.3F, -0.2F, 0.0F);
        this.left_arm_2.addBox(0.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(left_arm_2, 0.0F, 0.0F, 0.6108652381980153F);
        this.left_foot = new ModelRenderer(this, 36, 6);
        this.left_foot.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.left_foot.addBox(-0.5F, 4.0F, -2.8F, 2, 2, 4, 0.0F);
        this.chest_left = new ModelRenderer(this, 56, 36);
        this.chest_left.setRotationPoint(5.0F, -4.5F, 2.0F);
        this.chest_left.addBox(0.0F, 0.0F, -1.5F, 1, 8, 3, 0.0F);
        this.hair_1 = new ModelRenderer(this, 0, 13);
        this.hair_1.setRotationPoint(-0.5F, -3.5F, -0.5F);
        this.hair_1.addBox(-2.0F, -2.0F, -1.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(hair_1, 0.0F, 0.0F, 0.7853981633974483F);
        this.chest_part4 = new ModelRenderer(this, 4, 52);
        this.chest_part4.setRotationPoint(-4.5F, 0.0F, -0.5F);
        this.chest_part4.addBox(8.5F, -3.0F, -0.5F, 1, 6, 1, 0.0F);
        this.hair_2 = new ModelRenderer(this, 12, 13);
        this.hair_2.mirror = true;
        this.hair_2.setRotationPoint(1.5F, -4.0F, -0.5F);
        this.hair_2.addBox(-1.0F, -2.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(hair_2, 0.0F, 0.0F, 1.2217304763960306F);
        this.right_arm = new ModelRenderer(this, 50, 60);
        this.right_arm.setRotationPoint(-3.0F, 10.0F, -1.0F);
        this.right_arm.addBox(-6.0F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
        this.hair_8 = new ModelRenderer(this, 0, 13);
        this.hair_8.setRotationPoint(1.5F, -3.2F, -0.5F);
        this.hair_8.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(hair_8, 0.7853981633974483F, 0.0F, 0.7853981633974483F);
        this.chest_right = new ModelRenderer(this, 48, 36);
        this.chest_right.setRotationPoint(-6.0F, -4.5F, 2.0F);
        this.chest_right.addBox(0.0F, 0.0F, -1.5F, 1, 8, 3, 0.0F);
        this.chest_part = new ModelRenderer(this, 8, 52);
        this.chest_part.setRotationPoint(0.0F, -3.5F, -0.5F);
        this.chest_part.addBox(-4.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
        this.right_arm.addChild(this.right_hand_1);
        this.chest.addChild(this.chest_front);
        this.left_arm.addChild(this.right_hand);
        this.head.addChild(this.mouth_top);
        this.head.addChild(this.hair_5);
        this.head.addChild(this.hair_6);
        this.head.addChild(this.hair_7);
        this.right_leg.addChild(this.right_foot);
        this.head.addChild(this.hair_4);
        this.chest.addChild(this.chest_back);
        this.chest.addChild(this.chest_part3);
        this.head.addChild(this.hair_3);
        this.right_arm.addChild(this.right_arm_2);
        this.head.addChild(this.mouth);
        this.chest.addChild(this.chest_part2);
        this.head.addChild(this.head_top);
        this.head.addChild(this.nose);
        this.left_arm.addChild(this.left_arm_2);
        this.left_leg.addChild(this.left_foot);
        this.chest.addChild(this.chest_left);
        this.head.addChild(this.hair_1);
        this.chest.addChild(this.chest_part4);
        this.head.addChild(this.hair_2);
        this.head.addChild(this.hair_8);
        this.chest.addChild(this.chest_right);
        this.chest.addChild(this.chest_part);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.left_arm.render(f5);
        this.chest.render(f5);
        this.left_leg.render(f5);
        this.right_leg.render(f5);
        this.head.render(f5);
        this.right_arm.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
	    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);  
	    this.right_leg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 * 0.5F;
        this.left_leg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 * 0.5F;
        this.right_leg.rotateAngleY = 0.0F;
        this.left_leg.rotateAngleY = 0.0F;
    }
}