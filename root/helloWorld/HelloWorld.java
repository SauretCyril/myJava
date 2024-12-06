package root.helloWorld;

/**
 * Ceci est une implémentation du message traditionnel "Hello world!"
 * 
 * @author L'équipe Education d'OpenClassrooms
 */
public class HelloWorld {
    /** Le programme commence ici */
    // static int[] myArray = new int[] { -1, -7, 2, 4, 10, -1, 5 };
    static int[] myArray = new int[0];

    public static void main(String[] args) {

        String temp = show_defPlusBasseTemperature();
        System.out.println("la temperature la plus basse est  " + temp);
        // System.out.println("Hello World!");
        // sayHelloTo("Hello World!");
        // sayClap();
    }

    /**
     * affiche le message "hello" au destinataire fourni
     *
     * @param recipient
     */
    private static void sayHelloTo(String recipient) {
        System.out.println("Hello " + recipient);
    }

    private static void sayClap() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Clap your hands!");
        }
    }

    /**
     * afficher la temperature la plus basse
     * 
     * @return
     */
    private static String show_defPlusBasseTemperature() {
        if (myArray.length == 0) {
            return "Aucune temperature n'a été enregistrée";
        } else {
            return "la temperature la plus basse est " + defPlusBasseTemperature();
        }

    }

    /**
     * recherche la temperature la plus basse dans le tableau
     */

    private static int defPlusBasseTemperature() {

        int value = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
            if (myArray[i] < 0 && myArray[i] > value) {
                value = myArray[i];
            } else if (myArray[i] > 0 && myArray[i] < value) {
                value = myArray[i];
            }

        }
        return value;
    }

}