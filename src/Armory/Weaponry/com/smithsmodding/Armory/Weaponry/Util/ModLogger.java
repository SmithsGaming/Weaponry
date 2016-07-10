package com.smithsmodding.armory.weaponry.util;

import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public final class ModLogger {
    private static final com.smithsmodding.armory.api.util.references.ModLogger instance = new com.smithsmodding.armory.api.util.references.ModLogger(References.General.MOD_ID);

    public static com.smithsmodding.armory.api.util.references.ModLogger getInstance() {
        return instance;
    }
}
