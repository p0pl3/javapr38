package Practice7.Proxy;

public class RealSubject implements Subject {
    private String name;

    public RealSubject(String name) {
        this.name = name;
    }

    public void request() {
        System.out.println("Name " + name);
    }
}
