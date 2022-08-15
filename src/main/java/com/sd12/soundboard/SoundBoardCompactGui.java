package com.sd12.soundboard;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.text.Text;

public class SoundBoardCompactGui extends LightweightGuiDescription {
    public SoundBoardCompactGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(280, 75);
        root.setInsets(Insets.ROOT_PANEL);

        WLabel label = new WLabel(Text.literal("Sound Board"));
        root.add(label, 0, 0, 2, 1);

        WButton button = new WButton(Text.literal("SUIII Button"));
        root.add(button, 0, 1, 5, 1);
        button.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.SUI_EVENT, 1.0F, 1.0F)));

        WButton button2 = new WButton(Text.literal("AMONGUS Button"));
        root.add(button2, 0, 2, 5, 1);
        button2.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.AMONG_EVENT, 1.0F, 1.0F)));

        WButton button3 = new WButton(Text.literal("WOW Button"));
        root.add(button3, 0, 3, 5, 1);
        button3.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.WOW_EVENT, 1.0F, 1.0F)));

        WButton button4 = new WButton(Text.translatable("button.soundboard.custom1"));
        root.add(button4, 5, 1, 5, 1);
        button4.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM1_EVENT, 1.0F, 1.0F)));

        WButton button5 = new WButton(Text.translatable("button.soundboard.custom2"));
        root.add(button5, 5, 2, 5, 1);
        button5.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM2_EVENT, 1.0F, 1.0F)));

        WButton button6 = new WButton(Text.translatable("button.soundboard.custom3"));
        root.add(button6, 5, 3, 5, 1);
        button6.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM3_EVENT, 1.0F, 1.0F)));

        WButton button7 = new WButton(Text.translatable("button.soundboard.custom4"));
        root.add(button7, 10, 1, 5, 1);
        button7.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM4_EVENT, 1.0F, 1.0F)));

        WButton button8 = new WButton(Text.translatable("button.soundboard.custom5"));
        root.add(button8, 10, 2, 5, 1);
        button8.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM5_EVENT, 1.0F, 1.0F)));

        WButton button9 = new WButton(Text.translatable("button.soundboard.custom6"));
        root.add(button9, 10, 3, 5, 1);
        button9.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM6_EVENT, 1.0F, 1.0F)));

        root.validate(this);
    }
}
