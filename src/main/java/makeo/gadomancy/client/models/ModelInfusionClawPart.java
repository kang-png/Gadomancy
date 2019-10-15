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
 * Created by makeo @ 08.10.2015 16:14
 */
public class ModelInfusionClawPart extends ModelBase {
    //fields
    ModelRenderer shape1;

    public ModelInfusionClawPart(int num) {
        this.textureWidth = 32;
        this.textureHeight = 64;

        this.shape1 = new ModelRenderer(this, 0, 8*num);
        this.shape1.addBox(-3F, -1F, -3F, 6, 2, 6);
        this.shape1.setRotationPoint(0F, 0F, 0F);
        this.shape1.setTextureSize(32, 64);
        this.shape1.mirror = true;
        this.setRotation(this.shape1, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.shape1.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
