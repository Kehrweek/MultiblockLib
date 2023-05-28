package io.github.totallynotjustbecauseimtoolazytonametheorg.multiblocklib.fabric;

import net.fabricmc.api.ModInitializer;
import io.github.totallynotjustbecauseimtoolazytonametheorg.multiblocklib.MultiblockLib;

public class MultiblockLibFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MultiblockLib.init();
        MultiblockLib.initClient();
    }
}
