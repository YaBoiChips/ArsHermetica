package genderdex.arshermetica.core;

import genderdex.arshermetica.common.blocks.calcinator.CalcinatorRecipe;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static genderdex.arshermetica.ArsHermetica.MOD_ID;

public class AHRecipeTypes {
    public static final DeferredRegister<RecipeType<?>> RECIPES = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, MOD_ID);


    public static RegistryObject<RecipeType<CalcinatorRecipe>> CALCINATOR = RECIPES.register("calcinator", ()-> new RecipeType<>(){});

}
