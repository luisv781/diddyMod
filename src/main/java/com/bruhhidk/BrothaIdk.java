package com.bruhhidk;

import com.bruhhidk.block.ModBlocks;
import com.bruhhidk.item.ModItemGroup;
import com.bruhhidk.item.ModItems;
import com.bruhhidk.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrothaIdk implements ModInitializer {
	public static final String MOD_ID = "brotha-idk";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItemGroup.registerItemGroups();
		ModItems.registerItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
	}
}