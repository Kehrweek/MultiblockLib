package io.github.totallynotjustbecauseimtoolazytonametheorg.multiblocklib.api;

public interface MultiblockStructureProvider {

    /**
     * Override this method with any custom checks concerning whether the multiblock structure should
     * be allowed to be constructed. This will be called when attempting to construct the multiblock.
     * @return Whether the multiblock structure should be allowed to be constructed.
     */
    default boolean canBeConstructed () {
        return true;
    }
}
