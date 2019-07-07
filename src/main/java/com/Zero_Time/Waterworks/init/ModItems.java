package com.Zero_Time.Waterworks.init;

import com.Zero_Time.Waterworks.Waterworks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModItems {
    static final Map<String, BlockItem> BLOCKS_TO_REGISTERER = new LinkedHashMap<>();

    public static void registerAll(RegistryEvent.Register<Item> event){
        if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName())) return;

         BLOCKS_TO_REGISTERER.forEach(ModItems::register);

    }
    private static <T extends Item>T register(String name,T item){
        ResourceLocation id = Waterworks.getid(name);
        item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}
