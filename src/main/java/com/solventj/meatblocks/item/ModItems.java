package com.solventj.meatblocks.item;

import com.solventj.meatblocks.MeatBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MeatBlocks.MOD_ID);

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
