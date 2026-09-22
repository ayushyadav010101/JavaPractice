import java.util.Scanner;

public class Circle{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Radius = ");
        float r = sc.nextFloat();
        System.out.println("Area of Circle is = " + (3.14*r*r));
        System.out.println("Circumfrence of Circle is = " + (2*3.14*r));
    }
}