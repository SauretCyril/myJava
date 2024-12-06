package root.poo;

public class OC {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture();

        Bateau monBateau = new Bateau();

        maVoiture.start();
        monBateau.start();

    }
}

class Vehicule {
    String color = "red";

    void start() {
        System.out.println("Le véhicule démarre");
    }

    public void paint(Vehicule veh, String color) {
        veh.color = color;
    }

}

class Voiture extends Vehicule {
    void allumerFeux() {
        System.out.println("Les feux s'allument");
    }

    @Override
    void start() {
        super.start();
        allumerFeux();
    }
}

class Bateau extends Vehicule {

}