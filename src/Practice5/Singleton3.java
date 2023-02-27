package Practice5;

public class Singleton3 {

    private Singleton3(){
        System.out.println("S3 created");
    }

    public static class SingletonHolder {
        public static final Singleton3 HOLDER_INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
