package com.ecco.mythicalwildsmod.item;

import com.ecco.mythicalwildsmod.MythicalWildsMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MythicalWildsMod.MOD_ID);

    public static final DeferredItem<Item> REDDRAGONSCLAES = ITEMS.register("reddragonscales",
            () -> new Item(new Item.Properties()));;
    public static final DeferredItem<Item> BRONZEDRAGONSCALES = ITEMS.register("bronzedragonscales",
            () -> new Item(new Item.Properties()));;
    public static final DeferredItem<Item> WHITEDRAGONSCALES = ITEMS.register("whitedragonscales",
            () -> new Item(new Item.Properties()));;
    public static final DeferredItem<Item> GREYDRAGONSCALES = ITEMS.register("greydragonscales",
            () -> new Item(new Item.Properties()));;
    public static final DeferredItem<Item> GREENDRAGONSCALES = ITEMS.register("greendragonscales",
            () -> new Item(new Item.Properties()));;
    public static final DeferredItem<Item> BLUEDRAGONSCALES = ITEMS.register("bluedragonscales",
            () -> new Item(new Item.Properties()));;

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
