package makeo.gadomancy.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * This class is part of the Gadomancy Mod
 * Gadomancy is Open Source and distributed under the
 * GNU LESSER GENERAL PUBLIC LICENSE
 * for more read the LICENSE file
 * <p/>
 * Created by makeo @ 28.11.2015 19:04
 */
public class ModelArcanePackager extends ModelBase {
    ModelRenderer shape1;
    ModelRenderer shape2;
    ModelRenderer shape3;
    ModelRenderer shape4;
    ModelRenderer shape5;
    ModelRenderer shape6;
    ModelRenderer shape7;
    ModelRenderer shape8;
    ModelRenderer shape9;

    public ModelArcanePackager() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.addBox(0F, 0F, 0F, 16, 3, 16);
        this.shape1.setRotationPoint(-8F, 21F, -8F);
        this.shape1.setTextureSize(64, 64);
        this.shape1.mirror = true;
        this.setRotation(this.shape1, 0F, 0F, 0F);
        this.shape2 = new ModelRenderer(this, 0, 20);
        this.shape2.addBox(0F, 0F, 0F, 16, 3, 16);
        this.shape2.setRotationPoint(-8F, 12F, -8F);
        this.shape2.setTextureSize(64, 64);
        this.shape2.mirror = true;
        this.setRotation(this.shape2, 0F, 0F, 0F);
        this.shape3 = new ModelRenderer(this, 0, 40);
        this.shape3.addBox(0F, 0F, 0F, 1, 5, 5);
        this.shape3.setRotationPoint(7F, 13.5F, -2.5F);
        this.shape3.setTextureSize(64, 64);
        this.shape3.mirror = true;
        this.setRotation(this.shape3, 0F, 0F, 0F);
        this.shape4 = new ModelRenderer(this, 13, 40);
        this.shape4.addBox(-2F, 0F, 0F, 3, 2, 2);
        this.shape4.setRotationPoint(7F, 15F, -1F);
        this.shape4.setTextureSize(64, 64);
        this.shape4.mirror = true;
        this.setRotation(this.shape4, 0F, 0F, 0.7853982F);
        this.shape5 = new ModelRenderer(this, 13, 45);
        this.shape5.addBox(0.3F, 0.12F, 0F, 1, 1, 2);
        this.shape5.setRotationPoint(6F, 16F, -1F);
        this.shape5.setTextureSize(64, 64);
        this.shape5.mirror = true;
        this.setRotation(this.shape5, 0F, 0F, 0F);
        this.shape6 = new ModelRenderer(this, 7, 40);
        this.shape6.addBox(0F, 0F, 0F, 1, 6, 16);
        this.shape6.setRotationPoint(-8F, 15F, -8F);
        this.shape6.setTextureSize(64, 64);
        this.shape6.mirror = true;
        this.setRotation(this.shape6, 0F, 0F, 0F);
        this.shape7 = new ModelRenderer(this, 24, 40);
        this.shape7.addBox(0F, 0F, 0F, 1, 6, 16);
        this.shape7.setRotationPoint(7F, 15F, -8F);
        this.shape7.setTextureSize(64, 64);
        this.shape7.mirror = true;
        this.setRotation(this.shape7, 0F, 0F, 0F);
        this.shape8 = new ModelRenderer(this, -9, 56);
        this.shape8.addBox(0F, 0F, 0F, 16, 6, 0);
        this.shape8.setRotationPoint(-8F, 15F, 8F);
        this.shape8.setTextureSize(64, 64);
        this.shape8.mirror = true;
        this.setRotation(this.shape8, 0F, 0F, 0F);
        this.shape9 = new ModelRenderer(this, 6, 55);
        this.shape9.addBox(0F, 0F, 0F, 16, 6, 1);
        this.shape9.setRotationPoint(-8F, 15F, -8F);
        this.shape9.setTextureSize(64, 64);
        this.shape9.mirror = true;
        this.setRotation(this.shape9, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.shape1.render(f5);
        this.shape2.render(f5);
        this.shape3.render(f5);
        this.shape4.render(f5);
        this.shape5.render(f5);
        this.shape9.render(f5);
        this.shape6.render(f5);
        this.shape7.render(f5);
        this.shape8.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
