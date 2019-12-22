package com.mrbysco.miab.client.models;

import com.mrbysco.miab.entity.AbstractMeme;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class ModelShrek<T extends AbstractMeme> extends ModelHumanBase<T> {
	private final RendererModel earLeft;
	private final RendererModel earRight;

	public ModelShrek() {
		textureWidth = 64;
		textureHeight = 64;

		bipedHead = new RendererModel(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -10.0F, -4.0F, 8, 8, 8, 0.0F, true));

		bipedHeadwear = new RendererModel(this);
		bipedHeadwear.setRotationPoint(0.0F, 0.0F, 0.0F);

		earLeft = new RendererModel(this);
		earLeft.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(earLeft, 0.0F, 0.0F, 0.1396F);
		bipedHead.addChild(earLeft);
		earLeft.cubeList.add(new ModelBox(earLeft, 32, 0, -10.25F, -32.0F, -1.0F, 2, 2, 2, 0.0F, true));
		earLeft.cubeList.add(new ModelBox(earLeft, 32, 4, -11.25F, -32.5F, -1.5F, 1, 3, 3, 0.0F, true));

		earRight = new RendererModel(this);
		earRight.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(earRight, 0.0F, 0.0F, -0.1396F);
		bipedHead.addChild(earRight);
		earRight.cubeList.add(new ModelBox(earRight, 42, 0, 8.25F, -32.0F, -1.0F, 2, 2, 2, 0.0F, true));
		earRight.cubeList.add(new ModelBox(earRight, 42, 4, 10.25F, -32.5F, -1.5F, 1, 3, 3, 0.0F, true));

		bipedBody = new RendererModel(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.0F, -2.0F, -3.5F, 8, 10, 7, 0.0F, true));
		bipedBody.cubeList.add(new ModelBox(bipedBody, 17, 33, -4.0F, 8.0F, -3.0F, 8, 4, 6, 0.0F, true));

		bipedLeftArm = new RendererModel(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 47, 16, -1.0F, -4.0F, -2.0F, 4, 14, 4, 0.0F, true));

		bipedRightArm = new RendererModel(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 0, 16, -3.0F, -4.0F, -2.0F, 4, 14, 4, 0.0F, true));

		bipedLeftLeg = new RendererModel(this);
		bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 47, 35, -2.0F, -2.0F, -2.0F, 4, 14, 4, 0.0F, true));

		bipedRightLeg = new RendererModel(this);
		bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 35, -2.0F, -2.0F, -2.0F, 4, 14, 4, 0.0F, true));
	}
}