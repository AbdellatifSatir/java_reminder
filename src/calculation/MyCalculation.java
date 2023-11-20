package calculation;

public class MyCalculation extends Calculation{
// Inheritance
    public float multiplication(float a, float b){
        return (float) a*b;
    }
    public void display_addion(float a,float b){
        System.out.println(a+" + "+b+" = "+ super.addition(a,b));
    }
}
