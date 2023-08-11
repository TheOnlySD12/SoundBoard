package com.theonlysd12.soundboard;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.theonlysd12.soundboard.gui.SoundBoardConfigGui;
import io.github.cottonmc.cotton.gui.client.CottonClientScreen;
import net.minecraft.text.Text;

public class ModMenuSupport implements ModMenuApi {
	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory() {
		return screen -> new CottonClientScreen(Text.literal("SoundBoard Settings"), new SoundBoardConfigGui(screen)) {
			@Override
			public void close() {
				assert this.client != null;
				this.client.setScreen(screen);
			}
		};
	}
}
