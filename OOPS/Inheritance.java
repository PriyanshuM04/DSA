package OOPSinJAVA;

class Shape{    // Base class or parent class
//    String color;
    public void area(){
        System.out.println("Displays Area");
    }
}

class Triangle extends Shape{    // Child class
    public void area(int base, int height){
        System.out.println(base * height / 2);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14 * r * r);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int base, int height){
        System.out.println(base * height / 2);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(3, 4);
    }
}
