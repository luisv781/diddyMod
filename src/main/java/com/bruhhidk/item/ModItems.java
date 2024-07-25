package com.bruhhidk.item;

import com.bruhhidk.BrothaIdk;
import com.bruhhidk.entity.ModEntities;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SHIT = registerItem("shit", new Item(new Item.Settings()));
    public static final Item GREEN_SHIT = registerItem("green_shit", new Item(new Item.Settings()));

    public static final Item DIDDY_SPAWN_EGG = registerItem("diddy_spawn_egg", new SpawnEggItem(ModEntities.DIDDY_ENTITY,
            0xbf8c62, 0xcf6e4a, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BrothaIdk.MOD_ID, name), item);
    }
    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((entries -> {
            entries.add(SHIT);
            entries.add(GREEN_SHIT);
        }));
    }

}
