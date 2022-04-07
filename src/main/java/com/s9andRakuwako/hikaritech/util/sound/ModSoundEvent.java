package com.s9andRakuwako.hikaritech.util.sound;

import com.s9andRakuwako.hikaritech.util.ModSoundHandler;
import com.s9andRakuwako.hikaritech.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class ModSoundEvent extends SoundEvent {
    public ModSoundEvent(String path) {
        super(new ResourceLocation(Reference.MOD_ID, path));
        ModSoundHandler.SOUNDS.add(this);
        setRegistryName(path);
    }
}
