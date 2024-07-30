package OOPSinJAVA;

interface Animals{
    void walk();
    void eat();
}

interface Herbivore{

}

class Horses implements Animals, Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
    public void eat(){
        System.out.println("Eats Grass");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horses h1 = new Horses();
        h1.walk();
        h1.eat();
    }
}
