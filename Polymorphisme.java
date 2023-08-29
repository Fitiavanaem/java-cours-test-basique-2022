public class Polymorphisme {
    public static void main(String[] args) {
        Animal chien = new Chien();
        Animal chat = new Chat();
    
        chien.faireduBruit();
        chat.faireduBruit();
    }
}
class Animal {
    public void faireduBruit() {
        System.out.println("L'animal fait un bruit");
    }
}
class Chien extends Animal {
    public void faireduBruit() {
        System.out.println("Le chien aboie");
    }
}
class Chat extends Animal {
    public void faireduBruit() {
        System.out.println("Le chat miaule");
    }
}