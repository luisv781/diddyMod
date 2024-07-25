package com.bruhhidk.entity;

import com.bruhhidk.BrothaIdk;
import com.bruhhidk.entity.custom.DiddyEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<DiddyEntity> DIDDY_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(BrothaIdk.MOD_ID, "diddy"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, DiddyEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 1.5f)).build());

}
