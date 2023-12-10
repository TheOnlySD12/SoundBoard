package com.theonlysd12.soundboard.gui;

import com.theonlysd12.soundboard.SoundBoard;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.text.Text;

public class SoundBoardExtendedGui extends LightweightGuiDescription {
    public SoundBoardExtendedGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(300, 100);
        root.setInsets(Insets.ROOT_PANEL);

        WLabel label = new WLabel(Text.literal("Sound Board"));
        root.add(label, 0, 0, 2, 1);

        WButton button = new WButton(Text.translatable("button.soundboard.sound1"));
        root.add(button, 0, 1, 5, 1);
        button.setOnClick(() -> SoundBoard.playSound(SoundBoard.SOUND1_EVENT));

        WButton button2 = new WButton(Text.translatable("button.soundboard.sound2"));
        root.add(button2, 0, 2, 5, 1);
        button2.setOnClick(() -> SoundBoard.playSound(SoundBoard.SOUND2_EVENT));

        WButton button3 = new WButton(Text.translatable("button.soundboard.sound3"));
        root.add(button3, 0, 3, 5, 1);
        button3.setOnClick(() -> SoundBoard.playSound(SoundBoard.SOUND3_EVENT));

        WButton button4 = new WButton(Text.translatable("button.soundboard.sound4"));
        root.add(button4, 0, 4, 5, 1);
        button4.setOnClick(() -> SoundBoard.playSound(SoundBoard.SOUND4_EVENT));

        WButton button5 = new WButton(Text.translatable("button.soundboard.custom1"));
        root.add(button5, 5, 1, 5, 1);
        button5.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM1_EVENT));

        WButton button6 = new WButton(Text.translatable("button.soundboard.custom2"));
        root.add(button6, 5, 2, 5, 1);
        button6.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM2_EVENT));

        WButton button7 = new WButton(Text.translatable("button.soundboard.custom3"));
        root.add(button7, 5, 3, 5, 1);
        button7.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM3_EVENT));

        WButton button8 = new WButton(Text.translatable("button.soundboard.custom4"));
        root.add(button8, 5, 4, 5, 1);
        button8.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM4_EVENT));

        WButton button9 = new WButton(Text.translatable("button.soundboard.custom5"));
        root.add(button9, 10, 1, 5, 1);
        button9.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM5_EVENT));

        WButton button10 = new WButton(Text.translatable("button.soundboard.custom6"));
        root.add(button10, 10, 2, 5, 1);
        button10.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM6_EVENT));

        WButton button11 = new WButton(Text.translatable("button.soundboard.custom7"));
        root.add(button11, 10, 3, 5, 1);
        button11.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM7_EVENT));

        WButton button12 = new WButton(Text.translatable("button.soundboard.custom8"));
        root.add(button12, 10, 4, 5, 1);
        button12.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM8_EVENT));

        root.validate(this);
    }
}
