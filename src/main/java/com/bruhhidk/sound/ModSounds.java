package com.bruhhidk.sound;

import com.bruhhidk.BrothaIdk;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent DIDDY_BLOCK_PLACED = registerSoundEvent("diddy_block_placed");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(BrothaIdk.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {

    }

}
