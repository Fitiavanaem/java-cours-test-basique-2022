import java.util.Random;

public class MathApplication {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nombresPairs = new int[2];
        int[] nombresImpairs = new int[2];

        int i = 0;
        while (i < 2) {
            int nombre = random.nextInt(100); // Génère un nombre aléatoire entre 0 et 99 inclus
            if (nombre % 2 == 0) {
                nombresPairs[i] = nombre;
                i++;
            }
        }

        i = 0;
        while (i < 2) {
            int nombre = random.nextInt(100);
            if (nombre % 2 != 0) {
                nombresImpairs[i] = nombre;
                i++;
            }
        }

        System.out.println("Nombres pairs :");
        for (int pair : nombresPairs) {
            System.out.println(pair);
        }

        System.out.println("Nombres impairs :");
        for (int impair : nombresImpairs) {
            System.out.println(impair);
        }
    }
}
