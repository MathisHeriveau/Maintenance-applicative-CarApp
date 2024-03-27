public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Driver myDriver = new Driver("John", 20);

        myDriver.startCar(myCar);
        maVoiture.speedUp();
        myDriver.changeSpeed(myCar, 80);
        maVoiture.slowDown();
        myDriver.changeSpeed(myCar,30);
        myDriver.stopCar(myCar);
        System.out.println("fini");
    }
}
