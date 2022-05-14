package com.pan233.marryme.client.models.armor;

import com.pan233.marryme.MarryMeMod;
import com.pan233.marryme.item.armor.AngeArmor;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AngeModel extends AnimatedGeoModel<AngeArmor> {

    @Override
    public Identifier getModelLocation(AngeArmor object) {
        return new Identifier(MarryMeMod.MOD_ID, "geo/ange.geo.json");
    }

    @Override
    public Identifier getTextureLocation(AngeArmor object) {
        return new Identifier(MarryMeMod.MOD_ID, "textures/models/armor/ange.png");
    }

    @Override
    public Identifier getAnimationFileLocation(AngeArmor animatable) {
        return new Identifier(MarryMeMod.MOD_ID, "animations/ange.json");
    }
}
