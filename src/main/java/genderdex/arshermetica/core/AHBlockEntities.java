package genderdex.arshermetica.core;

import genderdex.arshermetica.common.blocks.calcinator.CalcinatorBlockEntity;
import genderdex.arshermetica.common.blocks.essence_refinery.EssenceRefineryBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static genderdex.arshermetica.ArsHermetica.MOD_ID;

public class AHBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MOD_ID);

    public static final RegistryObject<BlockEntityType<CalcinatorBlockEntity>> CALCINATOR = BLOCK_ENTITIES.register("calcinator", ()-> BlockEntityType.Builder.of(CalcinatorBlockEntity::new, AHBlocks.CALCINATOR.get()).build(null));
    public static final RegistryObject<BlockEntityType<EssenceRefineryBlockEntity>> ESSENCE_REFINERY = BLOCK_ENTITIES.register("essence_refinery", ()-> BlockEntityType.Builder.of(EssenceRefineryBlockEntity::new, AHBlocks.ESSENCE_REFINERY.get()).build(null));

}
