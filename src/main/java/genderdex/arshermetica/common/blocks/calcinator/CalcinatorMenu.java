package genderdex.arshermetica.common.blocks.calcinator;

import genderdex.arshermetica.core.AHMenus;
import genderdex.arshermetica.core.AHRecipeTypes;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeType;

public class CalcinatorMenu extends AbstractFurnaceMenu {
    public CalcinatorMenu(int p_38963_, Inventory p_38964_) {
        super(AHMenus.CALCINATOR.get(), AHRecipeTypes.CALCINATOR.get(), RecipeBookType.BLAST_FURNACE, p_38963_, p_38964_);
    }

    protected CalcinatorMenu(int p_38969_, Inventory p_38970_, Container p_38971_, ContainerData p_38972_) {
        super(AHMenus.CALCINATOR.get(), AHRecipeTypes.CALCINATOR.get(), RecipeBookType.BLAST_FURNACE, p_38969_, p_38970_, p_38971_, p_38972_);
    }

}
