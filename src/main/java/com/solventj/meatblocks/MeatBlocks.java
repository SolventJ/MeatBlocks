package com.solventj.meatblocks;

import com.solventj.meatblocks.block.ModBlocks;
import com.solventj.meatblocks.item.ModCreativeModeTabs;
import com.solventj.meatblocks.item.ModItems;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(MeatBlocks.MOD_ID)
public class MeatBlocks {
    public static final String MOD_ID = "meatblocks";

    public MeatBlocks(IEventBus modEventBus, ModContainer modContainer) {

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
    }
}
