package genderdex.arshermetica.common.blocks.essence_refinery;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class EssenceRefineryScreen extends AbstractContainerScreen<EssenceRefineryMenu> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/blast_furnace.png");

    public EssenceRefineryScreen(EssenceRefineryMenu p_97741_, Inventory p_97742_, Component p_97743_) {
        super(p_97741_, p_97742_, p_97743_);
    }

    public void render(GuiGraphics p_282918_, int p_282102_, int p_282423_, float p_282621_) {
        this.renderBackground(p_282918_);
        super.render(p_282918_, p_282102_, p_282423_, p_282621_);
        this.renderTooltip(p_282918_, p_282102_, p_282423_);
    }

    protected void renderBg(GuiGraphics p_281616_, float p_282737_, int p_281678_, int p_281465_) {
        int i = (this.width - this.imageWidth) / 2;
        int j = (this.height - this.imageHeight) / 2;
        p_281616_.blit(TEXTURE, i, j, 0, 0, this.imageWidth, this.imageHeight);
    }
}
