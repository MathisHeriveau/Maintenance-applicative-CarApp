public class Driver extends ObservableDriver{


    private String name;
    private int age;


    public Driver(String name, int years) {
        this.name = name;
        this.age = years;
    }


    public void turnKey() {
        try {
            this.startCar();
        } catch (String e) {
            System.out.println("La voiture ne démarre pas : " + e);
        }
    }

    public void stopCar(Voiture voiture) {

        System.out.println(name + " arrête la voiture.");

    }

    public void changeSpeed(Car car, int newSpeed) {
        int currentSpeed;
        if (car.getCurrentSpeed() >= newSpeed) {
            while (car.getCurrentSpeed() > newSpeed) {
                car.slowDown();
            }
        } else  {
            while (car.getCurrentSpeed() < newSpeed) {
                car.speedUp();
            }
        }
    }
}
