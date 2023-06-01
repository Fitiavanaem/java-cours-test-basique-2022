public class TypeReference {
    public static void main(String[] args) {
        
      String nom1= "Fitiavana";
      String nom2=nom1;

      nom1="Roschtand";

      afficherNom(nom1);
      afficherNom(nom2);


      Person person1=new Person("lambo");
     Person person2=person1;

     person1.nom="Mokary";
     afficherNom(person1.nom);
     afficherNom(person2.nom);

    

    }
    static void afficherNom(String text){
        System.out.println(text);
    }
}
class Person{
    String nom;

    Person(String nom){
        this.nom=nom;
    }
}
