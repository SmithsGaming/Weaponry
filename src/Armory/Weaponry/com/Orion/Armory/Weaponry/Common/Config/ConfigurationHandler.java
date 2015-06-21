package com.Orion.Armory.Weaponry.Common.Config;

import com.Orion.Armory.Weaponry.Util.References;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Marc on 6-6-2015.
 */
public class ConfigurationHandler
{

    private static final String GLOBALCATEGORIE = "Global";
    private static Configuration iConfig;

    public static void init(File pConfigFile) {
        if (iConfig == null) {
            iConfig = new Configuration(new File(pConfigFile.getParentFile().getAbsolutePath() + "\\Armory\\Addons\\Weaponry.cfg"), true);
            loadWorldGenConfiguration();
        }
    }

    private static void loadWorldGenConfiguration()
    {
        WeaponryConfigs.doAutomaticTinkersConstructGeneration = iConfig.getBoolean(References.InternalNames.Config.doAutomaticTiCConversion, GLOBALCATEGORIE, WeaponryConfigs.doAutomaticTinkersConstructGeneration, "If enabled all metals in the TiC Registry to the Armory System. Be aware that this conversion might not be perfect in terms of Metal Color and Material properties.");
        
        if (iConfig.hasChanged())
        {
            iConfig.save();
        }
    }
}
