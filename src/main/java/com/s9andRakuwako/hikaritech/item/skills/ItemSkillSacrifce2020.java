package com.s9andRakuwako.hikaritech.item.skills;

import com.s9andRakuwako.hikaritech.util.EntityUtil;
import com.s9andRakuwako.hikaritech.util.IDLGeneral;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

import static com.s9andRakuwako.hikaritech.util.CommonDef.TICK_PER_SECOND;

public class ItemSkillSacrifce2020 extends ItemSkillBase {
    public ItemSkillSacrifce2020(String name) {
        super(name);
        cool_down = 50f;
        maxLevel = 1;
        showDamageDesc = false;

        setRange(32, 32);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack stack = playerIn.getHeldItem(handIn);
        if (isStackReady(playerIn, stack))
        {
            if (!worldIn.isRemote)
            {
                Vec3d basePos = playerIn.getPositionVector();
                float range = getRange(stack);
                List<EntityPlayer> entities = worldIn.getEntitiesWithinAABB(EntityPlayer.class, IDLGeneral.ServerAABB(basePos.addVector(-range, -range, -range), basePos.addVector(range, range, range)));
                for (EntityPlayer living: entities
                ) {
                    if (living != playerIn)
                    {
                        EntityUtil.TryRemoveDebuff(living);
                        living.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, TICK_PER_SECOND * 5, 0));
                        living.heal(living.getMaxHealth());
                    }
                }

                playerIn.addPotionEffect(new PotionEffect(MobEffects.POISON, TICK_PER_SECOND * 60, 0));
                playerIn.setHealth(1f);
                activateCoolDown(playerIn, stack);
            }

            return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
        }

        return new ActionResult<>(EnumActionResult.FAIL, playerIn.getHeldItem(handIn));
    }
}
