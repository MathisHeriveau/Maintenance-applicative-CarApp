public class Car {

    private const int MAX_SPEED = 120;
    private const int SPEED_INCREMENT = 10;
    private const int SPEED_DECREMENT = 10;
    private const int MIN_SPEED = 0;

    private int minAgeToDriveTheCar;
    private String model;
    private String color;
    private int currentSpeed;



    public Car(String model, String color, int minAgeToDriveTheCar) {
        this.model = model;
        this.color = color;
        this.currentSpeed = MIN_SPEED;
        this.minAgeToDriveTheCar = minAgeToDriveTheCar;
    }

    public void start() {

    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void speedUp() {
        if (currentSpeed + SPEED_INCREMENT <= MAX_SPEED) {
            currentSpeed += SPEED_INCREMENT;
            // afficher détails
            this.displayDetails();
        } else {
            this.maxSpeed();
        }
    }

    public void slowDown() {
        if (currentSpeed - SPEED_DECREMENT >= MIN_SPEED) {
            currentSpeed -= SPEED_DECREMENT;
            // afficher détails
            this.displayDetails();
        } else {
            this.carStop();
        }
    }

    public void displayDetails() {
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Current speed : " + currentSpeed);
    }

    public void carStop() {
        currentSpeed = MIN_SPEED;
        System.out.println("La voiture est à l'arrêt.");
    }

    public void maxSpeed() {
        currentSpeed = MAX_SPEED;
        System.out.println("La voiture est à la vitesse maximale.");
    }

}

