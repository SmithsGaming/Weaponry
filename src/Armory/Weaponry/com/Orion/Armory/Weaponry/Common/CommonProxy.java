package com.Orion.Armory.Weaponry.Common;

import com.Orion.Armory.Weaponry.Event.ArmoryCompatEventHandler;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 10:57
 * <p/>
 * Copyrighted according to Project specific license
 */
public class CommonProxy
{

    public void registerEventHandlers()
    {
        MinecraftForge.EVENT_BUS.register(new ArmoryCompatEventHandler());
    }
}
