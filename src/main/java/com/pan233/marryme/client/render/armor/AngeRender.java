package com.pan233.marryme.client.render.armor;

import com.pan233.marryme.client.models.armor.AngeModel;
import com.pan233.marryme.item.armor.AngeArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AngeRender extends GeoArmorRenderer<AngeArmor> {
    public AngeRender() {
        super(new AngeModel());
        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
    }
}
