package com.smithsmodding.armory.weaponry.common.config;

import com.smithsmodding.armory.weaponry.util.References;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Marc on 6-6-2015.
 */
public class WeaponryConfigs
{

    public static Boolean doAutomaticTinkersConstructGeneration = true;

    /**
     * Created by Marc on 6-6-2015.
     */
    public static class ConfigurationHandler
    {

        private static final String GLOBALCATEGORIE = "Global";
        private static Configuration config;

        public static void init(File file) {
            if (config == null) {
                config = new Configuration(new File(file.getParentFile().getAbsolutePath() + "\\armory\\Addons\\weaponry.cfg"), true);
                loadWeaponryConfiguration();
            }
        }

        private static void loadWeaponryConfiguration()
        {
            doAutomaticTinkersConstructGeneration = config.getBoolean(References.InternalNames.Config.doAutomaticTiCConversion, GLOBALCATEGORIE, doAutomaticTinkersConstructGeneration, "If enabled all metals in the TiC Registry to the armory System. Be aware that this conversion might not be perfect in terms of Metal Color and Material properties.");

            if (config.hasChanged())
            {
                config.save();
            }
        }
    }
}
