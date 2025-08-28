package com.solventj.justamod.item;

import com.solventj.justamod.JustAMod;
import com.solventj.justamod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JustAMod.MOD_ID);

    public static final Supplier<CreativeModeTab> MAIN_MOD_TAB = CREATIVE_MODE_TAB.register(
            "justamod_main_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.ROTTEN_FLESH_BLOCK.get()))
                    .title(Component.translatable("tab:justamod.main_tab"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(ModBlocks.RAW_BEEF_BLOCK);
                        output.accept(ModBlocks.COOKED_BEEF_BLOCK);
                        output.accept(ModBlocks.RAW_CHICKEN_BLOCK);
                        output.accept(ModBlocks.COOKED_CHICKEN_BLOCK);
                        output.accept(ModBlocks.RAW_MUTTON_BLOCK);
                        output.accept(ModBlocks.COOKED_MUTTON_BLOCK);
                        output.accept(ModBlocks.RAW_PORK_BLOCK);
                        output.accept(ModBlocks.COOKED_PORK_BLOCK);
                        output.accept(ModBlocks.RAW_RABBIT_BLOCK);
                        output.accept(ModBlocks.COOKED_RABBIT_BLOCK);
                        output.accept(ModBlocks.ROTTEN_FLESH_BLOCK);
                        output.accept(ModItems.TEST);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
