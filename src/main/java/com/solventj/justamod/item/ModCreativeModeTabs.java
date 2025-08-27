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
            "justamodtab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.TEST.get()))
                    .title(Component.translatable("creativetab:justamod.tab"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(ModBlocks.RottenFlashBlock);
                        output.accept(ModItems.TEST);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
