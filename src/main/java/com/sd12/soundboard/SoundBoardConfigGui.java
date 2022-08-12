package com.sd12.soundboard;

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

		WToggleButton darkmodeButton = new WToggleButton(Text.literal("Dark Mode")) {
			@Override
			public void onToggle(boolean on) {
				LibGuiClient.config.darkMode = on;
				LibGuiClient.saveConfig(LibGuiClient.config);
			}
		};
		darkmodeButton.setToggle(LibGuiClient.config.darkMode);
		root.add(darkmodeButton, 0, 2, 6, 1);

		WButton doneButton = new WButton(ScreenTexts.DONE);
		doneButton.setOnClick(()->{
			MinecraftClient.getInstance().setScreen(previous);
		});
		root.add(doneButton, 0, 4, 3, 1);
		
		root.setBackgroundPainter(BackgroundPainter.VANILLA);
		root.setSize(7*18, 6*18);
		
		root.validate(this);
	}
}
