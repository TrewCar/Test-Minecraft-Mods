package com.example.yaroslavia.items;

import com.example.yaroslavia.Yaroslavia;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlocksPenis {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Yaroslavia.MODID);

    public static final RegistryObject<Block> YARILO = registerBlock("yarilo",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .mapColor(MapColor.METAL)));

    public static final RegistryObject<Block> YAR_STONE = registerBlock("yar_stone",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.STONE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        var t = Blocks.LIGHT;
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name,toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block){
        return ItemsPenis.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus event){
        BLOCKS.register(event);
    }
}
