package OOPSinJAVA;

abstract class Animal{
    Animal(){
        System.out.println("You are Creating a new Animal");
    }
    abstract void walk();
    public void eats(){
        System.out.println("Eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("Walks on four Legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on Two legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
//        Animal animal = new Animal();
        Horse horse = new Horse();
        horse.walk();
        horse.eats();
    }
}
