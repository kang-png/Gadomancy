package makeo.gadomancy.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * This class is part of the Gadomancy Mod
 * Gadomancy is Open Source and distributed under the
 * GNU LESSER GENERAL PUBLIC LICENSE
 * for more read the LICENSE file
 *
 * Created by makeo @ 30.09.2015 17:04
 * using Techne: http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/1261123
 */
public class ModelArcaneDropper extends ModelBase {
    //fields
    ModelRenderer shape1;
    ModelRenderer shape2;
    ModelRenderer shape3;
    ModelRenderer shape4;
    ModelRenderer shape5;
    ModelRenderer shape6;
    ModelRenderer shape7;
    ModelRenderer shape8;
    ModelRenderer shape9;
    ModelRenderer shape10;
    ModelRenderer shape11;

    public ModelArcaneDropper() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.shape1 = new ModelRenderer(this, 44, 0);
        this.shape1.addBox(0F, 0F, 0F, 2, 14, 8);
        this.shape1.setRotationPoint(-1F, 10F, -4F);
        this.shape1.setTextureSize(64, 64);
        this.shape1.mirror = true;
        this.setRotation(this.shape1, 0F, 0F, 0F);
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.addBox(0F, 0F, 0F, 16, 16, 4);
        this.shape2.setRotationPoint(-8F, 8F, 4F);
        this.shape2.setTextureSize(64, 64);
        this.shape2.mirror = true;
        this.setRotation(this.shape2, 0F, 0F, 0F);
        this.shape3 = new ModelRenderer(this, 0, 20);
        this.shape3.addBox(0F, 0F, 0F, 16, 16, 4);
        this.shape3.setRotationPoint(-8F, 8F, -8F);
        this.shape3.setTextureSize(64, 64);
        this.shape3.mirror = true;
        this.setRotation(this.shape3, 0F, 0F, 0F);
        this.shape4 = new ModelRenderer(this, 34, 22);
        this.shape4.addBox(0F, 0F, 0F, 7, 2, 8);
        this.shape4.setRotationPoint(1F, 10F, -4F);
        this.shape4.setTextureSize(64, 64);
        this.shape4.mirror = true;
        this.setRotation(this.shape4, 0F, 0F, 0F);
        this.shape5 = new ModelRenderer(this, 34, 32);
        this.shape5.addBox(0F, 0F, 0F, 7, 4, 8);
        this.shape5.setRotationPoint(1F, 20F, -4F);
        this.shape5.setTextureSize(64, 64);
        this.shape5.mirror = true;
        this.setRotation(this.shape5, 0F, 0F, 0F);
        this.shape6 = new ModelRenderer(this, 34, 52);
        this.shape6.addBox(0F, 0F, 0F, 7, 4, 8);
        this.shape6.setRotationPoint(-8F, 20F, -4F);
        this.shape6.setTextureSize(64, 64);
        this.shape6.mirror = true;
        this.setRotation(this.shape6, 0F, 0F, 0F);
        this.shape7 = new ModelRenderer(this, 0, 40);
        this.shape7.addBox(0F, 0F, 0F, 7, 2, 8);
        this.shape7.setRotationPoint(-8F, 10F, -4F);
        this.shape7.setTextureSize(64, 64);
        this.shape7.mirror = true;
        this.setRotation(this.shape7, 0F, 0F, 0F);
        this.shape8 = new ModelRenderer(this, 21, 50);
        this.shape8.addBox(0F, 0F, 0F, 5, 2, 8);
        this.shape8.setRotationPoint(3F, 8F, -4F);
        this.shape8.setTextureSize(64, 64);
        this.shape8.mirror = true;
        this.setRotation(this.shape8, 0F, 0F, 0F);
        this.shape9 = new ModelRenderer(this, 0, 50);
        this.shape9.addBox(0F, 0F, 0F, 5, 2, 8);
        this.shape9.setRotationPoint(-8F, 8F, -4F);
        this.shape9.setTextureSize(64, 64);
        this.shape9.mirror = true;
        this.setRotation(this.shape9, 0F, 0F, 0F);
        this.shape10 = new ModelRenderer(this, 0, 61);
        this.shape10.addBox(0F, 0F, 0F, 6, 2, 1);
        this.shape10.setRotationPoint(-3F, 8F, -4F);
        this.shape10.setTextureSize(64, 64);
        this.shape10.mirror = true;
        this.setRotation(this.shape10, 0F, 0F, 0F);
        this.shape11 = new ModelRenderer(this, 14, 61);
        this.shape11.addBox(0F, 0F, 0F, 6, 2, 1);
        this.shape11.setRotationPoint(-3F, 8F, 3F);
        this.shape11.setTextureSize(64, 64);
        this.shape11.mirror = true;
        this.setRotation(this.shape11, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.shape1.render(f5);
        this.shape2.render(f5);
        this.shape3.render(f5);
        this.shape4.render(f5);
        this.shape5.render(f5);
        this.shape6.render(f5);
        this.shape7.render(f5);
        this.shape8.render(f5);
        this.shape9.render(f5);
        this.shape10.render(f5);
        this.shape11.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
