import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n1 =");
        float a =  sc.nextFloat();

        System.out.println("Enter n2 = ");
        float b = sc.nextFloat();

        System.out.println("Sum is = "+(a+b));
        System.out.println("Diffrence is = "+(a-b));
        System.out.println("Product is = "+ (a*b));
        System.out.println("Quotient is ="+ (a/b));

    }
}
