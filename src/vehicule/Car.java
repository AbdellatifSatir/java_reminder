package vehicule;

public class Car extends Vehicule{
    public Car(int id, float price) {
        super(id, price);
    }
    @Override
    public void move(){
        super.move();
        System.out.println("This is a Car");
    }
}
