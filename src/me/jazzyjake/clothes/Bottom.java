package me.jazzyjake.clothes;

import me.jazzyjake.data.BottomType;
import me.jazzyjake.data.Color;
import me.jazzyjake.data.Pattern;

public class Bottom extends Clothes {
    private BottomType type;

    public Bottom(BottomType type, Pattern pattern, Color... colors) {
        super(pattern, colors);

        this.type = type;
    }
}
