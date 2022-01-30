package com.zook.devtech;

import gregtech.api.GTValues;
import gregtech.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DevTech.MODID,
        name = DevTech.NAME,
        version = DevTech.VERSION,
        dependencies = "required:forge@[14.23.5.2847,);" + GTValues.MOD_VERSION_DEP + "after:crafttweaker")
public class DevTech {
    public static final String MODID = "devtech";
    public static final String NAME = "DevTech";
    public static final String VERSION = "1.0";

    @SidedProxy(modId = GTValues.MODID, clientSide = "com.zook.devtech.client.ClientProxy", serverSide = "com.zook.devtech.common.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }
}
