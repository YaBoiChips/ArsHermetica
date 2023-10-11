package genderdex.arshermetica.core;

import genderdex.arshermetica.common.blocks.calcinator.CalcinatorRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static genderdex.arshermetica.ArsHermetica.MOD_ID;

public class AHRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MOD_ID);

    public static RegistryObject<RecipeSerializer<CalcinatorRecipe>> CALCINATOR = RECIPE_SERIALIZERS.register("calcinator", ()-> new SimpleCookingSerializer<>(CalcinatorRecipe::new, 100) {
    });


}
