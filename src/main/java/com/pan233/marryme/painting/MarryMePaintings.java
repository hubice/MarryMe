package com.pan233.marryme.painting;

import com.pan233.marryme.MarryMeMod;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MarryMePaintings {

    public static final PaintingMotive GROUP_PHOTO = registerPainting("group_photo", new PaintingMotive(80,48));

    private static PaintingMotive registerPainting(String name, PaintingMotive pointingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(MarryMeMod.MOD_ID, name), pointingMotive);
    }

    public static void registerPaintings() {
    }
}
