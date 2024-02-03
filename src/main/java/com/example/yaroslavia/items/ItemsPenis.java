package com.example.yaroslavia.items;

import com.example.yaroslavia.Yaroslavia;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsPenis {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Yaroslavia.MODID);
    public static final RegistryObject<Item> MOONSHARD = ITEMS.register("moonshard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YAR = ITEMS.register("yar", () -> new Item(new Item.Properties()));
    public static void register(IEventBus event){
        ITEMS.register(event);
    }
}
