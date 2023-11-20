package employer;

public class Salary extends Employee{

    private float salary;
    public Salary(String name, String address, int number, char gender, float salary) {
        super(name, address, number, gender);
        this.salary = salary;
    }
    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }

    @Override
    public void setGender(char gender) {

    }

    @Override
    public String toString() {
        return "Salary{" +
                "name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", number=" + super.getNumber() + '\'' +
                ", gender=" + super.getGender() + '\'' +
                ", salary=" + salary +
                '}';
    }
}
