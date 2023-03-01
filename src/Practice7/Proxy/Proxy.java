package Practice7.Proxy;

public class Proxy implements Subject {
    private String name;
    private RealSubject image;

    public Proxy(String name) {
        this.name = name;
    }

    public void request() {
        if (image == null) {
            image = new RealSubject(name);
        }
        image.request();
    }
}
