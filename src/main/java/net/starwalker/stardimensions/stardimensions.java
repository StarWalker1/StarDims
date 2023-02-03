package net.starwalker.stardimensions;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.starwalker.stardimensions.world.dimension.ModDimensions;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(stardimensions.MOD_ID)
public class stardimensions {

    public static final String MOD_ID = "stardimensions";

    private static final Logger LOGGER = LogUtils.getLogger();

    public stardimensions() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModDimensions.register();


        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
