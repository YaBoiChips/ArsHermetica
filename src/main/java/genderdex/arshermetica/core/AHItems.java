package genderdex.arshermetica.core;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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

    public static final RegistryObject<Item> RAW_TIN = createItem("raw_tin");
    public static final RegistryObject<Item> TIN_INGOT = createItem("tin_ingot");
    public static final RegistryObject<Item> TIN_NUGGET = createItem("tin_nugget");
    public static final RegistryObject<Item> TIN_BLOCK = ITEMS.register("tin_block", ()-> new BlockItem(AHBlocks.TIN_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = createItem("raw_silver");
    public static final RegistryObject<Item> SILVER_INGOT = createItem("silver_ingot");
    public static final RegistryObject<Item> SILVER_NUGGET = createItem("silver_nugget");
    public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", ()-> new BlockItem(AHBlocks.SILVER_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = createItem("raw_lead");
    public static final RegistryObject<Item> LEAD_INGOT = createItem("lead_ingot");
    public static final RegistryObject<Item> LEAD_NUGGET = createItem("lead_nugget");
    public static final RegistryObject<Item> LEAD_BLOCK = ITEMS.register("lead_block", ()-> new BlockItem(AHBlocks.LEAD_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> BRIMSTONE = ITEMS.register("brimstone", ()-> new BlockItem(AHBlocks.BRIMSTONE.get(), new Item.Properties()));


    public static final RegistryObject<Item> MINIUM = createItem("minium");
    public static final RegistryObject<Item> SALT = createItem("salt");
    public static final RegistryObject<Item> OIL_OF_VITRIOL = createItem("oil_of_vitriol");
    public static final RegistryObject<Item> ESSENCE_OF_ROT = createItem("essence_of_rot");
    public static final RegistryObject<Item> CRIMSON_EXTRACT = createItem("crimson_extract");
    public static final RegistryObject<Item> WARPED_ESSENCE = createItem("warped_essence");
    public static final RegistryObject<Item> OIL_OF_WEIGHTLESSNESS = createItem("oil_of_weightlessness");
    public static final RegistryObject<Item> AZURE_ESSENCE = createItem("azure_essence");
    public static final RegistryObject<Item> PERFUME_OIL = createItem("purfume_oil");
    public static final RegistryObject<Item> BOTTLE_OF_BLOOD = createItem("bottle_of_blood");


    public static final RegistryObject<Item> ALCHEMICAL_ENGINE = ITEMS.register("alchemical_engine", ()-> new BlockItem(AHBlocks.ALCHEMICAL_ENGINE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CALCINATOR = ITEMS.register("calcinator", ()-> new BlockItem(AHBlocks.CALCINATOR.get(), new Item.Properties()));



    public static RegistryObject<Item> createBlockItem(String id, Block block){
        return ITEMS.register(id, ()-> new BlockItem(block, new Item.Properties()));
    }

    public static RegistryObject<Item> createItem(String id){
        return ITEMS.register(id, ()-> new Item(new Item.Properties()));
    }
}