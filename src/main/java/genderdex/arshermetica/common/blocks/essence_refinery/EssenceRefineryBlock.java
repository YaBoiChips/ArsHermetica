package genderdex.arshermetica.common.blocks.essence_refinery;

import genderdex.arshermetica.common.blocks.calcinator.CalcinatorBlockEntity;
import genderdex.arshermetica.core.AHBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class EssenceRefineryBlock extends AbstractFurnaceBlock {
    public EssenceRefineryBlock(Properties p_48687_) {
        super(p_48687_);
    }

    @Override
    protected void openContainer(Level world, BlockPos pos, Player player) {
        BlockEntity blockentity = world.getBlockEntity(pos);
        if (blockentity instanceof EssenceRefineryBlockEntity) {
            player.openMenu((MenuProvider)blockentity);
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new EssenceRefineryBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return level.isClientSide ? null : createTickerHelper(type, AHBlockEntities.ESSENCE_REFINERY.get(), EssenceRefineryBlockEntity::serverTick);
    }
}
