package makeo.gadomancy.client.renderers.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.player.EntityPlayer;

/**
 * This class is part of the Gadomancy Mod
 * Gadomancy is Open Source and distributed under the
 * GNU LESSER GENERAL PUBLIC LICENSE
 * for more read the LICENSE file
 * <p/>
 * Created by makeo @ 09.07.2015 02:34
 */
public class PlayerCameraRenderer extends EntityRenderer {
    private final Minecraft minecraft;

    private boolean isMarkedForRemoval;
    private boolean isRemoved;
    private EntityRenderer prevRenderer;

    public float xOffset;
    public float yOffset;
    public float zOffset;

    public PlayerCameraRenderer(Minecraft minecraft, EntityRenderer prevRenderer) {
        super(minecraft, minecraft.getResourceManager());
        this.minecraft = minecraft;

        this.isMarkedForRemoval = false;
        this.isRemoved = false;
        this.prevRenderer = prevRenderer;
    }

    public EntityRenderer getPrevRenderer() {
        return this.prevRenderer;
    }

    public boolean isMarkedForRemoval() {
        return this.isMarkedForRemoval;
    }

    public boolean isRemoved() {
        return this.isRemoved;
    }

    public void markForRemoval() {
        this.isMarkedForRemoval = true;
    }

    private boolean canChangeView() {
        return !this.isMarkedForRemoval && this.minecraft.thePlayer != null && !this.minecraft.thePlayer.isRiding() && !this.minecraft.thePlayer.isPlayerSleeping();
    }

    private void removeIfMarked() {
        if(this.isMarkedForRemoval && this.equals(Minecraft.getMinecraft().entityRenderer)) {
            Minecraft.getMinecraft().entityRenderer = this.prevRenderer;
            this.isRemoved = true;
        }
    }

    @Override
    public void updateCameraAndRender(float partialTicks) {
        this.removeIfMarked();

        if(this.canChangeView()) {
            this.moveCam(-1);
            //float tempEyeHeight = minecraft.thePlayer.eyeHeight;
            //minecraft.thePlayer.eyeHeight = minecraft.thePlayer.getDefaultEyeHeight();
            super.updateCameraAndRender(partialTicks);
            //minecraft.thePlayer.eyeHeight = tempEyeHeight;
            this.moveCam(1);

            return;
        }

        super.updateCameraAndRender(partialTicks);
    }

    private void moveCam(int mod) {
        EntityPlayer player = this.minecraft.thePlayer;

        player.posX += this.xOffset * mod;
        player.lastTickPosX += this.xOffset * mod;
        player.prevPosX += this.xOffset * mod;

        player.posY += this.yOffset * mod;
        player.lastTickPosY += this.yOffset * mod;
        player.prevPosY += this.yOffset * mod;

        player.posZ += this.zOffset * mod;
        player.lastTickPosZ += this.zOffset * mod;
        player.prevPosZ += this.zOffset * mod;
    }

    @Override
    public void getMouseOver(float partialTicks) {
        this.removeIfMarked();

        if(this.canChangeView()) {
            this.moveCam(-1);
            super.getMouseOver(partialTicks);
            this.moveCam(1);

            return;
        }

        super.getMouseOver(partialTicks);
    }
}
