package com.Orion.Armory.Weaponry.Client.Compatibility;

import com.Orion.Armory.API.Events.Client.RegisterItemResourcesEvent;
import com.Orion.Armory.API.Events.Client.RegisterMaterialResourceEvent;
import com.Orion.Armory.Common.Item.ItemMetalChain;
import com.Orion.Armory.Common.Item.ItemMetalRing;
import com.Orion.Armory.Common.Item.ItemNugget;
import com.Orion.Armory.Common.Item.ItemPlate;
import com.Orion.Armory.Util.References;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 12:26
 * <p/>
 * Copyrighted according to Project specific license
 */
public class ClientArmoryCompatEventHandler
{

    @SubscribeEvent
    public void RegisterMaterialResourceHandler(RegisterMaterialResourceEvent pEvent)
    {
        if (pEvent.iArmor.getInternalName().equals(References.InternalNames.Armor.MEDIEVALHELMET))
        {
            if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Common.BRONZE)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Bronze.tHelmetResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Vanilla.CHAIN)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Chain.tHelmetResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ALUMITE)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Alumite.tHelmetResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ARDITE)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Ardite.tHelmetResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.COBALT)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Cobalt.tHelmetResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Manyullyn.tHelmetResource);
            }
        }
        else if (pEvent.iArmor.getInternalName().equals(References.InternalNames.Armor.MEDIEVALCHESTPLATE))
        {
            if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Common.BRONZE)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Bronze.tChestplateResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Vanilla.CHAIN)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Chain.tChestplateResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ALUMITE)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Alumite.tChestplateResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ARDITE)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Ardite.tChestplateResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.COBALT)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Cobalt.tChestplateResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Manyullyn.tChestplateResource);
            }
        }
        else if (pEvent.iArmor.getInternalName().equals(References.InternalNames.Armor.MEDIEVALLEGGINGS))
        {
            if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Common.BRONZE)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Bronze.tLegginsResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Vanilla.CHAIN)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Chain.tLegginsResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ALUMITE)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Alumite.tLegginsResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ARDITE)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Ardite.tLegginsResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.COBALT)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Cobalt.tLegginsResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Manyullyn.tLegginsResource);
            }
        }
        else if (pEvent.iArmor.getInternalName().equals(References.InternalNames.Armor.MEDIEVALSHOES))
        {
            if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Common.BRONZE)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Bronze.tShoesResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Vanilla.CHAIN)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Chain.tShoesResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ALUMITE)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Alumite.tShoesResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ARDITE)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Ardite.tShoesResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.COBALT)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Cobalt.tShoesResource);
            }
            else if (pEvent.iArmorMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
                pEvent.iArmor.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Materials.Manyullyn.tShoesResource);
            }
        }
    }

    @SubscribeEvent
    public void RegisterItemResourcesHandler(RegisterItemResourcesEvent pEvent)
    {
        if (pEvent.iContainer instanceof ItemMetalRing)
        {
            if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Common.BRONZE))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemRing.BronzeResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Vanilla.CHAIN))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemRing.ChainResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ALUMITE))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemRing.AlumiteResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ARDITE))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemRing.ArditeResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.COBALT))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemRing.CobaltResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemRing.ManyullunResource);
            }
        }
        else if (pEvent.iContainer instanceof ItemMetalChain)
        {
            if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Common.BRONZE))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemChain.BronzeResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Vanilla.CHAIN))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemChain.ChainResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ALUMITE))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemChain.AlumiteResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ARDITE))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemChain.ArditeResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.COBALT))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemChain.CobaltResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemChain.ManyullunResource);
            }
        }
        else if (pEvent.iContainer instanceof ItemNugget)
        {
            if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Common.BRONZE))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemNugget.BronzeResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Vanilla.CHAIN))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemNugget.ChainResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ALUMITE))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemNugget.AlumiteResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ARDITE))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemNugget.ArditeResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.COBALT))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemNugget.CobaltResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemNugget.ManyullunResource);
            }
        }
        else if (pEvent.iContainer instanceof ItemPlate)
        {
            if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Common.BRONZE))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemPlate.BronzeResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.Vanilla.CHAIN))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemPlate.ChainResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ALUMITE))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemPlate.AlumiteResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ARDITE))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemPlate.ArditeResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.COBALT))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemPlate.CobaltResource);
            }
            else if (pEvent.iMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN))
            {
                pEvent.iContainer.registerResource(com.Orion.Armory.Weaponry.Util.Client.Textures.Items.ItemPlate.ManyullunResource);
            }
        }
    }
}
