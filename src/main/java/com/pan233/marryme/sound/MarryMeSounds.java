package com.pan233.marryme.sound;

import com.pan233.marryme.MarryMeMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MarryMeSounds {
    public static SoundEvent MARRYING = registerSoundEvent("marrying");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MarryMeMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
