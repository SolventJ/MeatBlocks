package com.solventj.justamod.block;

import com.solventj.justamod.JustAMod;
import com.solventj.justamod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(JustAMod.MOD_ID);

    public static final DeferredBlock<Block> RAW_BEEF_BLOCK = registerBlock("raw_beef_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(DyeColor.RED)
                            .strength(0.25F)
                            .sound(SoundType.HONEY_BLOCK)
            )
    );


    public static final DeferredBlock<Block> COOKED_BEEF_BLOCK = registerBlock("cooked_beef_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(DyeColor.RED)
                            .strength(0.3F)
                            .sound(SoundType.HONEY_BLOCK)
            )
    );


    public static final DeferredBlock<Block> RAW_CHICKEN_BLOCK = registerBlock("raw_chicken_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .strength(0.25F)
                            .sound(SoundType.HONEY_BLOCK)
            )
    );


    public static final DeferredBlock<Block> COOKED_CHICKEN_BLOCK = registerBlock("cooked_chicken_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .strength(0.3F)
                            .sound(SoundType.HONEY_BLOCK)
            )
    );



    public static final DeferredBlock<Block> RAW_MUTTON_BLOCK = registerBlock("raw_mutton_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(DyeColor.RED)
                            .strength(0.25F)
                            .sound(SoundType.HONEY_BLOCK)
            )
    );



    public static final DeferredBlock<Block> COOKED_MUTTON_BLOCK = registerBlock("cooked_mutton_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(DyeColor.RED)
                            .strength(0.3F)
                            .sound(SoundType.HONEY_BLOCK)
            )
    );


    public static final DeferredBlock<Block> RAW_PORK_BLOCK = registerBlock("raw_pork_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_PINK)
                            .strength(0.25F)
                            .sound(SoundType.HONEY_BLOCK)
            )
    );


    public static final DeferredBlock<Block> COOKED_PORK_BLOCK = registerBlock("cooked_pork_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_PINK)
                            .strength(0.3F)
                            .sound(SoundType.HONEY_BLOCK)
            )
    );


    public static final DeferredBlock<Block> RAW_RABBIT_BLOCK = registerBlock("raw_rabbit_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .strength(0.25F)
                            .sound(SoundType.HONEY_BLOCK)
            )
    );


    public static final DeferredBlock<Block> COOKED_RABBIT_BLOCK = registerBlock("cooked_rabbit_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .strength(0.3F)
                            .sound(SoundType.HONEY_BLOCK)
            )
    );


    public static final DeferredBlock<Block> ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_ORANGE)
                            .strength(0.3F)
                            .sound(SoundType.HONEY_BLOCK)
            )
    );


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
