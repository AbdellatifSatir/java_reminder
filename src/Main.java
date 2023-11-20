import animal.Animal;
import calculation.*;
import vehicule.*;
import employer.*;
import animal.*;


public class Main {

    public static void main(String[] args) {

        System.out.println("=========================");
        display_calculation(); // Inheritance

        System.out.println("=========================");
        display_vehicule(); // Polymorphism

        System.out.println("=========================");
        display_employer(); // Abstraction

        System.out.println("=========================");
        display_animal(); // Interface

        System.out.println("=========================");
        display_dsa(); // Collections

    }

    //INHERITANCE
    public static void display_calculation(){
        float a = 10, b = 20;
        Calculation calc = new Calculation(); // superclass
        System.out.println(calc.addition(a,b));
        MyCalculation mycalc = new MyCalculation(); // subclass
        System.out.println(mycalc.multiplication(a,b)); // Inherited method
        mycalc.display_addion(a,b);
    }

    //POLYMORPHISM
    public static void display_vehicule(){
        Vehicule c = new Car(02,998);
        Car car = new Car(03,799);
        Bicycle bicycle = new Bicycle(04,199);
        Vehicule[] vehicules = {c,car,bicycle}; // polymorphism 'many formes'
        for( Vehicule v : vehicules ){
            v.move();
        }
    }

    //ABSTRACTION
    public static void display_employer(){
        //Employee e = new Employee("Ali","Casa",04); // abstract class cannot be instantiated
        Salary salary = new Salary("Ali","Casa",04, 'M',9000); // inherit from abstract class
        System.out.println(salary);
    }

    //INTERFACES
    public static void display_animal() {
        //Animal animal = new Animal(); // 'Animal' is abstract; cannot be instantiated = interface
        Dog dog = new Dog();
        dog.eat();
        dog.move(); // implemented methods
        FootballDemo football = new FootballDemo(); // subclass implements an interface which is extends from another interface
        football.setHomeTeam("Morocco");
    }

    //COLLECTIONS
    public static void display_dsa(){
    }

}