public class Car {

    private String model;
    private String color;
    private int currentSpeed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.currentSpeed = 0;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void speedUp() {
        if (currentSpeed + 10 <= 120) {
            currentSpeed += 10;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + currentSpeed);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void slowDown() {
        if (currentSpeed - 10 >= 0) {
            currentSpeed -= 10;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + currentSpeed);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

