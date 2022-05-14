package com.pan233.marryme;

import com.pan233.marryme.item.MarryMeItems;
import com.pan233.marryme.painting.MarryMePaintings;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarryMeMod implements ModInitializer {
	public static final String MOD_ID = "marryme";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("MarryMeMod!");
		MarryMeItems.registerModItems();
		MarryMePaintings.registerPaintings();
	}
}
