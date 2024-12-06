package root.doWhile;

public class doWhile {
    public static void main(String[] args) {
        boucler();
    }

    public static void boucler() {
        // Boucle "While"
        int pushUpGoal = 10; // Initialisation corrigée
        while (pushUpGoal > 0) {
            System.out.println("Push up! " + pushUpGoal);
            pushUpGoal -= 1;
        }
        // Boucle "do/while"
        pushUpGoal = 10;
        do {
            System.out.println("Push up! " + pushUpGoal);
            pushUpGoal -= 1;
        } while (pushUpGoal > 0);
    }
}
