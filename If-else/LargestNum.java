import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 3 Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>=b  && a>=c) System.out.println("Gretest number is : "+ (a));
        else if (b>=a && b>=c) System.out.println("Greatest Number is : "+(b));
        else System.out.println("Greatest Number is : "+(c));


    }
}
