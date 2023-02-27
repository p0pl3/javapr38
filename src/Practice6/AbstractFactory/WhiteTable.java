package Practice6.AbstractFactory;

public class WhiteTable implements Table {
    @Override
    public void put() {
        System.out.println("put on white table");
    }
}
