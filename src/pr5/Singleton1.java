package pr5;

public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();
    private int counter;

    private Singleton1() {
        System.out.println("S1 created");
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

    void action() {
        System.out.println("S1 " + counter++);
    }
}
