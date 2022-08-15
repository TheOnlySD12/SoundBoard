package com.sd12.soundboard;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.glfw.GLFW;

public class SoundBoard implements ClientModInitializer {
    public static final Identifier SUI = new Identifier("soundboard:sui");
    public static SoundEvent SUI_EVENT = new SoundEvent(SUI);
    public static final Identifier AMONG = new Identifier("soundboard:among");
    public static SoundEvent AMONG_EVENT = new SoundEvent(AMONG);
    public static final Identifier WOW = new Identifier("soundboard:wow");
    public static SoundEvent WOW_EVENT = new SoundEvent(WOW);
    public static final Identifier CUSTOM1 = new Identifier("soundboard:custom1");
    public static SoundEvent CUSTOM1_EVENT = new SoundEvent(CUSTOM1);
    public static final Identifier CUSTOM2 = new Identifier("soundboard:custom2");
    public static SoundEvent CUSTOM2_EVENT = new SoundEvent(CUSTOM2);
    public static final Identifier CUSTOM3 = new Identifier("soundboard:custom3");
    public static SoundEvent CUSTOM3_EVENT = new SoundEvent(CUSTOM3);
    public static final Identifier CUSTOM4 = new Identifier("soundboard:custom4");
    public static SoundEvent CUSTOM4_EVENT = new SoundEvent(CUSTOM4);
    public static final Identifier CUSTOM5 = new Identifier("soundboard:custom5");
    public static SoundEvent CUSTOM5_EVENT = new SoundEvent(CUSTOM5);
    public static final Identifier CUSTOM6 = new Identifier("soundboard:custom6");
    public static SoundEvent CUSTOM6_EVENT = new SoundEvent(CUSTOM6);
    public static KeyBinding soundboard_key;
    public static boolean isCompact;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (soundboard_key.wasPressed()) {
                assert client.player != null;
                if (isCompact) {
                    MinecraftClient.getInstance().setScreen(new SoundBoardScreen(new SoundBoardCompactGui()));
                } else {
                    MinecraftClient.getInstance().setScreen(new SoundBoardScreen(new SoundBoardGui()));
                }
            }
        });
    }

    @Override
    public void onInitializeClient() {
        Registry.register(Registry.SOUND_EVENT, SUI, SUI_EVENT);
        Registry.register(Registry.SOUND_EVENT, AMONG, AMONG_EVENT);
        Registry.register(Registry.SOUND_EVENT, WOW, WOW_EVENT);
        Registry.register(Registry.SOUND_EVENT, CUSTOM1, CUSTOM1_EVENT);
        Registry.register(Registry.SOUND_EVENT, CUSTOM2, CUSTOM2_EVENT);
        Registry.register(Registry.SOUND_EVENT, CUSTOM3, CUSTOM3_EVENT);
        Registry.register(Registry.SOUND_EVENT, CUSTOM4, CUSTOM4_EVENT);
        Registry.register(Registry.SOUND_EVENT, CUSTOM5, CUSTOM5_EVENT);
        Registry.register(Registry.SOUND_EVENT, CUSTOM6, CUSTOM6_EVENT);
        soundboard_key = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.soundboard.menu",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                "category.soundboard.key_category"
        ));
        registerKeyInputs();
    }
}
