package net.kejax.usefulvampires.utils;

import de.teamlapen.vampirism.api.VReference;
import de.teamlapen.vampirism.api.VampirismAPI;
import net.kejax.usefulvampires.UsefulVampires;
import net.kejax.usefulvampires.effects.SunscreenEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ObjectHolder;

public class VampirismHandler {

    @ObjectHolder(registryName = "mob_effect", value="vampirism:sunscreen")
    public static MobEffect vampirismSunscreen;

    public static void applySunscreen(ItemStack item, Level world, Entity entity) {

        if (!(entity instanceof Player player)) { return; }

        // Check if the item in hand is an umbrella
        if (!holdingUmbrella(player, item)) {
            return;
        }

        // Check if the player should get sunscreen (only if he doesn't have the effect, and it's daytime)
        if (world.isDay() && (player.getEffect(vampirismSunscreen) == null || player.getEffect(vampirismSunscreen).getDuration() <= 1)) {
            player.addEffect(new SunscreenEffectInstance(vampirismSunscreen));

        }

    }

    public static boolean holdingUmbrella(Player player, ItemStack item) {
        return player.getMainHandItem().equals(item) || player.getOffhandItem().equals(item);
    }

}
