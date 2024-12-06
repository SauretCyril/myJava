package root.arg;

public class arg {

    public static void main(String[] args) {
        if (args.length > 0) {

            for (String oneArg : args) {
                sayHelloTo(oneArg);
            }
        }
    }

    /**
     * Le programme commence ici
     * 
     * @param args arguments envoyé avec la ligne de commande
     */

    private static void sayHelloTo(String recipient) {
        System.out.println("Hello " + recipient + " !");
    }
}
