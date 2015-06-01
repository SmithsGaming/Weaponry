package com.Orion.Armory.Weaponry.Client;

import com.Orion.Armory.Weaponry.Client.Compatibility.ClientArmoryCompatEventHandler;
import com.Orion.Armory.Weaponry.Common.CommonProxy;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 12:27
 * <p/>
 * Copyrighted according to Project specific license
 */
public class ClientProxy extends CommonProxy
{

    @Override
    public void registerEventHandlers() {
        super.registerEventHandlers();
        MinecraftForge.EVENT_BUS.register(new ClientArmoryCompatEventHandler());
    }
}
