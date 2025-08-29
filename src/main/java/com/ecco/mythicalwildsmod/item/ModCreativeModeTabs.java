package com.ecco.mythicalwildsmod.item;

import com.ecco.mythicalwildsmod.MythicalWildsMod;
import com.ecco.mythicalwildsmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageEffects;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MythicalWildsMod.MOD_ID);

    public static final Supplier<CreativeModeTab> MYTHICAL_ITEMS_TAB = CREATIVE_MODE_TAB.register("mythicalwildsmod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.REDDRAGONSCLAES.get()))
                    .title(Component.translatable("creativetab.mythicalwildsmod.mythicalwildsmod_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.REDDRAGONSCLAES);
                        output.accept(ModItems.WHITEDRAGONSCALES);
                        output.accept(ModItems.GREYDRAGONSCALES);
                        output.accept(ModItems.GREENDRAGONSCALES);
                        output.accept(ModItems.BRONZEDRAGONSCALES);
                        output.accept(ModItems.BLUEDRAGONSCALES);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> MYTHICAL_BLOCK_TAB = CREATIVE_MODE_TAB.register("mythicalwildsmod_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.REDSCALESBLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MythicalWildsMod.MOD_ID, "mythicalwildsmod_items_tab"))
                    .title(Component.translatable("creativetab.mythicalwildsmod.mythicalwildsmod_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.REDSCALESBLOCK);
                        output.accept(ModBlocks.WHITESCALESBLOCK);
                        output.accept(ModBlocks.GREENSCALESBLOCK);
                        output.accept(ModBlocks.GREYSCALESBLOCK);
                        output.accept(ModBlocks.BRONZESCALESBLOCK);
                        output.accept(ModBlocks.BLUESCALESBLOCK);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
