package Practice7.Facade;

public class Test {
    public static void main(String[] args) {
        FacadeCar facadeCar = new FacadeCar();
        facadeCar.startCar();
        System.out.println();
        facadeCar.stopCar();
    }
}
