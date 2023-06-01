public class Main {
    public static void main(String[] args) {
        Animal animal1=new Chat();
        Chien animal2=new Chien();
        animal1.faireduBruit();
        animal2.faireduBruit();
    }
}
class Animal{

    public void faireduBruit(){
        System.out.println("Animal fait un bruit");
    }
}
class Chien extends Animal{
    @Override
    public void faireduBruit(){
        System.out.println("Le chien abiot");
    }
}

class Chat extends Animal{
    @Override
    public void faireduBruit(){
        System.out.println("le chat miole");
    }
}


