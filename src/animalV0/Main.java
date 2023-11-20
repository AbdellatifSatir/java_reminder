package animalV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal animal_1 = new Animal("jack", (short)2);
        System.out.println(animal_1); // print the object
        animal_1.setAge((short)4);
        animal_1.setName("roza");
        System.out.println(animal_1); // print the object
        System.out.println(animal_1.getName()); // access to private variable using getter
        System.out.println(animal_1.age); // access to public variable directly
        System.out.println(Animal.is_animal); // access to public static variable without creating an object
        Animal.print_hello(); // invoking a static method without creating an object

        System.out.println("=============================");
        short a = 10, b;
        b = (short) ((a == 10) ? 5: 20);
        System.out.println(a+b);

        int [] numbers = {10, 20, 30, 40};
        for( int n : numbers ){
            System.out.println(n);
        }
        List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");
        for( String name : names ){
            System.out.println(name);
        }

        System.out.println("=============================");
        short x = 10, y = 8;
        swap(x,y);
        System.out.println("After Swaping (OUTSIDE) a = "+x+" b = "+y);

    }

    public static void swap(short a, short b){
        System.out.println("Before Swaping (INSIDE) a = "+a+" b = "+b);
        short c = a;
        a = b;
        b = c;
        System.out.println("After Swaping (INSIDE) a = "+a+" b = "+b);
    }
}