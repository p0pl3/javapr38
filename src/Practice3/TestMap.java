package Practice3;

public class TestMap {
    public static void main(String[] args) throws Exception {
        MyMap<Integer, Integer> mymap = new MyMap<>();
        Thread one = new Thread(() -> {
            mymap.put(1, 1);

        });
        Thread two = new Thread(() -> {
            mymap.get(1);
        });
        one.start();
        two.start();
        Thread.sleep(1000);
    }
}
