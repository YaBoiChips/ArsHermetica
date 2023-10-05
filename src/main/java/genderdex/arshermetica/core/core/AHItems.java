package genderdex.arshermetica.core.core;


import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static genderdex.arshermetica.ArsHermetica.MOD_ID;

public class AHItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> WOOD_ASH = createItem("wood_ash");
    public static final RegistryObject<Item> SULPHUR = createItem("sulphur");
    public static final RegistryObject<Item> BONE_ASH = createItem("bone_ash");
    public static final RegistryObject<Item> BLACK_CARBON = createItem("black_carbon");


    public static RegistryObject<Item> createItem(String id){
        return ITEMS.register(id, ()-> new Item(new Item.Properties()));
    }
}