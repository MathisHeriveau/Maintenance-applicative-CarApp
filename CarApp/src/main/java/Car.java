public class Car {

    private const int MAX_SPEED = 120;
    private const int SPEED_INCREMENT = 10;
    private const int SPEED_DECREMENT = 10;
    private const int MIN_SPEED = 0;


    private String model;
    private String color;
    private int currentSpeed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.currentSpeed = MIN_SPEED;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void speedUp() {
        if (currentSpeed + SPEED_INCREMENT <= MAX_SPEED) {
            currentSpeed += SPEED_INCREMENT;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + currentSpeed);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void slowDown() {
        if (currentSpeed - SPEED_DECREMENT >= MIN_SPEED) {
            currentSpeed -= SPEED_DECREMENT;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + currentSpeed);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

