package com.smithsmodding.armory.weaponry.common;

import com.smithsmodding.armory.api.IArmoryAPI;
import com.smithsmodding.armory.weaponry.Weaponry;
import com.smithsmodding.armory.weaponry.common.compatibility.ArmoryMaterialInitializer;
import com.smithsmodding.armory.weaponry.util.ModLogger;
import net.minecraftforge.fml.common.event.FMLInterModComms;

/**
 * Created by smithsmodding
 * Created on 01.06.2015
 * 10:57
 * <p/>
 * Copyrighted according to Project specific license
 */
public class CommonProxy
{

    public void requestArmoryAPI() {
        ModLogger.getInstance().info("Registering API request with Armory!");
        FMLInterModComms.sendMessage("Armory", "registerapi", "com.smithsmodding.armory.weaponry.common.CommonProxy.onArmoryAPIConstructed");
    }

    public static void onArmoryAPIConstructed(IArmoryAPI api) {
        ModLogger.getInstance().info("API: " + api.getClass().getSimpleName() + " received starting init.");
        Weaponry.armory = api;
        (new ArmoryMaterialInitializer()).onAPICallbackReceived(api);
    }
}
