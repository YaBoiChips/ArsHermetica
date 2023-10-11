package genderdex.arshermetica.common.blocks.calcinator;

import genderdex.arshermetica.core.AHRecipeSerializers;
import genderdex.arshermetica.core.AHRecipeTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

public class CalcinatorRecipe extends AbstractCookingRecipe {
    public CalcinatorRecipe(ResourceLocation p_249379_, String p_249518_, CookingBookCategory p_250891_, Ingredient p_251354_, ItemStack p_252185_, float p_252165_, int p_250256_) {
        super(AHRecipeTypes.CALCINATOR.get(), p_249379_, p_249518_, p_250891_, p_251354_, p_252185_, p_252165_, p_250256_);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return AHRecipeSerializers.CALCINATOR.get();
    }
}
