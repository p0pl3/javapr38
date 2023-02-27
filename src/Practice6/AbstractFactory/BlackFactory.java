package Practice6.AbstractFactory;

public class BlackFactory implements Factory {
    @Override
    public Table createTable() {
        return new BlackTable();
    }

    @Override
    public Chair createChair() {
        return new BlackChair();
    }
}
