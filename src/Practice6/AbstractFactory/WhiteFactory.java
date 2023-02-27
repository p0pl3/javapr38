package Practice6.AbstractFactory;

public class WhiteFactory implements Factory {
    @Override
    public Table createTable() {
        return new BlackTable();
    }

    @Override
    public Chair createChair() {
        return new WhiteChair();
    }

}
