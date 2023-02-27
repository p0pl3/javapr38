package pr5;

public class Test {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton11.hashCode());

        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton22 = Singleton2.getInstance();
        Singleton2 singleton222 = Singleton2.INSTANCE;
        System.out.println(singleton2.hashCode());
        System.out.println(singleton22.hashCode());
        System.out.println(singleton222.hashCode());

        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton3 singleton33 = Singleton3.getInstance();
        System.out.println(singleton3.hashCode() + " ");
        System.out.println(singleton33.hashCode() );
    }
}
