package genderdex.arshermetica.common.blocks.essence_refinery;

import genderdex.arshermetica.core.AHRecipeSerializers;
import genderdex.arshermetica.core.AHRecipeTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

public class EssenceRefineryRecipe extends AbstractCookingRecipe {

    final Ingredient ingredient2;
    final Ingredient ingredient3;

    public EssenceRefineryRecipe(ResourceLocation resourceLocation, String group, CookingBookCategory bookCategory, Ingredient ingredient, Ingredient ingredient2, Ingredient ingredient3, ItemStack result, float xp, int cookingTime) {
        super(AHRecipeTypes.ESSENCE_REFINERY.get(), resourceLocation, group, bookCategory, ingredient, result, xp, cookingTime);
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return AHRecipeSerializers.ESSENCE_REFINERY.get();
    }
}
