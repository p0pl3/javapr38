package Practice6.FactoryMethod;

public class SmartphoneSelector {
    public static final SmartphoneSelector SMARTPHONE_SELECTOR = new SmartphoneSelector();

    private SmartphoneSelector() {
    }

    Smartphone getSmartphone(String type) {
        switch (type) {
            case "ap":
                return new Android();
            case "an":
                return new Apple();
            default:
                return null;
        }
    }
}
