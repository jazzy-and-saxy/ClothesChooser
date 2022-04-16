package me.jazzyjake.clothes;

import me.jazzyjake.data.Color;
import me.jazzyjake.data.Pattern;
import me.jazzyjake.data.TopType;

public class Top extends Clothes {
    private TopType type;
    private SleeveLength length;

    public Top(TopType type, Pattern pattern, SleeveLength length, Color... colors) {
        super(pattern, colors);

        this.type = type;
        this.length = length;
    }

    private enum SleeveLength {
        TANK_TOP, SHORT, LONG
    }
}
