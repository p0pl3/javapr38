package Practice6.Builder;

public class RazerKeyboardBuilder implements KeyboardBuilder {
    @Override
    public Plate createPlate(String name) {
        return new Plate("Razer plate");
    }

    @Override
    public Keycap[] createKeycaps(String symbol1, String symbol2, String symbol3, String symbol4) {
        return new Keycap[]{
                new Keycap("Qq"),
                new Keycap("Ww"),
                new Keycap("Ee"),
                new Keycap("Rr"),
        };
    }

    @Override
    public Switch[] createSwitches(String color1, String color2, String color3, String color4) {
        return new Switch[]{
                new Switch("red"),
                new Switch("black"),
                new Switch("yellow"),
                new Switch("white")
        };
    }
}
