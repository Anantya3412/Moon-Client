
package dev.moonclient;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Button;
import net.minecraft.text.Text;

public class MoonScreen extends Screen {

    public MoonScreen() {
        super(Text.literal("Moon Client"));
    }

    @Override
    protected void init() {
        int centerX = this.width / 2;
        int centerY = this.height / 2;

        int panelWidth = 300;

        int left = centerX - panelWidth / 2;
        int top = centerY - 110;

        addDrawableChild(Button.builder(
            Text.literal("HUD Settings"),
            button -> {}
        ).dimensions(left + 20, top + 45, 260, 20).build());

        addDrawableChild(Button.builder(
            Text.literal("Visual Settings"),
            button -> {}
        ).dimensions(left + 20, top + 70, 260, 20).build());

        addDrawableChild(Button.builder(
            Text.literal("Skin Settings"),
            button -> {}
        ).dimensions(left + 20, top + 95, 260, 20).build());

        addDrawableChild(Button.builder(
            Text.literal("Performance"),
            button -> {}
        ).dimensions(left + 20, top + 120, 260, 20).build());

        addDrawableChild(Button.builder(
            Text.literal("Close"),
            button -> close()
        ).dimensions(left + 20, top + 155, 260, 20).build());
    }

    @Override
    public void render(DrawContext context, int mouseX,
                      int mouseY, float delta) {

        renderBackground(context, mouseX, mouseY, delta);

        int centerX = this.width / 2;
        int centerY = this.height / 2;

        int panelWidth = 300;
        int panelHeight = 220;

        int left = centerX - panelWidth / 2;
        int top = centerY - panelHeight / 2;

        context.fill(
            left, top,
            left + panelWidth, top + panelHeight,
            0xEE151515
        );

        context.drawCenteredTextWithShadow(
            textRenderer,
            "Moon Client",
            centerX,
            top + 15,
            0xFFAA88FF
        );

        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
