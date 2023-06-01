public class Animal {
    public static void main(String[] args) {
        GrandAnimal oiseau=new Oiseau();
        GrandAnimal chien=new Chien();
        GrandAnimal pigeon=new Pigeon();
        oiseau.deplace();
        chien.deplace();
        pigeon.deplace();
    }
}
class GrandAnimal{
    public void deplace(){
        System.out.println("Je deplace");
    }
}
class Oiseau extends GrandAnimal{
    @Override
    public void deplace(){
        super.deplace();
        System.out.println("Je vole");
    }
}
class Chien extends GrandAnimal{
    public void deplace(){
        System.out.println("Je marche");
    }
}
class Pigeon extends GrandAnimal{
    public void deplace(){
        System.out.println("Je vole surtout en ville");
    }
}