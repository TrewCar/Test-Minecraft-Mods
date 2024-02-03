package com.example.yaroslavia.items;

import com.example.yaroslavia.Yaroslavia;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
             DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Yaroslavia.MODID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MOD_TABS.register("yaroslavia",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemsPenis.MOONSHARD.get()))
                    .title(Component.translatable("creativetab.yaroslavia"))
                    .displayItems((param, pOutput) ->{
                        pOutput.accept(ItemsPenis.MOONSHARD.get());
                        pOutput.accept(ItemsPenis.YAR.get());
                        pOutput.accept(BlocksPenis.YARILO.get());
                        pOutput.accept(BlocksPenis.YAR_STONE.get());
                    })
                    .build());

    public static void register(IEventBus event){
        CREATIVE_MOD_TABS.register(event);
    }
}
