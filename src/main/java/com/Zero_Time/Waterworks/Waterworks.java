package com.Zero_Time.Waterworks;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;




@Mod(Waterworks.MOD_ID)
public class Waterworks {
    public static final String MOD_ID = "waterworks";


    public Waterworks(){
        DistExecutor.runForDist(
                ()-> ()-> new SideProxy.Client(),
                ()-> ()-> new SideProxy.Server()
        );

    }

    public static ResourceLocation getid(String path){
        return new ResourceLocation(MOD_ID, path);
    }


}
