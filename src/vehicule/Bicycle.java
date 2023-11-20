package vehicule;

public class Bicycle extends Vehicule{
    public Bicycle(int id, float price) {
        super(id, price);
    }
    @Override
    public void move(){
        super.move();
        System.out.println("This is a Bicycle");
    }
}
