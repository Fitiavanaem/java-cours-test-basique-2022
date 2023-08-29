public class Telephone {
    public static void main(String[] args) {

        Marque apple= new Marque("apple");

        Tele android= new Tele(5000, "Android", apple);
        apple.nom="Soa";
        System.out.println(android.marque.nom);
        
    }
}
class Tele{
    int pixles;
    String nom;
    Marque marque;

    public Tele(int pixles, String nom, Marque marque){
        this.pixles=pixles;
        this.nom=nom;
        this.marque=marque;
    }
}
class Marque{
    String nom;

    public Marque(String nom){
        this.nom=nom;
    }
}