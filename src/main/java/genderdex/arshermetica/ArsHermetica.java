package genderdex.arshermetica;

import com.mojang.logging.LogUtils;
import genderdex.arshermetica.core.core.*;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;
//import software.bernie.geckolib.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ArsHermetica.MOD_ID)
public class ArsHermetica {

    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "arshermetica";
    public static final Logger LOGGER = LogUtils.getLogger();


    public ArsHermetica() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        AHCreativeTab.TAB_REGISTRY.register(bus);
        AHEntityTypes.ENTITIES.register(bus);
        AHBlocks.BLOCKS.register(bus);
        AHItems.ITEMS.register(bus);
        AHSounds.SOUND.register(bus);
        KeyBindings.init();
        bus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
//        GeckoLib.initialize();
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
