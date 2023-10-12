package genderdex.arshermetica.core;

import genderdex.arshermetica.common.blocks.calcinator.CalcinatorMenu;
import genderdex.arshermetica.common.blocks.essence_refinery.EssenceRefineryMenu;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static genderdex.arshermetica.ArsHermetica.MOD_ID;

public class AHMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MOD_ID);

    public static final RegistryObject<MenuType<CalcinatorMenu>> CALCINATOR = MENUS.register("calcinator", () -> new MenuType<>(CalcinatorMenu::new, FeatureFlags.DEFAULT_FLAGS));
    public static final RegistryObject<MenuType<EssenceRefineryMenu>> ESSENCE_REFINERY = MENUS.register("essence_refinery", () -> new MenuType<>(EssenceRefineryMenu::new, FeatureFlags.DEFAULT_FLAGS));

}
