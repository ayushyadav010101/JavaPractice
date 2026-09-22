import java.util.Scanner;
public class BMICalculation {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Weight in Kg : "  );
        double w = sc.nextDouble();
        System.out.println("Enter Your Height : ");
        double h = sc.nextDouble();
        h = h* 0.3048;

        double bmi = (w )/(h*h);
        System.out.println("Your BMI is : "+(bmi));
    }
}
