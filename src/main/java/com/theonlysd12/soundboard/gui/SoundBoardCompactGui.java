package com.theonlysd12.soundboard.gui;

import com.theonlysd12.soundboard.SoundBoard;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.text.Text;

public class SoundBoardCompactGui extends LightweightGuiDescription {
    public SoundBoardCompactGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(280, 75);
        root.setInsets(Insets.ROOT_PANEL);

        WLabel label = new WLabel(Text.literal("Sound Board"));
        root.add(label, 0, 0, 2, 1);

        WButton button = new WButton(Text.translatable("button.soundboard.sui"));
        root.add(button, 0, 1, 5, 1);
        button.setOnClick(() -> SoundBoard.playSound(SoundBoard.SUI_EVENT));

        WButton button2 = new WButton(Text.translatable("button.soundboard.among"));
        root.add(button2, 0, 2, 5, 1);
        button2.setOnClick(() -> SoundBoard.playSound(SoundBoard.AMONG_EVENT));

        WButton button3 = new WButton(Text.translatable("button.soundboard.wow"));
        root.add(button3, 0, 3, 5, 1);
        button3.setOnClick(() -> SoundBoard.playSound(SoundBoard.WOW_EVENT));

        WButton button4 = new WButton(Text.translatable("button.soundboard.custom1"));
        root.add(button4, 5, 1, 5, 1);
        button4.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM1_EVENT));

        WButton button5 = new WButton(Text.translatable("button.soundboard.custom2"));
        root.add(button5, 5, 2, 5, 1);
        button5.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM2_EVENT));

        WButton button6 = new WButton(Text.translatable("button.soundboard.custom3"));
        root.add(button6, 5, 3, 5, 1);
        button6.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM3_EVENT));

        WButton button7 = new WButton(Text.translatable("button.soundboard.custom4"));
        root.add(button7, 10, 1, 5, 1);
        button7.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM4_EVENT));

        WButton button8 = new WButton(Text.translatable("button.soundboard.custom5"));
        root.add(button8, 10, 2, 5, 1);
        button8.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM5_EVENT));

        WButton button9 = new WButton(Text.translatable("button.soundboard.custom6"));
        root.add(button9, 10, 3, 5, 1);
        button9.setOnClick(() -> SoundBoard.playSound(SoundBoard.CUSTOM6_EVENT));

        root.validate(this);
    }
}
