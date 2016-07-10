package com.smithsmodding.armory.weaponry;

import com.smithsmodding.armory.api.IArmoryAPI;
import com.smithsmodding.armory.weaponry.common.CommonProxy;
import com.smithsmodding.armory.weaponry.common.config.WeaponryConfigs;
import com.smithsmodding.armory.weaponry.util.References;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by smithsmodding
 * Created on 01.06.2015
 * 10:52
 * <p/>
 * Copyrighted according to Project specific license
 */
@Mod(modid = References.General.MOD_ID, name = "armory-weaponry", version = References.General.VERSION,
        dependencies = "required-after:Forge;required-after:mantle;after:ForgeMultipart;required-after:tconstruct;required-after:Armory;after:armory-World")
public class Weaponry
{
    // Instance of this mod use for internal and Forge references
    @Mod.Instance(References.General.MOD_ID)
    public static Weaponry instance;

    // Proxies used to register stuff client and server side.
    @SidedProxy(clientSide="com.smithsmodding.armory.weaponry.common.CommonProxy", serverSide="com.smithsmodding.armory.weaponry.common.CommonProxy")
    public static CommonProxy proxy;

    public static IArmoryAPI armory;

    public static Side side;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        this.side = event.getSide();
        WeaponryConfigs.ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        proxy.requestArmoryAPI();
    }
}
