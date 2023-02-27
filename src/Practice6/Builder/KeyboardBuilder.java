package Practice6.Builder;

public interface KeyboardBuilder {
    Plate createPlate(String name);

    Keycap[] createKeycaps(String symbol1, String symbol2, String symbol3, String symbol4);

    Switch[] createSwitches(String color1, String color2, String color3, String color4);
}
