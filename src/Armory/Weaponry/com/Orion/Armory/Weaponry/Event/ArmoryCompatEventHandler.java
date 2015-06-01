package com.Orion.Armory.Weaponry.Event;

import com.Orion.Armory.API.Events.Common.ActivateArmorAddonEvent;
import com.Orion.Armory.API.Events.Common.ModifyMaterialEvent;
import com.Orion.Armory.API.Events.Common.RegisterMaterialsEvent;
import com.Orion.Armory.Common.Item.Armor.TierMedieval.ArmorMaterialMedieval;
import com.Orion.Armory.Common.Registry.MedievalRegistry;
import com.Orion.Armory.Util.Client.TranslationKeys;
import com.Orion.Armory.Weaponry.Common.Compatibility.ArmoryMedieval;
import com.Orion.Armory.Weaponry.Util.Client.Colors;
import com.Orion.Armory.Weaponry.Util.References;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import tconstruct.tools.TinkerTools;

import java.util.HashMap;

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
        ArmorMaterialMedieval tChain = new ArmorMaterialMedieval(References.InternalNames.Materials.Vanilla.CHAIN, TranslationKeys.Materials.VisibleNames.Steel, "Steel", EnumChatFormatting.GRAY, true, new HashMap<String, Float>(), new HashMap<String, Integer>(), new HashMap<String, Integer>(), new HashMap<String, Boolean>(), Colors.Metals.CHAIN, 1148, 0.25F, new ItemStack(TinkerTools.materials, 1, 16));
        ArmorMaterialMedieval tAlumite = new ArmorMaterialMedieval(References.InternalNames.Materials.TinkersConstruct.ALUMITE, TranslationKeys.Materials.VisibleNames.Alumite, "Alumite", EnumChatFormatting.RED, true, new HashMap<String, Float>(), new HashMap<String, Integer>(), new HashMap<String, Integer>(), new HashMap<String, Boolean>(), Colors.Metals.ALUMITE, 1023, 0.2F, new ItemStack(TinkerTools.materials, 1, 15));
        ArmorMaterialMedieval tArdite = new ArmorMaterialMedieval(References.InternalNames.Materials.TinkersConstruct.ARDITE, TranslationKeys.Materials.VisibleNames.Ardite, "Ardite", EnumChatFormatting.DARK_RED, true, new HashMap<String, Float>(), new HashMap<String, Integer>(), new HashMap<String, Integer>(), new HashMap<String, Boolean>(), Colors.Metals.ARDITE, 1752, 0.4F, new ItemStack(TinkerTools.materials, 1, 4));
        ArmorMaterialMedieval tCobalt = new ArmorMaterialMedieval(References.InternalNames.Materials.TinkersConstruct.COBALT, TranslationKeys.Materials.VisibleNames.Cobalt, "Cobalt", EnumChatFormatting.BLUE, true, new HashMap<String, Float>(), new HashMap<String, Integer>(), new HashMap<String, Integer>(), new HashMap<String, Boolean>(), Colors.Metals.COBALT, 1635, 0.3F, new ItemStack(TinkerTools.materials, 1, 3));
        ArmorMaterialMedieval tManyullun = new ArmorMaterialMedieval(References.InternalNames.Materials.TinkersConstruct.MANYULLUN, TranslationKeys.Materials.VisibleNames.Manyullun, "Manyullyn", EnumChatFormatting.LIGHT_PURPLE, true, new HashMap<String, Float>(), new HashMap<String, Integer>(), new HashMap<String, Integer>(), new HashMap<String, Boolean>(), Colors.Metals.MANYULLUN, 2963, 0.489F, new ItemStack(TinkerTools.materials, 1, 5));
        ArmorMaterialMedieval tBronze = new ArmorMaterialMedieval(References.InternalNames.Materials.Common.BRONZE, TranslationKeys.Materials.VisibleNames.Bronze, "Bronze", EnumChatFormatting.GOLD, true, new HashMap<String, Float>(), new HashMap<String, Integer>(), new HashMap<String, Integer>(), new HashMap<String, Boolean>(), Colors.Metals.BRONZE, 950, 0.186F, new ItemStack(TinkerTools.materials, 1, 13));

        MedievalRegistry.getInstance().registerMaterial(tChain);
        MedievalRegistry.getInstance().registerMaterial(tAlumite);
        MedievalRegistry.getInstance().registerMaterial(tArdite);
        MedievalRegistry.getInstance().registerMaterial(tCobalt);
        MedievalRegistry.getInstance().registerMaterial(tManyullun);
        MedievalRegistry.getInstance().registerMaterial(tBronze);
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
