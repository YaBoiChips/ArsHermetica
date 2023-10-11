package genderdex.arshermetica.core;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class KeyBindings {

    public static KeyMapping magic;


    public static void init() {

        magic = new KeyMapping("Magic", InputConstants.KEY_LEFT, "Ars Hermetica");


        FMLJavaModLoadingContext.get().getModEventBus().register(KeyBindings.class);

    }

    @SubscribeEvent
    public static void onRegisterKeybinds(RegisterKeyMappingsEvent e) {
        e.register(magic);

    }
}