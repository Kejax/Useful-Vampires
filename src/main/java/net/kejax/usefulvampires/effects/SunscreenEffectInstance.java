package net.kejax.usefulvampires.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;

public class SunscreenEffectInstance extends MobEffectInstance {
    public SunscreenEffectInstance(MobEffect effect) {
        super(effect, 21, 5, false, false);
    }

    @Override
    public boolean showIcon() {
        return false;
    }

    @Override
    public boolean isVisible() {
        return false;
    }
}
