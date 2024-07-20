package com.bruhhidk;

import com.bruhhidk.block.ModBlocks;
import com.bruhhidk.entity.ModEntities;
import com.bruhhidk.entity.custom.DiddyEntity;
import com.bruhhidk.item.ModItemGroup;
import com.bruhhidk.item.ModItems;
import com.bruhhidk.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.attribute.EntityAttributes;
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

		FabricDefaultAttributeRegistry.register(ModEntities.DIDDY_ENTITY, DiddyEntity.createAttributes());

	}
}