package com.solventj.meatblocks.item;

import com.solventj.meatblocks.MeatBlocks;
import com.solventj.meatblocks.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MeatBlocks.MOD_ID);

    public static final Supplier<CreativeModeTab> MAIN_MOD_TAB = CREATIVE_MODE_TAB.register(
            "meatblocks_main_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.ROTTEN_FLESH_BLOCK.get()))
                    .title(Component.translatable("tab.meatblocks.main_tab"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(ModBlocks.RAW_BEEF_BLOCK);
                        output.accept(ModBlocks.COOKED_BEEF_BLOCK);
                        output.accept(ModBlocks.HARD_BEEF);
                        output.accept(ModBlocks.HARD_BEEF_STAIRS);
                        output.accept(ModBlocks.HARD_BEEF_SLAB);
                        output.accept(ModBlocks.POLISHED_HARD_BEEF);
                        output.accept(ModBlocks.POLISHED_HARD_BEEF_STAIRS);
                        output.accept(ModBlocks.POLISHED_HARD_BEEF_SLAB);

                        output.accept(ModBlocks.RAW_CHICKEN_BLOCK);
                        output.accept(ModBlocks.COOKED_CHICKEN_BLOCK);
                        output.accept(ModBlocks.HARD_CHICKEN);
                        output.accept(ModBlocks.HARD_CHICKEN_STAIRS);
                        output.accept(ModBlocks.HARD_CHICKEN_SLAB);
                        output.accept(ModBlocks.POLISHED_HARD_CHICKEN);
                        output.accept(ModBlocks.POLISHED_HARD_CHICKEN_STAIRS);
                        output.accept(ModBlocks.POLISHED_HARD_CHICKEN_SLAB);

                        output.accept(ModBlocks.RAW_MUTTON_BLOCK);
                        output.accept(ModBlocks.COOKED_MUTTON_BLOCK);
                        output.accept(ModBlocks.HARD_MUTTON);
                        output.accept(ModBlocks.HARD_MUTTON_STAIRS);
                        output.accept(ModBlocks.HARD_MUTTON_SLAB);
                        output.accept(ModBlocks.POLISHED_HARD_MUTTON);
                        output.accept(ModBlocks.POLISHED_HARD_MUTTON_STAIRS);
                        output.accept(ModBlocks.POLISHED_HARD_MUTTON_SLAB);

                        output.accept(ModBlocks.RAW_PORK_BLOCK);
                        output.accept(ModBlocks.COOKED_PORK_BLOCK);
                        output.accept(ModBlocks.HARD_PORK);
                        output.accept(ModBlocks.HARD_PORK_STAIRS);
                        output.accept(ModBlocks.HARD_PORK_SLAB);
                        output.accept(ModBlocks.POLISHED_HARD_PORK);
                        output.accept(ModBlocks.POLISHED_HARD_PORK_STAIRS);
                        output.accept(ModBlocks.POLISHED_HARD_PORK_SLAB);

                        output.accept(ModBlocks.RAW_RABBIT_BLOCK);
                        output.accept(ModBlocks.COOKED_RABBIT_BLOCK);
                        output.accept(ModBlocks.HARD_RABBIT);
                        output.accept(ModBlocks.HARD_RABBIT_STAIRS);
                        output.accept(ModBlocks.HARD_RABBIT_SLAB);
                        output.accept(ModBlocks.POLISHED_HARD_RABBIT);
                        output.accept(ModBlocks.POLISHED_HARD_RABBIT_STAIRS);
                        output.accept(ModBlocks.POLISHED_HARD_RABBIT_SLAB);

                        output.accept(ModBlocks.ROTTEN_FLESH_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
