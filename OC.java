public class OC {
    public static void main(String[] args) {
        Vehicule voiture = new Voiture();
        voiture.start();
        Bateaux bateaux= new Bateaux();
        bateaux.start();
        Voiture voiture2=new Voiture();
        voiture2.allumerFeux();
    }
}
class Vehicule{
    void start(){
        System.out.println("VROOOOOOOOOM");
    }
}
class Voiture extends Vehicule{
    void start() {
      System.out.println("VROOOOOOMMM Voiture");
    }
    void allumerFeux(){
        System.out.println("Allumer le Feux");
    }
}
class Bateaux extends Vehicule{
    void start(){
        System.out.println("VROOOOOMMMMM Bateaux");
    }
}