package me.jazzyjake.clothes;

import me.jazzyjake.data.Color;
import me.jazzyjake.data.Pattern;

abstract class Clothes {
    private Color[] colors;
    private Pattern pattern;

    Clothes (Pattern pattern, Color... colors) {
        this.colors = colors;
        this.pattern = pattern;
    }
}
