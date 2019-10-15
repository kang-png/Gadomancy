package makeo.gadomancy.client.transformation;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import thaumcraft.common.entities.golems.EntityGolemBase;
import thaumcraft.common.entities.golems.EnumGolemType;

/**
 * This class is part of the Gadomancy Mod
 * Gadomancy is Open Source and distributed under the
 * GNU LESSER GENERAL PUBLIC LICENSE
 * for more read the LICENSE file
 * <p/>
 * Created by makeo @ 05.07.2015 15:47
 */
public class FakeEntityGolemBase extends EntityGolemBase {
    private EntityGolemBase golem;
    private EntityPlayer player;

    public FakeEntityGolemBase(EntityGolemBase golem, EntityPlayer player) {
        super(player != null ? player.worldObj : null);

        this.player = player;
        this.golem = golem;

        this.inactive = false;
        this.bootup = 0;
    }

    public void setPlayer(EntityPlayer player) {
        this.player = player;
    }

    //Golem stuff
    @Override
    public String getGolemDecoration() {
        return this.golem.getGolemDecoration();
    }

    @Override
    public EnumGolemType getGolemType() {
        return this.golem.getGolemType();
    }

    @Override
    public byte getCore() {
        return this.golem.getCore();
    }

    @Override
    public int getCarryLimit() {
        return this.golem.getCarryLimit();
    }

    @Override
    public byte getUpgrade(int slot) {
        return this.golem.getUpgrade(slot);
    }

    @Override
    public int getUpgradeAmount(int type) {
        return this.golem.getUpgradeAmount(type);
    }

    //Player stuff
    @Override
    public float getEyeHeight() {
        return this.player.getEyeHeight();
    }

    @Override
    public ItemStack getCarriedForDisplay() {
        return this.player.getHeldItem();
    }

    @Override
    public ItemStack getHeldItem() {
        return this.player.getHeldItem();
    }

    @Override
    public boolean isSneaking() {
        return this.player.isSneaking();
    }

    @Override
    public boolean isEating() {
        return this.player.isEating();
    }

    @Override
    public boolean isInvisible() {
        return this.player.isInvisible();
    }

    @Override
    public boolean isSprinting() {
        return this.player.isSprinting();
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }

    public void syncWithPlayer() {
        this.setWorld(this.player.worldObj);
        this.setPosition(this.player.posX, this.player.posY, this.player.posZ);

        this.lastTickPosX = this.player.lastTickPosX;
        this.lastTickPosY = this.player.lastTickPosY;
        this.lastTickPosZ = this.player.lastTickPosZ;

        this.motionX = this.player.motionX;
        this.motionY = this.player.motionY;
        this.motionZ = this.player.motionZ;

        this.moveForward = this.player.moveForward;
        this.moveStrafing = this.player.moveStrafing;

        this.onGround = this.player.onGround;

        this.prevPosX = this.player.prevPosX;
        this.prevPosY = this.player.prevPosY;
        this.prevPosZ = this.player.prevPosZ;

        this.rotationPitch = this.player.rotationPitch;
        this.rotationYaw = this.player.rotationYaw;
        this.rotationYawHead = this.player.rotationYawHead;

        this.prevRotationPitch = this.player.prevRotationPitch;
        this.prevRotationYaw = this.player.prevRotationYaw;
        this.prevRotationYawHead = this.player.prevRotationYawHead;

        this.limbSwing = this.player.limbSwing;

        this.limbSwingAmount = this.player.limbSwingAmount;
        this.prevLimbSwingAmount = this.player.prevLimbSwingAmount;
        this.isSwingInProgress = this.player.isSwingInProgress;

        this.swingProgress = this.player.swingProgress;
        this.prevSwingProgress = this.player.prevSwingProgress;

        this.renderYawOffset = this.player.renderYawOffset;
        this.prevRenderYawOffset = this.player.prevRenderYawOffset;

        this.ticksExisted = this.player.ticksExisted;
        this.isDead = false;
        this.isAirBorne = this.player.isAirBorne;

        this.yOffset = 0;

        this.swingProgress = this.player.swingProgress;
        this.prevSwingProgress = this.player.prevSwingProgress;

        this.limbSwing = this.player.limbSwing;
        this.limbSwingAmount = this.player.limbSwingAmount;
        this.prevLimbSwingAmount = this.player.limbSwingAmount;

        this.isSwingInProgress = this.player.isSwingInProgress;

        this.itemCarried = this.player.getHeldItem();

        if(this.player.isSwingInProgress) {
            if(this.player.getHeldItem() == null) {
                this.action = 6 - this.player.swingProgressInt;
            } else {
                this.rightArm = 5 - (int)(this.player.swingProgress * 5);
            }
        } else {
            this.action = 0;
            this.rightArm = 0;
        }
    }
}
