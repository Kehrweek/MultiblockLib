package io.github.totallynotjustbecauseimtoolazytonametheorg.multiblocklib.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import io.github.totallynotjustbecauseimtoolazytonametheorg.multiblocklib.MultiblockLib;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MultiblockLib.MOD_ID)
public class MultiblockLibForge {
    public MultiblockLibForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(MultiblockLib.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MultiblockLib.init();
    }

    void clientSetup (final FMLClientSetupEvent event) {
        MultiblockLib.initClient();
    }
}
