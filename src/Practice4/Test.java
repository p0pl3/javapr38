package Practice4;

public class Test {
    public static void main(String[] args) {
        MyExecutorService executorService = new MyExecutorService(3);
        executorService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
        executorService.submit(() -> System.out.println("Start"));
        executorService.shutdown();
    }
}
