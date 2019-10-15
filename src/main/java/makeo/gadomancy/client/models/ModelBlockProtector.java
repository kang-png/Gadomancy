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
 * Created by makeo @ 11.11.2015 17:15
 */
public class ModelBlockProtector extends ModelBase {
    //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;

    public ModelBlockProtector() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.addBox(0F, 0F, 0F, 16, 3, 16);
        this.Shape1.setRotationPoint(-8F, 21F, -8F);
        this.Shape1.setTextureSize(64, 64);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0F, 0F, 0F);
        this.Shape2 = new ModelRenderer(this, 0, 20);
        this.Shape2.addBox(0F, 0F, 0F, 4, 1, 1);
        this.Shape2.setRotationPoint(-2F, 20F, -8F);
        this.Shape2.setTextureSize(64, 64);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0F, 0F, 0F);
        this.Shape3 = new ModelRenderer(this, 11, 20);
        this.Shape3.addBox(0F, 0F, 0F, 4, 1, 3);
        this.Shape3.setRotationPoint(-2F, 20F, -7F);
        this.Shape3.setTextureSize(64, 64);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, -0.3490659F, 0F, 0F);
        this.Shape4 = new ModelRenderer(this, 27, 20);
        this.Shape4.addBox(0F, 0F, 0F, 4, 1, 1);
        this.Shape4.setRotationPoint(-2F, 20F, 7F);
        this.Shape4.setTextureSize(64, 64);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 0F, 0F, 0F);
        this.Shape5 = new ModelRenderer(this, 38, 20);
        this.Shape5.addBox(0F, 0F, -3F, 4, 1, 3);
        this.Shape5.setRotationPoint(-2F, 20F, 7F);
        this.Shape5.setTextureSize(64, 64);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, 0.3490659F, 0F, 0F);
        this.Shape6 = new ModelRenderer(this, 0, 25);
        this.Shape6.addBox(0F, 0F, 0F, 1, 1, 4);
        this.Shape6.setRotationPoint(-8F, 20F, -2F);
        this.Shape6.setTextureSize(64, 64);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 0F, 0F, 0F);
        this.Shape7 = new ModelRenderer(this, 11, 25);
        this.Shape7.addBox(0F, 0F, 0F, 3, 1, 4);
        this.Shape7.setRotationPoint(-7F, 20F, -2F);
        this.Shape7.setTextureSize(64, 64);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, 0F, 0F, 0.3490659F);
        this.Shape8 = new ModelRenderer(this, 38, 25);
        this.Shape8.addBox(-3F, 0F, 0F, 3, 1, 4);
        this.Shape8.setRotationPoint(7F, 20F, -2F);
        this.Shape8.setTextureSize(64, 64);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, 0F, 0F, -0.3490659F);
        this.Shape9 = new ModelRenderer(this, 27, 25);
        this.Shape9.addBox(0F, 0F, 0F, 1, 1, 4);
        this.Shape9.setRotationPoint(7F, 20F, -2F);
        this.Shape9.setTextureSize(64, 64);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, 0F, 0F, 0F);
        this.Shape10 = new ModelRenderer(this, 0, 31);
        this.Shape10.addBox(0F, -7F, 0F, 2, 8, 2);
        this.Shape10.setRotationPoint(3F, 22F, 3F);
        this.Shape10.setTextureSize(64, 64);
        this.Shape10.mirror = true;
        this.setRotation(this.Shape10, 0.3490659F, 0F, -0.3490659F);
        this.Shape11 = new ModelRenderer(this, 10, 31);
        this.Shape11.addBox(-2F, -7F, -2F, 2, 8, 2);
        this.Shape11.setRotationPoint(-3F, 22F, -3F);
        this.Shape11.setTextureSize(64, 64);
        this.Shape11.mirror = true;
        this.setRotation(this.Shape11, -0.3490659F, 0F, 0.3490659F);
        this.Shape12 = new ModelRenderer(this, 20, 31);
        this.Shape12.addBox(0F, -7F, -2F, 2, 8, 2);
        this.Shape12.setRotationPoint(3F, 22F, -3F);
        this.Shape12.setTextureSize(64, 64);
        this.Shape12.mirror = true;
        this.setRotation(this.Shape12, -0.3490659F, 0F, -0.3490659F);
        this.Shape13 = new ModelRenderer(this, 30, 31);
        this.Shape13.addBox(-2F, -7F, 0F, 2, 8, 2);
        this.Shape13.setRotationPoint(-3F, 22F, 3F);
        this.Shape13.setTextureSize(64, 64);
        this.Shape13.mirror = true;
        this.setRotation(this.Shape13, 0.3490659F, 0F, 0.3490659F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
        this.Shape4.render(f5);
        this.Shape5.render(f5);
        this.Shape6.render(f5);
        this.Shape7.render(f5);
        this.Shape8.render(f5);
        this.Shape9.render(f5);
        this.Shape10.render(f5);
        this.Shape11.render(f5);
        this.Shape12.render(f5);
        this.Shape13.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
