package genderdex.arshermetica.common.blocks.calcinator;

import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.client.gui.screens.recipebook.BlastingRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class CalcinatorScreen extends AbstractFurnaceScreen<CalcinatorMenu> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/blast_furnace.png");

    public CalcinatorScreen(CalcinatorMenu p_97825_, Inventory p_97827_, Component p_97828_) {
        super(p_97825_, new BlastingRecipeBookComponent(), p_97827_, p_97828_, TEXTURE);
    }
}
