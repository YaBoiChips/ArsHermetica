package genderdex.arshermetica.common.blocks.essence_refinery;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

public class EssenceRefineryRecipeSerializer<T extends EssenceRefineryRecipe> implements RecipeSerializer<T> {
    private final int defaultCookingTime;
    private final EssenceRefineryRecipeSerializer.CookieBaker<T> factory;

    public EssenceRefineryRecipeSerializer(EssenceRefineryRecipeSerializer.CookieBaker<T> p_44330_, int p_44331_) {
        this.defaultCookingTime = p_44331_;
        this.factory = p_44330_;
    }

    public T fromJson(ResourceLocation resourceLocation, JsonObject json) {
        String s = GsonHelper.getAsString(json, "group", "");
        CookingBookCategory cookingbookcategory = CookingBookCategory.CODEC.byName(GsonHelper.getAsString(json, "category", null), CookingBookCategory.MISC);
        JsonElement jsonelement = GsonHelper.isArrayNode(json, "ingredient") ? GsonHelper.getAsJsonArray(json, "ingredient") : GsonHelper.getAsJsonObject(json, "ingredient");
        JsonElement jsonelement2 = GsonHelper.isArrayNode(json, "ingredient2") ? GsonHelper.getAsJsonArray(json, "ingredient2") : GsonHelper.getAsJsonObject(json, "ingredient2");
        JsonElement jsonelement3 = GsonHelper.isArrayNode(json, "ingredient3") ? GsonHelper.getAsJsonArray(json, "ingredient3") : GsonHelper.getAsJsonObject(json, "ingredient3");
        Ingredient ingredient = Ingredient.fromJson(jsonelement, false);
        Ingredient ingredient2 = Ingredient.fromJson(jsonelement2, false);
        Ingredient ingredient3 = Ingredient.fromJson(jsonelement3, false);

        //Forge: Check if primitive string to keep vanilla or a object which can contain a count field.
        if (!json.has("result")) throw new com.google.gson.JsonSyntaxException("Missing result, expected to find a string or object");
        ItemStack itemstack;
        if (json.get("result").isJsonObject()) itemstack = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "result"));
        else {
            String s1 = GsonHelper.getAsString(json, "result");
            ResourceLocation resourcelocation = new ResourceLocation(s1);
            itemstack = new ItemStack(BuiltInRegistries.ITEM.getOptional(resourcelocation).orElseThrow(() -> new IllegalStateException("Item: " + s1 + " does not exist")));
        }
        float f = GsonHelper.getAsFloat(json, "experience", 0.0F);
        int i = GsonHelper.getAsInt(json, "cookingtime", this.defaultCookingTime);
        return this.factory.create(resourceLocation, s, cookingbookcategory, ingredient, ingredient2, ingredient3, itemstack, f, i);
    }

    public T fromNetwork(ResourceLocation p_44350_, FriendlyByteBuf buf) {
        String s = buf.readUtf();
        CookingBookCategory cookingbookcategory = buf.readEnum(CookingBookCategory.class);
        Ingredient ingredient = Ingredient.fromNetwork(buf);
        Ingredient ingredient2 = Ingredient.fromNetwork(buf);
        Ingredient ingredient3 = Ingredient.fromNetwork(buf);
        ItemStack itemstack = buf.readItem();
        float f = buf.readFloat();
        int i = buf.readVarInt();
        return this.factory.create(p_44350_, s, cookingbookcategory, ingredient, ingredient2, ingredient3, itemstack, f, i);
    }

    public void toNetwork(FriendlyByteBuf buf, T recipe) {
        buf.writeUtf(recipe.getGroup());
        buf.writeEnum(recipe.category());
        recipe.ingredient.toNetwork(buf);
        recipe.ingredient2.toNetwork(buf);
        recipe.ingredient3.toNetwork(buf);
        buf.writeItem(recipe.result);
        buf.writeFloat(recipe.getExperience());
        buf.writeVarInt(recipe.getCookingTime());
    }

    public interface CookieBaker<T extends EssenceRefineryRecipe> {
        T create(ResourceLocation p_44353_, String p_44354_, CookingBookCategory p_249487_, Ingredient ingredient, Ingredient ingredient2, Ingredient ingredient3, ItemStack p_44356_, float p_44357_, int p_44358_);
    }
}