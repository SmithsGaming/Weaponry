package com.smithsmodding.armory.weaponry.common.compatibility;

import com.smithsmodding.armory.api.materials.MaterialRenderControllers;
import com.smithsmodding.smithscore.util.client.color.MinecraftColor;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import slimeknights.tconstruct.library.client.MaterialRenderInfo;

/**
 * Author Orion (Created on: 14.07.2016)
 */
public class ConversionRenderInfo extends MaterialRenderControllers.AbstractMaterialTextureController {

    private final MaterialRenderInfo tconRenderInfo;
    private MinecraftColor color;

    public ConversionRenderInfo(MaterialRenderInfo tconRenderInfo) {
        this.tconRenderInfo = tconRenderInfo;
        this.color = new MinecraftColor(tconRenderInfo.getVertexColor());
    }

    @Override
    public TextureAtlasSprite getTexture(TextureAtlasSprite baseTexture, String location) {
        TextureAtlasSprite sprite = tconRenderInfo.getTexture(baseTexture, location);
        return sprite;
    }

    @Override
    public boolean isStitched() {
        return tconRenderInfo.isStitched();
    }

    @Override
    public boolean useVertexColoring() {
        return tconRenderInfo.useVertexColoring();
    }

    @Override
    public MinecraftColor getVertexColor() {
        return color;
    }

    @Override
    public String getTextureSuffix() {
        return tconRenderInfo.getTextureSuffix();
    }
}
