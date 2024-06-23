package net.kejax.usefulvampires.items;

import net.kejax.usefulvampires.utils.VampirismHandler;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class UmbrellaItem extends Item {
    public UmbrellaItem() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public void inventoryTick(ItemStack item, Level world, Entity entity, int itemSlot, boolean isSelected) {
        if (world.isClientSide()) { return; }
        VampirismHandler.applySunscreen(item, world, entity);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack p_41452_) {
        return UseAnim.NONE;
    }
}
