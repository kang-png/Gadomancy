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
 * Created by makeo @ 28.10.2015 12:31
 */
public class ModelManipulatorPart extends ModelBase {
    //fields
    ModelRenderer shape2;
    ModelRenderer shape3;
    ModelRenderer shape4;
    ModelRenderer shape5;

    public ModelManipulatorPart() {
        this.textureWidth = 8;
        this.textureHeight = 16;

        this.shape2 = new ModelRenderer(this, 0, 5);
        this.shape2.addBox(-1F, -2F, 0.41F, 2, 2, 1);
        this.shape2.setRotationPoint(0F, 22F, 4F);
        this.shape2.setTextureSize(8, 16);
        this.shape2.mirror = true;
        this.setRotation(this.shape2, 0F, 0F, 0F);
        this.shape3 = new ModelRenderer(this, 0, 8);
        this.shape3.addBox(-1F, -3.4F, 1F, 2, 2, 1);
        this.shape3.setRotationPoint(0F, 22F, 4F);
        this.shape3.setTextureSize(8, 16);
        this.shape3.mirror = true;
        this.setRotation(this.shape3, 0.3490659F, 0F, 0F);
        this.shape4 = new ModelRenderer(this, 0, 0);
        this.shape4.addBox(-1F, -1F, 0F, 2, 4, 1);
        this.shape4.setRotationPoint(0F, 22F, 4F);
        this.shape4.setTextureSize(8, 16);
        this.shape4.mirror = true;
        this.setRotation(this.shape4, -0.7853982F, 0F, 0F);
        this.shape5 = new ModelRenderer(this, 0, 11);
        this.shape5.addBox(-1F, -4.25F, 2.24F, 2, 2, 1);
        this.shape5.setRotationPoint(0F, 22F, 4F);
        this.shape5.setTextureSize(8, 16);
        this.shape5.mirror = true;
        this.setRotation(this.shape5, 0.7853982F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
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

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
