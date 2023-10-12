package genderdex.arshermetica.common.blocks.calcinator;

import genderdex.arshermetica.core.AHBlockEntities;
import genderdex.arshermetica.core.AHRecipeTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CalcinatorBlockEntity extends AbstractFurnaceBlockEntity {


    public CalcinatorBlockEntity(BlockPos p_154992_, BlockState p_154993_) {
        super(AHBlockEntities.CALCINATOR.get(), p_154992_, p_154993_, AHRecipeTypes.CALCINATOR.get());
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.calcinator");
    }

    @Override
    protected AbstractContainerMenu createMenu(int slot, Inventory inv) {
        return new CalcinatorMenu(slot, inv, this, this.dataAccess);
    }

    @Override
    public boolean isLit() {
        return super.isLit() && !this.items.get(0).isEmpty();
    }
}
