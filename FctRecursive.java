public class FctRecursive {
    public static int calculerFactorielle(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculerFactorielle(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int nombre = 5;
        int resultat = calculerFactorielle(nombre);
        System.out.println("La factorielle de " + nombre + " est : " + resultat);
    }
}
