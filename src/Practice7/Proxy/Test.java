package Practice7.Proxy;

public class Test {
    public static void main(String[] args) {
        Subject subject = new Proxy("test");
        subject.request();
    }
}