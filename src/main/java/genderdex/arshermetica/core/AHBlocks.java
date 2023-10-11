package genderdex.arshermetica.core;

import genderdex.arshermetica.common.blocks.alchemical_engine.AlchemicalEngine;
import genderdex.arshermetica.common.blocks.calcinator.CalcinatorBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static genderdex.arshermetica.ArsHermetica.MOD_ID;

public class AHBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final RegistryObject<Block> ALCHEMICAL_ENGINE = BLOCKS.register("alchemical_engine", ()-> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion()));
    public static final RegistryObject<Block> CALCINATOR = BLOCKS.register("calcinator", ()-> new CalcinatorBlock(BlockBehaviour.Properties.of().strength(1f).noOcclusion()));

}
