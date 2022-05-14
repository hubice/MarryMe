package com.pan233.marryme;

import com.pan233.marryme.client.render.armor.AngeRender;
import com.pan233.marryme.item.MarryMeItems;
import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MarryMeClientMod implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		MarryMeMod.LOGGER.info("MarryMeClientMod!");
		GeoArmorRenderer.registerArmorRenderer(new AngeRender(), MarryMeItems.ANGE_CHEST, MarryMeItems.ANGE_HELMET);
	}
}
