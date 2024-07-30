package OOPSinJAVA;
// import java.util.Scanner;

public class StudentClass{
    // Creating a new data type
    // public static class Student{
    //     String name;
    //     int roll;
    //     double percentage;
    // }

    public static void change(Student x){
        x.name = "Rohan";
        return;
    }

    public static void main(String[] args) {        
        Student s1 = new Student();    // creating an object x
        s1.name = "Raghav";
        s1.roll = 76;
        s1.percentage = 92.5;

        change(s1);
//        System.out.println(s1.name);

        s1.setId(1001);    // Setter
//        System.out.println(s1.getId());   // Getter

        Student s2 = new Student("Rahul", 01, 89.21);
//        System.out.println(s2.name);

//        System.out.println(s1.schoolName);

        System.out.println(Student.getNumberOfStudents());

//        1.32.35
    }
}