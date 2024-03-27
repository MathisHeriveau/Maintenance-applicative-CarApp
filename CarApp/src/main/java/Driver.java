public class Driver {
    private String name;
    private int age;

    public Driver(String name, int years) {
        this.name = name;
        this.age = years;
    }

    public boolean isOld() {
        return age >= 10;
    }

    public void startCar(Car car) {
        if (isOld()) {
            System.out.println(name + " démarre la car.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Voiture voiture) {
        System.out.println(name + " arrête la voiture.");
    }

    public void changeSpeed(Car car, int newSpeed) {
        System.out.println(name + " change la vitesse de la car à " + newSpeed);
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
