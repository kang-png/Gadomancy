package makeo.gadomancy.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAuraPylonTop extends ModelBase {
    //fields
    ModelRenderer outerpylon;
    ModelRenderer lowerconduit;
    ModelRenderer inlower1;
    ModelRenderer inlower2;
    ModelRenderer outlowersmooth2;
    ModelRenderer outlowersmooth1;
    ModelRenderer inlowersmooth1;
    ModelRenderer inlowersmooth2;
    ModelRenderer outerpylonmiddle1;
    ModelRenderer outerpylonmiddle2;
    ModelRenderer outerpylonupper;

    public ModelAuraPylonTop()
    {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.outerpylon = new ModelRenderer(this, 0, 0);
        this.outerpylon.addBox(0F, 0F, 0F, 2, 8, 2);
        this.outerpylon.setRotationPoint(5F, 16F, 5F);
        this.outerpylon.setTextureSize(64, 32);
        this.outerpylon.mirror = true;
        this.setRotation(this.outerpylon, 0F, 0F, 0F);
        this.lowerconduit = new ModelRenderer(this, 9, 0);
        this.lowerconduit.addBox(0F, 0F, 0.2F, 6, 1, 1);
        this.lowerconduit.setRotationPoint(6F, 20F, 7F);
        this.lowerconduit.setTextureSize(64, 32);
        this.lowerconduit.mirror = true;
        this.setRotation(this.lowerconduit, 0F, 2.356194F, 0F);
        this.inlower1 = new ModelRenderer(this, 9, 3);
        this.inlower1.addBox(0F, 0F, 0F, 1, 1, 3);
        this.inlower1.setRotationPoint(3F, 20F, 3F);
        this.inlower1.setTextureSize(64, 32);
        this.inlower1.mirror = true;
        this.setRotation(this.inlower1, 0F, 3.141593F, 0F);
        this.inlower2 = new ModelRenderer(this, 9, 11);
        this.inlower2.addBox(0F, 0F, 0F, 3, 1, 1);
        this.inlower2.setRotationPoint(3F, 20F, 3F);
        this.inlower2.setTextureSize(64, 32);
        this.inlower2.mirror = true;
        this.setRotation(this.inlower2, 0F, 3.141593F, 0F);
        this.outlowersmooth2 = new ModelRenderer(this, 9, 8);
        this.outlowersmooth2.addBox(0F, 0F, 0.1F, 2, 1, 1);
        this.outlowersmooth2.setRotationPoint(5F, 20F, 7F);
        this.outlowersmooth2.setTextureSize(64, 32);
        this.outlowersmooth2.mirror = true;
        this.setRotation(this.outlowersmooth2, 0F, 1.919862F, 0F);
        this.outlowersmooth1 = new ModelRenderer(this, 9, 8);
        this.outlowersmooth1.addBox(-0.5F, 0F, 0.2F, 2, 1, 1);
        this.outlowersmooth1.setRotationPoint(6F, 20F, 6F);
        this.outlowersmooth1.setTextureSize(64, 32);
        this.outlowersmooth1.mirror = true;
        this.setRotation(this.outlowersmooth1, 0F, 2.792527F, 0F);
        this.inlowersmooth1 = new ModelRenderer(this, 9, 14);
        this.inlowersmooth1.addBox(0.25F, 0F, -0.5F, 1, 1, 2);
        this.inlowersmooth1.setRotationPoint(2F, 20F, 2F);
        this.inlowersmooth1.setTextureSize(64, 32);
        this.inlowersmooth1.mirror = true;
        this.setRotation(this.inlowersmooth1, 0F, 0.3490659F, 0F);
        this.inlowersmooth2 = new ModelRenderer(this, 9, 14);
        this.inlowersmooth2.addBox(0.15F, 0F, 0.3F, 1, 1, 2);
        this.inlowersmooth2.setRotationPoint(1F, 20F, 3F);
        this.inlowersmooth2.setTextureSize(64, 32);
        this.inlowersmooth2.mirror = true;
        this.setRotation(this.inlowersmooth2, 0F, 1.22173F, 0F);
        this.outerpylonmiddle1 = new ModelRenderer(this, 0, 11);
        this.outerpylonmiddle1.addBox(0F, 0F, 0F, 2, 4, 1);
        this.outerpylonmiddle1.setRotationPoint(5F, 12F, 5F);
        this.outerpylonmiddle1.setTextureSize(64, 32);
        this.outerpylonmiddle1.mirror = true;
        this.setRotation(this.outerpylonmiddle1, 0F, 0F, 0F);
        this.outerpylonmiddle2 = new ModelRenderer(this, 0, 17);
        this.outerpylonmiddle2.addBox(0F, 0F, 0F, 1, 4, 1);
        this.outerpylonmiddle2.setRotationPoint(5F, 12F, 6F);
        this.outerpylonmiddle2.setTextureSize(64, 32);
        this.outerpylonmiddle2.mirror = true;
        this.setRotation(this.outerpylonmiddle2, 0F, 0F, 0F);
        this.outerpylonupper = new ModelRenderer(this, 5, 17);
        this.outerpylonupper.addBox(0F, 0F, 0F, 1, 4, 1);
        this.outerpylonupper.setRotationPoint(5F, 8F, 5F);
        this.outerpylonupper.setTextureSize(64, 32);
        this.outerpylonupper.mirror = true;
        this.setRotation(this.outerpylonupper, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.outerpylon.render(f5);
        this.lowerconduit.render(f5);
        this.inlower1.render(f5);
        this.inlower2.render(f5);
        this.outlowersmooth2.render(f5);
        this.outlowersmooth1.render(f5);
        this.inlowersmooth1.render(f5);
        this.inlowersmooth2.render(f5);
        this.outerpylonmiddle1.render(f5);
        this.outerpylonmiddle2.render(f5);
        this.outerpylonupper.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
