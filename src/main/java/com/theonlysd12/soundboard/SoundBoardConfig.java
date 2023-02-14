package com.theonlysd12.soundboard;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class SoundBoardConfig {
    @SerializedName("currentMode")
    public static ConfigGuiModes currentMode;

    private static final File configFile = new File(String.valueOf(FabricLoader.getInstance().getConfigDir()), "soundboard.json");
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void saveConfiguration() {
        try {
            String json = gson.toJson(new Wrapper(currentMode));
            FileWriter writer = new FileWriter(configFile);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            SoundBoard.LOGGER.warn("Couldn't save configuration file for SoundBoard");
            e.printStackTrace();
        }
    }

    public static void loadConfiguration() {
        try {
            byte[] jsonData = Files.readAllBytes(configFile.toPath());
            Wrapper wrapper = gson.fromJson(new String(jsonData), Wrapper.class);
            SoundBoardConfig.currentMode = wrapper.currentMode;
            SoundBoard.LOGGER.info("Loaded configuration file for SoundBoard: currentMode = " + SoundBoardConfig.currentMode);
        } catch (IOException e) {
            SoundBoard.LOGGER.warn("Couldn't load configuration file for SoundBoard; ignore if this is the first run");
            e.printStackTrace();
        }
    }

    private static class Wrapper {
        @SerializedName("currentMode")
        ConfigGuiModes currentMode;

        public Wrapper(ConfigGuiModes currentMode) {
            this.currentMode = currentMode;
        }
    }
}