package Practice7.Facade;

class FacadeCar {
    private Key key;
    private Engine engine;

    public FacadeCar() {
        key = new Key();
        engine = new Engine();
    }

    public void startCar() {
        key.start();
        engine.start();
    }

    public void stopCar() {
        key.stop();
        engine.stop();
    }
}


