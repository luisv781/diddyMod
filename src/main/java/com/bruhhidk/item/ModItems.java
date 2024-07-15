package com.bruhhidk.item;

import com.bruhhidk.BrothaIdk;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SHIT = registerItem("shit", new Item(new Item.Settings()));
    public static final Item GREEN_SHIT = registerItem("green_shit", new Item(new Item.Settings()));

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
