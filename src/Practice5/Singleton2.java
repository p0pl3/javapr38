package Practice5;

public enum Singleton2 {
    INSTANCE;

    Singleton2() {
        System.out.println("S2 created");
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}
