package dev.moonclient;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public final class MoonHud {
    public static void init() {
        // HUD renderers are registered here as modules are implemented.
        HudRenderCallback.EVENT.register((drawContext, tickCounter) -> {
            // Placeholder: starter framework only.
        });
    }
}
