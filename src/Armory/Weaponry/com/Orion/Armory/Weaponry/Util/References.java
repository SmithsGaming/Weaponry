package com.Orion.Armory.Weaponry.Util;

import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 10:53
 * <p/>
 * Copyrighted according to Project specific license
 */
public class References {

    public class General {
        public static final String MOD_ID = "Armory-Weaponry";
        public static final String VERSION = "@VERSION@";
        public static final String MC_VERSION = "@MCVERSION";
    }

    public class InternalNames {
        public class Materials {

            public class Vanilla{
                public static final String CHAIN = "Vanilla.Chain";
            }

            public class Common {
                public static final String BRONZE = "Common.Bronze";
            }

            public class TinkersConstruct {
                public static final String ALUMITE = "TConstruct.Alumite";
                public static final String ARDITE = "TConstruct.Ardite";
                public static final String COBALT = "TConstruct.Cobalt";
                public static final String MANYULLUN = "TConstruct.Manyullyn";
            }
        }
    }
}
