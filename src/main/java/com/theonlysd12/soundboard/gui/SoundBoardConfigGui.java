package com.theonlysd12.soundboard.gui;

import com.theonlysd12.soundboard.ConfigGuiModes;
import com.theonlysd12.soundboard.SoundBoardConfig;
import io.github.cottonmc.cotton.gui.client.BackgroundPainter;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.impl.client.LibGuiClient;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WToggleButton;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;

public class SoundBoardConfigGui extends LightweightGuiDescription {
	public SoundBoardConfigGui(Screen previous) {
		WGridPanel root = new WGridPanel();
		root.setInsets(Insets.ROOT_PANEL);
		setRootPanel(root);

		WToggleButton darkmodeButton = new WToggleButton(Text.literal("Dark Mode"));
		darkmodeButton.setOnToggle(on -> {
			LibGuiClient.config.darkMode = on;
			LibGuiClient.saveConfig(LibGuiClient.config);
		});
		darkmodeButton.setToggle(LibGuiClient.config.darkMode);
		root.add(darkmodeButton, 0, 1, 6, 1);

		WToggleButton compactButton = new WToggleButton(Text.literal("Compact Mode"));
		WToggleButton extendedButton = new WToggleButton(Text.literal("Extended Mode"));
		compactButton.setToggle(SoundBoardConfig.currentMode == ConfigGuiModes.COMPACT);
		extendedButton.setToggle(SoundBoardConfig.currentMode == ConfigGuiModes.EXTENDED);
		compactButton.setOnToggle(on -> {
			if (on) {
				SoundBoardConfig.currentMode = ConfigGuiModes.COMPACT;
				SoundBoardConfig.saveConfiguration();
				extendedButton.setToggle(false);
			} else if (!extendedButton.getToggle()) {
				SoundBoardConfig.currentMode = ConfigGuiModes.NORMAL;
				SoundBoardConfig.saveConfiguration();
			}
		});

		extendedButton.setOnToggle(on -> {
			if (on) {
				SoundBoardConfig.currentMode = ConfigGuiModes.EXTENDED;
				SoundBoardConfig.saveConfiguration();
				compactButton.setToggle(false);
			} else if (!compactButton.getToggle()) {
				SoundBoardConfig.currentMode = ConfigGuiModes.NORMAL;
				SoundBoardConfig.saveConfiguration();
			}
		});
		root.add(compactButton, 0, 2, 6, 1);
		root.add(extendedButton, 0, 3, 6, 1);

		WButton doneButton = new WButton(ScreenTexts.DONE);
		doneButton.setOnClick(()-> MinecraftClient.getInstance().setScreen(previous));
		root.add(doneButton, 0, 5, 3, 1);
		
		root.setBackgroundPainter(BackgroundPainter.VANILLA);
		root.setSize(7*18, 7*18);
		
		root.validate(this);
	}
}
