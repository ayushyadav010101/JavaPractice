import java.util.Scanner;
public class CheakDivisor {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number to be divided :");
        int n =sc.nextInt();
        System.out.println("Enter Divisor :");
        int d =sc.nextInt();
        if(d!=0 && n%d == 0) System.out.println("Divisor is not Zero and Number is Divisible by divisor");
        else System.out.println("Divisor is zero or Number may be not fully divisible by divisor");

    }
}
