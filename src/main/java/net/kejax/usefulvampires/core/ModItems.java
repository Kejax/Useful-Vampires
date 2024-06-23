package net.kejax.usefulvampires.core;

import net.kejax.usefulvampires.UsefulVampires;
import net.kejax.usefulvampires.items.UmbrellaItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UsefulVampires.MOD_ID);

    public static final RegistryObject<Item> UMBRELLA_ROD = ITEMS.register("umbrella_rod",
            () -> new Item(new Item.Properties().stacksTo(8)));

    public static final RegistryObject<Item> SUSPICIOUS_UMBRELLA = ITEMS.register("suspicious_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> WHITE_UMBRELLA = ITEMS.register("white_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> LIGHT_GRAY_UMBRELLA = ITEMS.register("light_gray_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> GRAY_UMBRELLA = ITEMS.register("gray_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> BLACK_UMBRELLA = ITEMS.register("black_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> BROWN_UMBRELLA = ITEMS.register("brown_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> RED_UMBRELLA = ITEMS.register("red_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> ORANGE_UMBRELLA = ITEMS.register("orange_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> YELLOW_UMBRELLA = ITEMS.register("yellow_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> LIME_UMBRELLA = ITEMS.register("lime_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> GREEN_UMBRELLA = ITEMS.register("green_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> CYAN_UMBRELLA = ITEMS.register("cyan_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> LIGHT_BLUE_UMBRELLA = ITEMS.register("light_blue_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> BLUE_UMBRELLA = ITEMS.register("blue_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> PURPLE_UMBRELLA = ITEMS.register("purple_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> MAGENTA_UMBRELLA = ITEMS.register("magenta_umbrella",
            () -> new UmbrellaItem());
    public static final RegistryObject<Item> PINK_UMBRELLA = ITEMS.register("pink_umbrella",
            () -> new UmbrellaItem());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
