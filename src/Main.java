import calculation.*;
import vehicule.*;
import employee.*;
import animal.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {

        System.out.println("\n============Inheritance=============");
        //display_calculation(); // Inheritance

        System.out.println("\n============Polymorphism=============");
        //display_vehicule(); // Polymorphism

        System.out.println("\n============Abstraction=============");
        //display_employer(); // Abstraction

        System.out.println("\n============Interface=============");
        //display_animal(); // Interface

        System.out.println("\n============Collections=============");
        display_dsa(); // Collections

    }

    //INHERITANCE
    public static void display_calculation(){
        float a = 10, b = 20;
        Calculation calc = new Calculation(); // superclass
        System.out.println("addition : "+calc.addition(a,b));
        MyCalculation mycalc = new MyCalculation(); // subclass
        System.out.println("multiplication (Inherited method) : "+mycalc.multiplication(a,b)); // Inherited method
        mycalc.display_addion(a,b);
    }

    //POLYMORPHISM
    public static void display_vehicule(){
        Vehicule c = new Car(02,998);
        Car car = new Car(03,799);
        Bicycle bicycle = new Bicycle(04,199);
        Vehicule[] vehicules = {c,car,bicycle}; // polymorphism 'many forms'
        for( Vehicule v : vehicules ){
            v.move();
            System.out.println(v+"\n");
        }
    }

    //ABSTRACTION
    public static void display_employer(){
        //Employee e = new Employee("Ali","Casa",04); // abstract class cannot be instantiated
        Salary salary = new Salary("Ali","Casa",04, 'M',9000); // inherit from abstract class
        System.out.println("Salary Class inherit from abstract class Employee :");
        System.out.println(salary);
    }

    //INTERFACES
    public static void display_animal() {
        //Animal animal = new Animal(); // 'Animal' is abstract; cannot be instantiated = interface
        Dog dog = new Dog(); // implements animal interface
        System.out.println("Dog implements animal interface :");
        dog.eat();
        dog.move(); // implemented methods
        System.out.println("FootballDemo implements Football interface extends Sports interface :");
        FootballDemo football = new FootballDemo(); // subclass implements an interface which is extends from another interface
        football.setHomeTeam("Morocco");
    }

    //COLLECTIONS
    public static void display_dsa(){
        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("type your name : ");
        String name = scanner.nextLine();
        System.out.println(name);
        //Date
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate  = myDateObj.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println(myDateObj);
        System.out.println(formattedDate);
        //Enums
        //enum LEVEL {LOW,MEDIUM,HIGH}
        //LEVEL level = LEVEL.HIGH;
        //Inner class
        class Outer{
            String o = "OUTER";
            class Inner{
                String i = "INNER";
            }
        }
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();


    }

}