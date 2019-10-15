package makeo.gadomancy.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * HellFirePvP@Admin
 * Date: 22.04.2016 / 21:36
 * on Gadomancy
 * ModelEssentiaCompressor
 */
public class ModelEssentiaCompressor extends ModelBase {

    //Ugh techne...
    ModelRenderer Plate1;
    ModelRenderer Plate2;
    ModelRenderer Plate3;
    ModelRenderer EdgePillar1;
    ModelRenderer EdgePillar2;
    ModelRenderer EdgePillar3;
    ModelRenderer EdgePillar4;
    ModelRenderer InnerLL1;
    ModelRenderer InnerLL2;
    ModelRenderer InnerLSh1;
    ModelRenderer InnerLSH2;
    ModelRenderer InnerUp1;
    ModelRenderer InnerUp2;
    ModelRenderer InnerUp3;
    ModelRenderer InnerUp4;
    ModelRenderer InnerEdgePiece1;
    ModelRenderer InnerEdgePiece2;
    ModelRenderer InnerEdgePiece3;
    ModelRenderer InnerEdgePiece4;
    ModelRenderer InnerPeak1;
    ModelRenderer InnerPeak2;
    ModelRenderer InnerPeak3;
    ModelRenderer InnerPeak4;
    ModelRenderer InnerPillar1;
    ModelRenderer InnerPillar2;
    ModelRenderer InnerPillar3;
    ModelRenderer InnerPillar4;

    public ModelEssentiaCompressor() {
        this.textureWidth = 128;
        this.textureHeight = 32;

        this.Plate1 = new ModelRenderer(this, 64, 0);
        this.Plate1.addBox(0F, 0F, 0F, 16, 2, 16);
        this.Plate1.setRotationPoint(-8F, 22F, -8F);
        this.Plate1.setTextureSize(128, 32);
        this.Plate1.mirror = true;
        this.setRotation(this.Plate1, 0F, 0F, 0F);
        this.Plate2 = new ModelRenderer(this, 4, 0);
        this.Plate2.addBox(0F, 0F, 0F, 14, 2, 14);
        this.Plate2.setRotationPoint(-7F, 20F, -7F);
        this.Plate2.setTextureSize(128, 32);
        this.Plate2.mirror = true;
        this.setRotation(this.Plate2, 0F, 0F, 0F);
        this.Plate3 = new ModelRenderer(this, 4, 16);
        this.Plate3.addBox(0F, 0F, 0F, 12, 3, 12);
        this.Plate3.setRotationPoint(-6F, 17F, -6F);
        this.Plate3.setTextureSize(128, 32);
        this.Plate3.mirror = true;
        this.setRotation(this.Plate3, 0F, 0F, 0F);
        this.EdgePillar1 = new ModelRenderer(this, 0, 0);
        this.EdgePillar1.addBox(0F, 0F, 0F, 1, 22, 1);
        this.EdgePillar1.setRotationPoint(-8F, 0F, -8F);
        this.EdgePillar1.setTextureSize(128, 32);
        this.EdgePillar1.mirror = true;
        this.setRotation(this.EdgePillar1, 0F, 0F, 0F);
        this.EdgePillar2 = new ModelRenderer(this, 0, 0);
        this.EdgePillar2.addBox(0F, 0F, 0F, 1, 22, 1);
        this.EdgePillar2.setRotationPoint(7F, 0F, -8F);
        this.EdgePillar2.setTextureSize(128, 32);
        this.EdgePillar2.mirror = true;
        this.setRotation(this.EdgePillar2, 0F, 0F, 0F);
        this.EdgePillar3 = new ModelRenderer(this, 0, 0);
        this.EdgePillar3.addBox(0F, 0F, 0F, 1, 22, 1);
        this.EdgePillar3.setRotationPoint(7F, 0F, 7F);
        this.EdgePillar3.setTextureSize(128, 32);
        this.EdgePillar3.mirror = true;
        this.setRotation(this.EdgePillar3, 0F, 0F, 0F);
        this.EdgePillar4 = new ModelRenderer(this, 0, 0);
        this.EdgePillar4.addBox(0F, 0F, 0F, 1, 22, 1);
        this.EdgePillar4.setRotationPoint(-8F, 0F, 7F);
        this.EdgePillar4.setTextureSize(128, 32);
        this.EdgePillar4.mirror = true;
        this.setRotation(this.EdgePillar4, 0F, 0F, 0F);
        this.InnerLL1 = new ModelRenderer(this, 100, 18);
        this.InnerLL1.addBox(0F, 0F, 0F, 2, 3, 10);
        this.InnerLL1.setRotationPoint(-5F, 14F, -5F);
        this.InnerLL1.setTextureSize(128, 32);
        this.InnerLL1.mirror = true;
        this.setRotation(this.InnerLL1, 0F, 0F, 0F);
        this.InnerLL2 = new ModelRenderer(this, 100, 18);
        this.InnerLL2.addBox(0F, 0F, 0F, 2, 3, 10);
        this.InnerLL2.setRotationPoint(3F, 14F, -5F);
        this.InnerLL2.setTextureSize(128, 32);
        this.InnerLL2.mirror = true;
        this.setRotation(this.InnerLL2, 0F, 0F, 0F);
        this.InnerLSh1 = new ModelRenderer(this, 84, 18);
        this.InnerLSh1.addBox(0F, 0F, 0F, 6, 3, 2);
        this.InnerLSh1.setRotationPoint(-3F, 14F, -5F);
        this.InnerLSh1.setTextureSize(128, 32);
        this.InnerLSh1.mirror = true;
        this.setRotation(this.InnerLSh1, 0F, 0F, 0F);
        this.InnerLSH2 = new ModelRenderer(this, 84, 18);
        this.InnerLSH2.addBox(0F, 0F, 0F, 6, 3, 2);
        this.InnerLSH2.setRotationPoint(-3F, 14F, 3F);
        this.InnerLSH2.setTextureSize(128, 32);
        this.InnerLSH2.mirror = true;
        this.setRotation(this.InnerLSH2, 0F, 0F, 0F);
        this.InnerUp1 = new ModelRenderer(this, 64, 18);
        this.InnerUp1.addBox(0F, 0F, 0F, 1, 2, 6);
        this.InnerUp1.setRotationPoint(-5F, 12F, -3F);
        this.InnerUp1.setTextureSize(128, 32);
        this.InnerUp1.mirror = true;
        this.setRotation(this.InnerUp1, 0F, 0F, 0F);
        this.InnerUp2 = new ModelRenderer(this, 64, 18);
        this.InnerUp2.addBox(0F, 0F, 0F, 1, 2, 6);
        this.InnerUp2.setRotationPoint(4F, 12F, -3F);
        this.InnerUp2.setTextureSize(128, 32);
        this.InnerUp2.mirror = true;
        this.setRotation(this.InnerUp2, 0F, 0F, 0F);
        this.InnerUp3 = new ModelRenderer(this, 64, 18);
        this.InnerUp3.addBox(0F, 0F, 0F, 6, 2, 1);
        this.InnerUp3.setRotationPoint(-3F, 12F, 4F);
        this.InnerUp3.setTextureSize(128, 32);
        this.InnerUp3.mirror = true;
        this.setRotation(this.InnerUp3, 0F, 0F, 0F);
        this.InnerUp4 = new ModelRenderer(this, 64, 18);
        this.InnerUp4.addBox(0F, 0F, 0F, 6, 2, 1);
        this.InnerUp4.setRotationPoint(-3F, 12F, -5F);
        this.InnerUp4.setTextureSize(128, 32);
        this.InnerUp4.mirror = true;
        this.setRotation(this.InnerUp4, 0F, 0F, 0F);
        this.InnerEdgePiece1 = new ModelRenderer(this, 52, 18);
        this.InnerEdgePiece1.addBox(0F, 0F, 0F, 2, 5, 2);
        this.InnerEdgePiece1.setRotationPoint(3F, 9F, -5F);
        this.InnerEdgePiece1.setTextureSize(128, 32);
        this.InnerEdgePiece1.mirror = true;
        this.setRotation(this.InnerEdgePiece1, 0F, 0F, 0F);
        this.InnerEdgePiece2 = new ModelRenderer(this, 52, 18);
        this.InnerEdgePiece2.addBox(0F, 0F, 0F, 2, 5, 2);
        this.InnerEdgePiece2.setRotationPoint(3F, 9F, 3F);
        this.InnerEdgePiece2.setTextureSize(128, 32);
        this.InnerEdgePiece2.mirror = true;
        this.setRotation(this.InnerEdgePiece2, 0F, 0F, 0F);
        this.InnerEdgePiece3 = new ModelRenderer(this, 52, 18);
        this.InnerEdgePiece3.addBox(0F, 0F, 0F, 2, 5, 2);
        this.InnerEdgePiece3.setRotationPoint(-5F, 9F, 3F);
        this.InnerEdgePiece3.setTextureSize(128, 32);
        this.InnerEdgePiece3.mirror = true;
        this.setRotation(this.InnerEdgePiece3, 0F, 0F, 0F);
        this.InnerEdgePiece4 = new ModelRenderer(this, 52, 18);
        this.InnerEdgePiece4.addBox(0F, 0F, 0F, 2, 5, 2);
        this.InnerEdgePiece4.setRotationPoint(-5F, 9F, -5F);
        this.InnerEdgePiece4.setTextureSize(128, 32);
        this.InnerEdgePiece4.mirror = true;
        this.setRotation(this.InnerEdgePiece4, 0F, 0F, 0F);
        this.InnerPeak1 = new ModelRenderer(this, 124, 18);
        this.InnerPeak1.addBox(0F, 0F, 0F, 1, 5, 1);
        this.InnerPeak1.setRotationPoint(-5F, 4F, -5F);
        this.InnerPeak1.setTextureSize(128, 32);
        this.InnerPeak1.mirror = true;
        this.setRotation(this.InnerPeak1, 0F, 0F, 0F);
        this.InnerPeak2 = new ModelRenderer(this, 124, 18);
        this.InnerPeak2.addBox(0F, 0F, 0F, 1, 5, 1);
        this.InnerPeak2.setRotationPoint(-5F, 4F, 4F);
        this.InnerPeak2.setTextureSize(128, 32);
        this.InnerPeak2.mirror = true;
        this.setRotation(this.InnerPeak2, 0F, 0F, 0F);
        this.InnerPeak3 = new ModelRenderer(this, 124, 18);
        this.InnerPeak3.addBox(0F, 0F, 0F, 1, 5, 1);
        this.InnerPeak3.setRotationPoint(4F, 4F, -5F);
        this.InnerPeak3.setTextureSize(128, 32);
        this.InnerPeak3.mirror = true;
        this.setRotation(this.InnerPeak3, 0F, 0F, 0F);
        this.InnerPeak4 = new ModelRenderer(this, 124, 18);
        this.InnerPeak4.addBox(0F, 0F, 0F, 1, 5, 1);
        this.InnerPeak4.setRotationPoint(4F, 4F, 4F);
        this.InnerPeak4.setTextureSize(128, 32);
        this.InnerPeak4.mirror = true;
        this.setRotation(this.InnerPeak4, 0F, 0F, 0F);
        this.InnerPillar1 = new ModelRenderer(this, 0, 0);
        this.InnerPillar1.addBox(0F, 0F, 0F, 1, 17, 1);
        this.InnerPillar1.setRotationPoint(5F, 0F, 5F);
        this.InnerPillar1.setTextureSize(128, 32);
        this.InnerPillar1.mirror = true;
        this.setRotation(this.InnerPillar1, 0F, 0F, 0F);
        this.InnerPillar2 = new ModelRenderer(this, 0, 0);
        this.InnerPillar2.addBox(0F, 0F, 0F, 1, 17, 1);
        this.InnerPillar2.setRotationPoint(5F, 0F, -6F);
        this.InnerPillar2.setTextureSize(128, 32);
        this.InnerPillar2.mirror = true;
        this.setRotation(this.InnerPillar2, 0F, 0F, 0F);
        this.InnerPillar3 = new ModelRenderer(this, 0, 0);
        this.InnerPillar3.addBox(0F, 0F, 0F, 1, 17, 1);
        this.InnerPillar3.setRotationPoint(-6F, 0F, -6F);
        this.InnerPillar3.setTextureSize(128, 32);
        this.InnerPillar3.mirror = true;
        this.setRotation(this.InnerPillar3, 0F, 0F, 0F);
        this.InnerPillar4 = new ModelRenderer(this, 0, 0);
        this.InnerPillar4.addBox(0F, 0F, 0F, 1, 17, 1);
        this.InnerPillar4.setRotationPoint(-6F, 0F, 5F);
        this.InnerPillar4.setTextureSize(128, 32);
        this.InnerPillar4.mirror = true;
        this.setRotation(this.InnerPillar4, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Plate1.render(f5);
        this.Plate2.render(f5);
        this.Plate3.render(f5);
        this.EdgePillar1.render(f5);
        this.EdgePillar2.render(f5);
        this.EdgePillar3.render(f5);
        this.EdgePillar4.render(f5);
        this.InnerLL1.render(f5);
        this.InnerLL2.render(f5);
        this.InnerLSh1.render(f5);
        this.InnerLSH2.render(f5);
        this.InnerUp1.render(f5);
        this.InnerUp2.render(f5);
        this.InnerUp3.render(f5);
        this.InnerUp4.render(f5);
        this.InnerEdgePiece1.render(f5);
        this.InnerEdgePiece2.render(f5);
        this.InnerEdgePiece3.render(f5);
        this.InnerEdgePiece4.render(f5);
        this.InnerPeak1.render(f5);
        this.InnerPeak2.render(f5);
        this.InnerPeak3.render(f5);
        this.InnerPeak4.render(f5);
        this.InnerPillar1.render(f5);
        this.InnerPillar2.render(f5);
        this.InnerPillar3.render(f5);
        this.InnerPillar4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
