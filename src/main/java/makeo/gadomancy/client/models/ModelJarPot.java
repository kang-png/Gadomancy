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
 * Created by makeo @ 23.10.2015 23:13
 */
public class ModelJarPot extends ModelBase {
    //fields
    ModelRenderer shape1;
    ModelRenderer shape2;
    ModelRenderer shape3;
    ModelRenderer shape4;
    ModelRenderer shape5;

    public ModelJarPot() {
        this.textureWidth = 32;
        this.textureHeight = 64;

        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.addBox(0F, 0F, 0F, 10, 0, 10);
        this.shape1.setRotationPoint(-5F, 24F, -5F);
        this.shape1.setTextureSize(32, 64);
        this.shape1.mirror = true;
        this.setRotation(this.shape1, 0F, 0F, 0F);
        this.shape2 = new ModelRenderer(this, 0, 28);
        this.shape2.addBox(0F, 0F, 0F, 1, 6, 12);
        this.shape2.setRotationPoint(-6F, 18F, -6F);
        this.shape2.setTextureSize(32, 64);
        this.shape2.mirror = true;
        this.setRotation(this.shape2, 0F, 0F, 0F);
        this.shape3 = new ModelRenderer(this, 0, 10);
        this.shape3.addBox(0F, 0F, 0F, 1, 6, 12);
        this.shape3.setRotationPoint(5F, 18F, -6F);
        this.shape3.setTextureSize(32, 64);
        this.shape3.mirror = true;
        this.setRotation(this.shape3, 0F, 0F, 0F);
        this.shape4 = new ModelRenderer(this, 0, 53);
        this.shape4.addBox(0F, 0F, 0F, 10, 6, 1);
        this.shape4.setRotationPoint(-5F, 18F, 5F);
        this.shape4.setTextureSize(32, 64);
        this.shape4.mirror = true;
        this.setRotation(this.shape4, 0F, 0F, 0F);
        this.shape5 = new ModelRenderer(this, 0, 46);
        this.shape5.addBox(0F, 0F, 0F, 10, 6, 1);
        this.shape5.setRotationPoint(-5F, 18F, -6F);
        this.shape5.setTextureSize(32, 64);
        this.shape5.mirror = true;
        this.setRotation(this.shape5, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.shape1.render(f5);
        this.shape2.render(f5);
        this.shape3.render(f5);
        this.shape4.render(f5);
        this.shape5.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
