import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mathematique {

    public static void main(String[] args) {
        List<Integer> listeNombres = genererListeNombres();
        afficherListeNombres(listeNombres);
    }

    public static List<Integer> genererListeNombres() {
        List<Integer> listeNombres = new ArrayList<>();
        Random random = new Random();
        
        int pairs = 0;
        int impairs = 0;
        
        while (pairs < 2 || impairs < 2) {
            int nombre = random.nextInt(100); // Génère un nombre aléatoire entre 0 et 99
            
            if (nombre % 2 == 0 && pairs < 2) {
                listeNombres.add(nombre);
                pairs++;
            } else if (nombre % 2 != 0 && impairs < 2) {
                listeNombres.add(nombre);
                impairs++;
            }
        }
        
        return listeNombres;
    }

    public static void afficherListeNombres(List<Integer> listeNombres) {
        System.out.println("Liste des nombres :");
        for (int nombre : listeNombres) {
            System.out.println(nombre);
        }
    }
}
