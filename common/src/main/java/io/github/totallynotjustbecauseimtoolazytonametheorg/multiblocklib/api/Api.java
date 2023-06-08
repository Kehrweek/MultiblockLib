package io.github.totallynotjustbecauseimtoolazytonametheorg.multiblocklib.api;

import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Api {
    public static boolean canBeConstructed (BlockPos blockPos, World world) {
        return canBeConstructed(world.getBlockEntity(blockPos));
    }

    public static boolean canBeConstructed (BlockEntity blockEntity) {
        return blockEntity instanceof MultiblockStructureProvider && ((MultiblockStructureProvider) blockEntity).canBeConstructed();
    }
}
