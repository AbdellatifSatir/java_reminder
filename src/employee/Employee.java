package employer;

public abstract class Employee {
// used for inherit from it not for create objects, it contains both abstract and non-abstract methods

    private String name;
    private String address;
    private int number;
    private char gender;


    public Employee(String name, String address, int number, char gender) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.gender = gender;
    }

    public char getGender() { return gender; }
    public abstract void setGender(char gender); // abstract method we de not give it a body here

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number + '\'' +
                ", gender=" + gender +
                '}';
    }

}
