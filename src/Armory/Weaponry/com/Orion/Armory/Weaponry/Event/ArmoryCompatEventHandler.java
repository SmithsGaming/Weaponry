package com.Orion.Armory.Weaponry.Event;

import com.Orion.Armory.API.Events.Common.ActivateArmorAddonEvent;
import com.Orion.Armory.API.Events.Common.ModifyMaterialEvent;
import com.Orion.Armory.API.Events.Common.RegisterMaterialsEvent;
import com.Orion.Armory.API.Materials.IArmorMaterial;
import com.Orion.Armory.Common.Material.ArmorMaterial;
import com.Orion.Armory.Common.Material.MaterialRegistry;
import com.Orion.Armory.Common.Registry.GeneralRegistry;
import com.Orion.Armory.Util.Client.TranslationKeys;
import com.Orion.Armory.Util.Core.ItemStackHelper;
import com.Orion.Armory.Weaponry.Common.Compatibility.ArmoryMedieval;
import com.Orion.Armory.Weaponry.Common.Config.WeaponryConfigs;
import com.Orion.Armory.Weaponry.Util.Client.Colors;
import com.Orion.Armory.Weaponry.Util.References;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.oredict.OreDictionary;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.crafting.CastingRecipe;
import tconstruct.library.crafting.FluidType;
import tconstruct.library.crafting.LiquidCasting;
import tconstruct.tools.TinkerTools;


/**
 * Created by Orion
 * Created on 01.06.2015
 * 11:07
 * <p/>
 * Copyrighted according to Project specific license
 */
public class ArmoryCompatEventHandler
{

    @SubscribeEvent
    public void RegisterMaterialsHandler(RegisterMaterialsEvent pEvent)
    {
        ArmorMaterial tChain = new ArmorMaterial(References.InternalNames.Materials.Vanilla.CHAIN, TranslationKeys.Materials.VisibleNames.Steel, "Steel", EnumChatFormatting.GRAY, true, 1378, 0.25F, Colors.Metals.CHAIN, new ItemStack(TinkerTools.materials, 1, 16));
        ArmorMaterial tAlumite = new ArmorMaterial(References.InternalNames.Materials.TinkersConstruct.ALUMITE, TranslationKeys.Materials.VisibleNames.Alumite, "Alumite", EnumChatFormatting.LIGHT_PURPLE, true, 1259, 0.2F, Colors.Metals.ALUMITE, new ItemStack(TinkerTools.materials, 1, 15));
        ArmorMaterial tArdite = new ArmorMaterial(References.InternalNames.Materials.TinkersConstruct.ARDITE, TranslationKeys.Materials.VisibleNames.Ardite, "Ardite", EnumChatFormatting.DARK_RED, true, 2159, 0.4F, Colors.Metals.ARDITE, new ItemStack(TinkerTools.materials, 1, 4));
        ArmorMaterial tCobalt = new ArmorMaterial(References.InternalNames.Materials.TinkersConstruct.COBALT, TranslationKeys.Materials.VisibleNames.Cobalt, "Cobalt", EnumChatFormatting.DARK_BLUE, true, 2056, 0.3F, Colors.Metals.COBALT, new ItemStack(TinkerTools.materials, 1, 3));
        ArmorMaterial tManyullun = new ArmorMaterial(References.InternalNames.Materials.TinkersConstruct.MANYULLUN, TranslationKeys.Materials.VisibleNames.Manyullun, "Manyullyn", EnumChatFormatting.DARK_PURPLE, true, 4215, 0.489F, Colors.Metals.MANYULLUN, new ItemStack(TinkerTools.materials, 1, 5));
        ArmorMaterial tBronze = new ArmorMaterial(References.InternalNames.Materials.Common.BRONZE, TranslationKeys.Materials.VisibleNames.Bronze, "Bronze", EnumChatFormatting.GOLD, true, 1193, 0.186F, Colors.Metals.BRONZE, new ItemStack(TinkerTools.materials, 1, 13));

        MaterialRegistry.getInstance().registerMaterial(tChain);
        MaterialRegistry.getInstance().registerMaterial(tAlumite);
        MaterialRegistry.getInstance().registerMaterial(tArdite);
        MaterialRegistry.getInstance().registerMaterial(tCobalt);
        MaterialRegistry.getInstance().registerMaterial(tManyullun);
        MaterialRegistry.getInstance().registerMaterial(tBronze);

        if (WeaponryConfigs.doAutomaticTinkersConstructGeneration)
        {
            checkTinkersConstructMetals();
        }
    }

    private void checkTinkersConstructMetals() {
        GeneralRegistry.iLogger.info("Started checking TiC Registry.");
        int tRecipesFound = 0;
        LiquidCasting tCastingRegistry = TConstructRegistry.getTableCasting();

        for(CastingRecipe tRecipe : tCastingRegistry.getCastingRecipes())
        {
            if (checkIfRegisterIsNeededForRecipe(tRecipe))
                tRecipesFound ++;
        }

        GeneralRegistry.iLogger.info("Finished searching TiC Registry. Found: " + tRecipesFound + " suitable candidates.");
    }

    private boolean checkIfRegisterIsNeededForRecipe(CastingRecipe tRecipe)
    {
        int[] tOreIDs = OreDictionary.getOreIDs(tRecipe.output);

        //Verify if metal was not already registered.
        for (int tOreID : tOreIDs)
        {
            String tOreName = OreDictionary.getOreName(tOreID);

            if (tOreName.contains("ingot"))
            {
                String tMetalName = tOreName.replace("ingot", "");

                for(IArmorMaterial tMaterial : MaterialRegistry.getInstance().getArmorMaterials().values())
                {
                    if (tMaterial.getOreDicName().equals(tMetalName))
                        return false;
                }
            }
        }


        for (int tOreID : tOreIDs)
        {
            if (OreDictionary.getOreName(tOreID).toLowerCase().contains("ingot"))
            {
                GeneralRegistry.iLogger.info("Found metal ingot in TiC LiquidCasting: " + OreDictionary.getOreName(tOreID) + " - For Itemstack: " + ItemStackHelper.toString(tRecipe.output) + " - Inserting it into Armory if possible!");

                ArmorMaterial tAutoMatedMaterial = new ArmorMaterial(References.InternalNames.Materials.AUTOGENERATED + OreDictionary.getOreName(tOreID).replace("ingot", ""), OreDictionary.getOreName(tOreID).replace("ingot", ""), OreDictionary.getOreName(tOreID).replace("ingot", ""), true, FluidType.getFluidType(tRecipe.castingMetal.getFluid()).baseTemperature * 1.4F * 3.2F, (FluidType.getFluidType(tRecipe.castingMetal.getFluid()).baseTemperature * 1.4F * 3.2F)/ 8288F, tRecipe.output);
                MaterialRegistry.getInstance().registerMaterial(tAutoMatedMaterial);

                return true;
            }
        }

        return false;
    }

    @SubscribeEvent
    public void ActivateArmorAddonHandler(ActivateArmorAddonEvent pEvent)
    {
        if (!pEvent.iArmorMaterial.getType().equals(com.Orion.Armory.Util.References.InternalNames.Tiers.MEDIEVAL))
            return;

        if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Helmet.TOP))
        {
            ArmoryMedieval.HandleTopHeadMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Helmet.RIGHT))
        {
            ArmoryMedieval.HandleRightSideHeadMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Helmet.LEFT))
        {
            ArmoryMedieval.HandleLeftSideHeadMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.SHOULDERLEFT))
        {
            ArmoryMedieval.HandleLeftShoulderPadMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.SHOULDERRIGHT))
        {
            ArmoryMedieval.HandleRightShouldPadMaterialsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.FRONTLEFT))
        {
            ArmoryMedieval.HandleLeftFrontChestplateMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.FRONTRIGHT))
        {
            ArmoryMedieval.HandleRightFrontChestplateMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.BACKLEFT))
        {
            ArmoryMedieval.HandleLeftBackChestplateMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.BACKRIGHT))
        {
            ArmoryMedieval.HandleRightBackChestplateMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Leggings.FRONTLEFT))
        {
            ArmoryMedieval.HandleLeftFrontLeggingsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Leggings.FRONTRIGHT))
        {
            ArmoryMedieval.HandleRightFrontLeggingsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Leggings.BACKLEFT))
        {
            ArmoryMedieval.HandleLeftBackLeggingsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Leggings.BACKRIGHT))
        {
            ArmoryMedieval.HandleRightBackLegginsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Shoes.LEFT))
        {
            ArmoryMedieval.HandleLeftShoesMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Shoes.RIGHT))
        {
            ArmoryMedieval.HandleRightShoesMaterials(pEvent);
        }
    }

    @SubscribeEvent
    public void ModifyMaterialHandler(ModifyMaterialEvent pEvent)
    {
        if (pEvent.iArmor.getInternalName().equals(com.Orion.Armory.Util.References.InternalNames.Armor.MEDIEVALHELMET))
        {
            ArmoryMedieval.ModifyMaterialForHelmet(pEvent);
        }
        else if (pEvent.iArmor.getInternalName().equals(com.Orion.Armory.Util.References.InternalNames.Armor.MEDIEVALCHESTPLATE))
        {
            ArmoryMedieval.ModifyMaterialForChestplate(pEvent);
        }
        else if (pEvent.iArmor.getInternalName().equals(com.Orion.Armory.Util.References.InternalNames.Armor.MEDIEVALLEGGINGS))
        {
            ArmoryMedieval.ModifyMaterialForLeggings(pEvent);
        }
        else if (pEvent.iArmor.getInternalName().equals(com.Orion.Armory.Util.References.InternalNames.Armor.MEDIEVALSHOES))
        {
            ArmoryMedieval.ModifyMaterialForShoes(pEvent);
        }
        else
        {
            ArmoryMedieval.ModifyMaterialForOther(pEvent);
        }
    }


}
