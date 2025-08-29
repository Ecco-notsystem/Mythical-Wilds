package com.ecco.mythicalwildsmod.block;

import com.ecco.mythicalwildsmod.MythicalWildsMod;
import com.ecco.mythicalwildsmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MythicalWildsMod.MOD_ID);

    public static final DeferredBlock<Block> REDSCALESBLOCK = registerBlock("redscalesblock",
            () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(1.5f).explosionResistance(1000.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITESCALESBLOCK = registerBlock("whitescalesblock",
            () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(1.5f).explosionResistance(1000.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREYSCALESBLOCK = registerBlock("greyscalesblock",
            () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(1.5f).explosionResistance(1000.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREENSCALESBLOCK = registerBlock("greenscalesblock",
            () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(1.5f).explosionResistance(1000.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BRONZESCALESBLOCK = registerBlock("bronzescalesblock",
            () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(1.5f).explosionResistance(1000.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLUESCALESBLOCK = registerBlock("bluescalesblock",
            () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(1.5f).explosionResistance(1000.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
