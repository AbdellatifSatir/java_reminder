package animalV0;

public class Animal {

    private String name;
    public short age;
    public static boolean is_animal = true;
    public static void print_hello(){
        System.out.println("Hello every fucking one");
    }
    public Animal(String name, short age) {
        System.out.println("Constractor initilized...");
        this.name = name;
        this.age = age;
    }
    public short getAge() {
        return age;
    }
    public void setAge(short age) {
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}