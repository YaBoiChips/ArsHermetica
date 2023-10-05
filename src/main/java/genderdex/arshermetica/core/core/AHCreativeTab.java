package genderdex.arshermetica.core.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static genderdex.arshermetica.ArsHermetica.MOD_ID;

public class AHCreativeTab {
    public static final DeferredRegister<CreativeModeTab> TAB_REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final RegistryObject<CreativeModeTab> TAB = TAB_REGISTRY.register("tab", () -> CreativeModeTab.builder()
            .title(Component.literal("Ars Hermetica"))
            .icon(Items.STICK::getDefaultInstance)
            .displayItems((displayItems, output) -> AHItems.ITEMS.getEntries().forEach(item -> output.accept(item.get())))
            .build());
}
