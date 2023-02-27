package Practice3;

public class TestSet {
    public static void main(String[] args) throws Exception {
        MySet<Integer> myset = new MySet<>();
        Thread one = new Thread(() -> {
            myset.add(1);

        });
        Thread two = new Thread(() -> {
            myset.remove(2);
        });
        one.start();
        two.start();
        Thread.sleep(1000);
    }
}
