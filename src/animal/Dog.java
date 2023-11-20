package animal;

public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
    @Override
    public void move() {
        System.out.println("Dog moves");
    }
}
