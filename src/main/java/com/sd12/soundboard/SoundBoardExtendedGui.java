package com.sd12.soundboard;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.text.Text;

public class SoundBoardExtendedGui extends LightweightGuiDescription {
    public SoundBoardExtendedGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(300, 100);
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

        WButton button4 = new WButton(Text.literal("SMG Button"));
        root.add(button4, 0, 4, 5, 1);
        button4.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.SMG_EVENT, 1.0F, 1.0F)));

        WButton button5 = new WButton(Text.translatable("button.soundboard.custom1"));
        root.add(button5, 5, 1, 5, 1);
        button5.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM1_EVENT, 1.0F, 1.0F)));

        WButton button6 = new WButton(Text.translatable("button.soundboard.custom2"));
        root.add(button6, 5, 2, 5, 1);
        button6.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM2_EVENT, 1.0F, 1.0F)));

        WButton button7 = new WButton(Text.translatable("button.soundboard.custom3"));
        root.add(button7, 5, 3, 5, 1);
        button7.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM3_EVENT, 1.0F, 1.0F)));

        WButton button8 = new WButton(Text.translatable("button.soundboard.custom4"));
        root.add(button8, 5, 4, 5, 1);
        button8.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM4_EVENT, 1.0F, 1.0F)));

        WButton button9 = new WButton(Text.translatable("button.soundboard.custom5"));
        root.add(button9, 10, 1, 5, 1);
        button9.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM5_EVENT, 1.0F, 1.0F)));

        WButton button10 = new WButton(Text.translatable("button.soundboard.custom6"));
        root.add(button10, 10, 2, 5, 1);
        button10.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM6_EVENT, 1.0F, 1.0F)));

        WButton button11 = new WButton(Text.translatable("button.soundboard.custom7"));
        root.add(button11, 10, 3, 5, 1);
        button11.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM7_EVENT, 1.0F, 1.0F)));

        WButton button12 = new WButton(Text.translatable("button.soundboard.custom8"));
        root.add(button12, 10, 4, 5, 1);
        button12.setOnClick(() -> MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance
                .master(SoundBoard.CUSTOM8_EVENT, 1.0F, 1.0F)));

        root.validate(this);
    }
}
