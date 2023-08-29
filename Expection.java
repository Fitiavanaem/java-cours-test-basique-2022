public class Expection {
    public static void main(String[] args) {
        try {
            // Code susceptible de lever une exception
            int resultat = division(10, 0);
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            // Bloc catch pour capturer et traiter l'exception ArithmeticException
            System.out.println("Erreur : Division par zéro");
        }
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
