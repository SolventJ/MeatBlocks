package com.solventj.meatblocks.block;

import com.solventj.meatblocks.MeatBlocks;
import com.solventj.meatblocks.item.ModItems;
import com.solventj.meatblocks.item.custom.BlockItemWithDesc;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MeatBlocks.MOD_ID);


    public static final DeferredBlock<Block> RAW_BEEF_BLOCK = registerBlock("raw_beef_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.25F)
                    .sound(SoundType.HONEY_BLOCK)));

    public static final DeferredBlock<Block> COOKED_BEEF_BLOCK = registerBlock("cooked_beef_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.3F)
                    .sound(SoundType.HONEY_BLOCK)));

    public static final DeferredBlock<Block> HARD_BEEF = registerBlock("hard_beef",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.25F)
                    .sound(SoundType.FROGLIGHT)));

    public static final DeferredBlock<Block> HARD_BEEF_STAIRS = registerBlock("hard_beef_stairs",
            () -> new StairBlock(HARD_BEEF.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(HARD_BEEF.get())));

    public static final DeferredBlock<Block> HARD_BEEF_SLAB = registerBlock("hard_beef_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(HARD_BEEF.get())));

    public static final DeferredBlock<Block> POLISHED_HARD_BEEF = registerBlock("polished_hard_beef",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.25F)
                    .sound(SoundType.FROGLIGHT)));

    public static final DeferredBlock<Block> POLISHED_HARD_BEEF_STAIRS = registerBlock("polished_hard_beef_stairs",
            () -> new StairBlock(POLISHED_HARD_BEEF.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(POLISHED_HARD_BEEF.get())));

    public static final DeferredBlock<Block> POLISHED_HARD_BEEF_SLAB = registerBlock("polished_hard_beef_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_HARD_BEEF.get())));


    public static final DeferredBlock<Block> RAW_CHICKEN_BLOCK = registerBlock("raw_chicken_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.25F)
                    .sound(SoundType.HONEY_BLOCK)));

    public static final DeferredBlock<Block> COOKED_CHICKEN_BLOCK = registerBlock("cooked_chicken_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.3F)
                    .sound(SoundType.HONEY_BLOCK)));

    public static final DeferredBlock<Block> HARD_CHICKEN = registerBlock("hard_chicken",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.25F)
                    .sound(SoundType.FROGLIGHT)));

    public static final DeferredBlock<Block> HARD_CHICKEN_STAIRS = registerBlock("hard_chicken_stairs",
            () -> new StairBlock(HARD_CHICKEN.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(HARD_CHICKEN.get())));

    public static final DeferredBlock<Block> HARD_CHICKEN_SLAB = registerBlock("hard_chicken_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(HARD_CHICKEN.get())));

    public static final DeferredBlock<Block> POLISHED_HARD_CHICKEN = registerBlock("polished_hard_chicken",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.25F)
                    .sound(SoundType.FROGLIGHT)));

    public static final DeferredBlock<Block> POLISHED_HARD_CHICKEN_STAIRS = registerBlock("polished_hard_chicken_stairs",
            () -> new StairBlock(POLISHED_HARD_CHICKEN.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(POLISHED_HARD_CHICKEN.get())));

    public static final DeferredBlock<Block> POLISHED_HARD_CHICKEN_SLAB = registerBlock("polished_hard_chicken_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_HARD_CHICKEN.get())));


    public static final DeferredBlock<Block> RAW_MUTTON_BLOCK = registerBlock("raw_mutton_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.25F)
                    .sound(SoundType.HONEY_BLOCK)));

    public static final DeferredBlock<Block> COOKED_MUTTON_BLOCK = registerBlock("cooked_mutton_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.3F)
                    .sound(SoundType.HONEY_BLOCK)));

    public static final DeferredBlock<Block> HARD_MUTTON = registerBlock("hard_mutton",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.25F)
                    .sound(SoundType.FROGLIGHT)));

    public static final DeferredBlock<Block> HARD_MUTTON_STAIRS = registerBlock("hard_mutton_stairs",
            () -> new StairBlock(HARD_MUTTON.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(HARD_MUTTON.get())));

    public static final DeferredBlock<Block> HARD_MUTTON_SLAB = registerBlock("hard_mutton_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(HARD_MUTTON.get())));

    public static final DeferredBlock<Block> POLISHED_HARD_MUTTON = registerBlock("polished_hard_mutton",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.25F)
                    .sound(SoundType.FROGLIGHT)));

    public static final DeferredBlock<Block> POLISHED_HARD_MUTTON_STAIRS = registerBlock("polished_hard_mutton_stairs",
            () -> new StairBlock(POLISHED_HARD_MUTTON.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(POLISHED_HARD_MUTTON.get())));

    public static final DeferredBlock<Block> POLISHED_HARD_MUTTON_SLAB = registerBlock("polished_hard_mutton_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_HARD_MUTTON.get())));


    public static final DeferredBlock<Block> RAW_PORK_BLOCK = registerBlock("raw_pork_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(0.25F)
                    .sound(SoundType.HONEY_BLOCK)));

    public static final DeferredBlock<Block> COOKED_PORK_BLOCK = registerBlock("cooked_pork_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(0.3F)
                    .sound(SoundType.HONEY_BLOCK)));

    public static final DeferredBlock<Block> HARD_PORK = BLOCKS.register("hard_pork",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.25F)
                    .sound(SoundType.FROGLIGHT)));
    public static final DeferredItem<Item> HARD_PORK_ITEM = ModItems.ITEMS.register("hard_pork",
            () -> new BlockItemWithDesc(HARD_PORK.get(), new Item.Properties(), ChatFormatting.GRAY));

    public static final DeferredBlock<Block> HARD_PORK_STAIRS = registerBlock("hard_pork_stairs",
            () -> new StairBlock(HARD_PORK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(HARD_PORK.get())));

    public static final DeferredBlock<Block> HARD_PORK_SLAB = registerBlock("hard_pork_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(HARD_PORK.get())));

    public static final DeferredBlock<Block> POLISHED_HARD_PORK = registerBlock("polished_hard_pork",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.25F)
                    .sound(SoundType.FROGLIGHT)));

    public static final DeferredBlock<Block> POLISHED_HARD_PORK_STAIRS = registerBlock("polished_hard_pork_stairs",
            () -> new StairBlock(POLISHED_HARD_PORK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(POLISHED_HARD_PORK.get())));

    public static final DeferredBlock<Block> POLISHED_HARD_PORK_SLAB = registerBlock("polished_hard_pork_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_HARD_PORK.get())));


    public static final DeferredBlock<Block> RAW_RABBIT_BLOCK = registerBlock("raw_rabbit_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.25F)
                    .sound(SoundType.HONEY_BLOCK)));

    public static final DeferredBlock<Block> COOKED_RABBIT_BLOCK = registerBlock("cooked_rabbit_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.3F)
                    .sound(SoundType.HONEY_BLOCK)));

    public static final DeferredBlock<Block> HARD_RABBIT = registerBlock("hard_rabbit",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.25F)
                    .sound(SoundType.FROGLIGHT)));

    public static final DeferredBlock<Block> HARD_RABBIT_STAIRS = registerBlock("hard_rabbit_stairs",
            () -> new StairBlock(HARD_RABBIT.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(HARD_RABBIT.get())));

    public static final DeferredBlock<Block> HARD_RABBIT_SLAB = registerBlock("hard_rabbit_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(HARD_RABBIT.get())));

    public static final DeferredBlock<Block> POLISHED_HARD_RABBIT = registerBlock("polished_hard_rabbit",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.25F)
                    .sound(SoundType.FROGLIGHT)));

    public static final DeferredBlock<Block> POLISHED_HARD_RABBIT_STAIRS = registerBlock("polished_hard_rabbit_stairs",
            () -> new StairBlock(POLISHED_HARD_RABBIT.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(POLISHED_HARD_RABBIT.get())));

    public static final DeferredBlock<Block> POLISHED_HARD_RABBIT_SLAB = registerBlock("polished_hard_rabbit_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_HARD_RABBIT.get())));


    public static final DeferredBlock<Block> ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(0.3F)
                    .sound(SoundType.HONEY_BLOCK)));


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
