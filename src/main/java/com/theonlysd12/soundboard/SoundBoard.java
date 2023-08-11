package com.theonlysd12.soundboard;

import com.theonlysd12.soundboard.gui.SoundBoardCompactGui;
import com.theonlysd12.soundboard.gui.SoundBoardExtendedGui;
import com.theonlysd12.soundboard.gui.SoundBoardNormalGui;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoundBoard implements ClientModInitializer {
    public static final Identifier SUI = new Identifier("soundboard:sui");
    public static SoundEvent SUI_EVENT = SoundEvent.of(SUI);
    public static final Identifier AMONG = new Identifier("soundboard:among");
    public static SoundEvent AMONG_EVENT = SoundEvent.of(AMONG);
    public static final Identifier WOW = new Identifier("soundboard:wow");
    public static SoundEvent WOW_EVENT = SoundEvent.of(WOW);
    public static final Identifier SMG = new Identifier("soundboard:smg");
    public static SoundEvent SMG_EVENT = SoundEvent.of(SMG);
    public static final Identifier CUSTOM1 = new Identifier("soundboard:custom1");
    public static SoundEvent CUSTOM1_EVENT = SoundEvent.of(CUSTOM1);
    public static final Identifier CUSTOM2 = new Identifier("soundboard:custom2");
    public static SoundEvent CUSTOM2_EVENT = SoundEvent.of(CUSTOM2);
    public static final Identifier CUSTOM3 = new Identifier("soundboard:custom3");
    public static SoundEvent CUSTOM3_EVENT = SoundEvent.of(CUSTOM3);
    public static final Identifier CUSTOM4 = new Identifier("soundboard:custom4");
    public static SoundEvent CUSTOM4_EVENT = SoundEvent.of(CUSTOM4);
    public static final Identifier CUSTOM5 = new Identifier("soundboard:custom5");
    public static SoundEvent CUSTOM5_EVENT = SoundEvent.of(CUSTOM5);
    public static final Identifier CUSTOM6 = new Identifier("soundboard:custom6");
    public static SoundEvent CUSTOM6_EVENT = SoundEvent.of(CUSTOM6);
    public static final Identifier CUSTOM7 = new Identifier("soundboard:custom7");
    public static SoundEvent CUSTOM7_EVENT = SoundEvent.of(CUSTOM7);
    public static final Identifier CUSTOM8 = new Identifier("soundboard:custom8");
    public static SoundEvent CUSTOM8_EVENT = SoundEvent.of(CUSTOM8);
    public static KeyBinding soundboard_key;
    public static final Logger LOGGER = LoggerFactory.getLogger("SoundBoard");

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (soundboard_key.wasPressed()) {
                assert client.player != null;
                switch (SoundBoardConfig.currentMode) {
                    case NORMAL ->
                            MinecraftClient.getInstance().setScreen(new SoundBoardScreen(new SoundBoardNormalGui()));
                    case COMPACT ->
                            MinecraftClient.getInstance().setScreen(new SoundBoardScreen(new SoundBoardCompactGui()));
                    case EXTENDED ->
                            MinecraftClient.getInstance().setScreen(new SoundBoardScreen(new SoundBoardExtendedGui()));
                }
            }
        });
    }

    @Override
    public void onInitializeClient() {
        SoundBoardConfig.loadConfiguration();
        Registry.register(Registries.SOUND_EVENT, SUI, SUI_EVENT);
        Registry.register(Registries.SOUND_EVENT, AMONG, AMONG_EVENT);
        Registry.register(Registries.SOUND_EVENT, WOW, WOW_EVENT);
        Registry.register(Registries.SOUND_EVENT, SMG, SMG_EVENT);
        Registry.register(Registries.SOUND_EVENT, CUSTOM1, CUSTOM1_EVENT);
        Registry.register(Registries.SOUND_EVENT, CUSTOM2, CUSTOM2_EVENT);
        Registry.register(Registries.SOUND_EVENT, CUSTOM3, CUSTOM3_EVENT);
        Registry.register(Registries.SOUND_EVENT, CUSTOM4, CUSTOM4_EVENT);
        Registry.register(Registries.SOUND_EVENT, CUSTOM5, CUSTOM5_EVENT);
        Registry.register(Registries.SOUND_EVENT, CUSTOM6, CUSTOM6_EVENT);
        Registry.register(Registries.SOUND_EVENT, CUSTOM7, CUSTOM7_EVENT);
        Registry.register(Registries.SOUND_EVENT, CUSTOM8, CUSTOM8_EVENT);
        soundboard_key = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.soundboard.menu",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                "category.soundboard.key_category"
        ));
        registerKeyInputs();
    }
}
