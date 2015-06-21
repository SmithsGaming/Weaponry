package com.Orion.Armory.Weaponry;

import com.Orion.Armory.Weaponry.Common.CommonProxy;
import com.Orion.Armory.Weaponry.Common.Config.ConfigurationHandler;
import com.Orion.Armory.Weaponry.Util.References;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 10:52
 * <p/>
 * Copyrighted according to Project specific license
 */
@Mod(modid = References.General.MOD_ID, name = "Armory-Weaponry", version = References.General.VERSION,
        dependencies = "required-after:Forge@[10.13,);required-after:Mantle;after:ForgeMultipart;required-after:TConstruct;required-after:Armory;after:Armory-World")
public class Weaponry
{
    // Instance of this mod use for internal and Forge references
    @Mod.Instance(References.General.MOD_ID)
    public static Weaponry instance;

    // Proxies used to register stuff client and server side.
    @SidedProxy(clientSide="com.Orion.Armory.Weaponry.Client.ClientProxy", serverSide="com.Orion.Armory.Weaponry.Common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        proxy.registerEventHandlers();
    }
}
