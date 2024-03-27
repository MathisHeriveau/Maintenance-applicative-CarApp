public class ObservableDriver {

    private Car car;


    public void addCar(Car car) {
        this.removeCar();
        this.car = car;
    }

    public void removeCar() {
        this.car = null;
    }

    public void startCar(Car car) {
        car.start();
    }



}
