package vehicule;

public class Vehicule {
    // Inheritance + Polymorphism

    protected int id;
    protected float price;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public Vehicule(int id, float price) {
        this.id = id;
        this.price = price;
    }
    public void move(){
        int i = 0;
        System.out.println("Vehicle"+i++);
    }

}
