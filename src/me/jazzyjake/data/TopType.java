package me.jazzyjake.data;

public enum TopType {
    BUTTONUP(TopGroup.SHIRT), TSHIRT(TopGroup.SHIRT), CREWNECK(TopGroup.SWEATER), HOODIE(TopGroup.SWEATER), DENIM(TopGroup.JACKET), WINDBREAKER(TopGroup.JACKET), LEATHER(TopGroup.JACKET), BOMBER(TopGroup.JACKET), SUIT(TopGroup.JACKET);

    private TopGroup group;

    TopType(TopGroup group) {
        this.group = group;
    }

    private enum TopGroup {
        SHIRT, SWEATER, JACKET
    }
}
