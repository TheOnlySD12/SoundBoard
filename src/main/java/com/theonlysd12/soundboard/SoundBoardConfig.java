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
            if (configFile.exists()) {
                byte[] jsonData = Files.readAllBytes(configFile.toPath());
                Wrapper wrapper = gson.fromJson(new String(jsonData), Wrapper.class);
                SoundBoardConfig.currentMode = wrapper.currentMode;
            } else {
                SoundBoardConfig.currentMode = ConfigGuiModes.NORMAL;
                saveConfiguration();
            }
        } catch (IOException e) {
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