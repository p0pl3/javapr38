package Practice6.AbstractFactory;

public class BlackTable implements Table {
    @Override
    public void put() {
        System.out.println("put on black table");
    }
}
