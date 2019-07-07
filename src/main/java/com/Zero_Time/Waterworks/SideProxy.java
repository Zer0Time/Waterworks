package com.Zero_Time.Waterworks;

import com.Zero_Time.Waterworks.init.ModBlocks;
import com.Zero_Time.Waterworks.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class SideProxy {
    SideProxy(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModBlocks::registerall);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModItems::registerAll);
        MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);
    }
    private static void commonSetup(FMLCommonSetupEvent event){

    }
    private static void enqueueIMC(final InterModEnqueueEvent event){

    }
    private static void processIMC(final InterModProcessEvent event){

    }
    private static void serverStarting(FMLServerStartingEvent event){

    }
    static class Client extends SideProxy{
        Client(){
            FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);
        }
        private static void clientSetup(FMLClientSetupEvent event){

        }
    }

    static class Server extends SideProxy{
        Server(){
            FMLJavaModLoadingContext.get().getModEventBus().addListener(Server::serverSetup);
        }
        private static void serverSetup(FMLDedicatedServerSetupEvent event){

        }
    }
}
