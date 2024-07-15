package com.bruhhidk.util;

import com.bruhhidk.BrothaIdk;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(BrothaIdk.MOD_ID, name));
        }

    }

    public static class Items {

        public static final TagKey<Item> SHIT_ITEMS = createTag("pieces_of_shit");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(BrothaIdk.MOD_ID, name));
        }

    }
}
