public class FctIterative {
    public static int calculerFactorielle(int n) {
        int resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        return resultat;
    }
    
    public static void main(String[] args) {
        int nombre = 5;
        int resultat = calculerFactorielle(nombre);
        System.out.println("La factorielle de " + nombre + " est : " + resultat);
    }
}
