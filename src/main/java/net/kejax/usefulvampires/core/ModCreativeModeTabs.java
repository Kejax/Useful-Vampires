package net.kejax.usefulvampires.core;

import net.kejax.usefulvampires.UsefulVampires;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UsefulVampires.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("test_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.useful_vampires.main"))
                    .icon(() -> new ItemStack(ModItems.BLACK_UMBRELLA.get()))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.UMBRELLA_ROD.get());
                        pOutput.accept(ModItems.SUSPICIOUS_UMBRELLA.get());
                        pOutput.accept(ModItems.WHITE_UMBRELLA.get());
                        pOutput.accept(ModItems.LIGHT_GRAY_UMBRELLA.get());
                        pOutput.accept(ModItems.GRAY_UMBRELLA.get());
                        pOutput.accept(ModItems.BLACK_UMBRELLA.get());
                        pOutput.accept(ModItems.BROWN_UMBRELLA.get());
                        pOutput.accept(ModItems.RED_UMBRELLA.get());
                        pOutput.accept(ModItems.ORANGE_UMBRELLA.get());
                        pOutput.accept(ModItems.YELLOW_UMBRELLA.get());
                        pOutput.accept(ModItems.LIME_UMBRELLA.get());
                        pOutput.accept(ModItems.GREEN_UMBRELLA.get());
                        pOutput.accept(ModItems.CYAN_UMBRELLA.get());
                        pOutput.accept(ModItems.LIGHT_BLUE_UMBRELLA.get());
                        pOutput.accept(ModItems.BLUE_UMBRELLA.get());
                        pOutput.accept(ModItems.PURPLE_UMBRELLA.get());
                        pOutput.accept(ModItems.MAGENTA_UMBRELLA.get());
                        pOutput.accept(ModItems.PINK_UMBRELLA.get());


                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
