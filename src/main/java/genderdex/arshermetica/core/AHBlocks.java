package genderdex.arshermetica.core;

import genderdex.arshermetica.common.blocks.alchemical_engine.AlchemicalEngine;
import genderdex.arshermetica.common.blocks.calcinator.CalcinatorBlock;
import genderdex.arshermetica.common.blocks.essence_refinery.EssenceRefineryBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static genderdex.arshermetica.ArsHermetica.MOD_ID;

public class AHBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final RegistryObject<Block> TIN_BLOCK = createMetalBlock("tin_block");
    public static final RegistryObject<Block> LEAD_BLOCK = createMetalBlock("lead_block");
    public static final RegistryObject<Block> SILVER_BLOCK = createMetalBlock("silver_block");

    public static final RegistryObject<Block> BRIMSTONE = createStoneBlock("brimstone");


    public static final RegistryObject<Block> ALCHEMICAL_ENGINE = BLOCKS.register("alchemical_engine", ()-> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    public static final RegistryObject<Block> CALCINATOR = BLOCKS.register("calcinator", ()-> new CalcinatorBlock(BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    public static final RegistryObject<Block> ESSENCE_REFINERY = BLOCKS.register("essence_refinery", ()-> new EssenceRefineryBlock(BlockBehaviour.Properties.of().strength(1f).noOcclusion()));


    public static RegistryObject<Block> createMetalBlock(String id){
        return BLOCKS.register(id, () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    }
    public static RegistryObject<Block> createStoneBlock(String id){
        return BLOCKS.register(id, () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    }

}
