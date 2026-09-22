import java.util.Scanner;
public class SwapByAirthmetic {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a = ");
        int a = sc.nextInt();

        System.out.println("Enter b = ");
        int b = sc.nextInt();

//        a=10 , b= 5  -->      a=a+b;  >>  a=15;
//                              b=a-b;  >>   b=10;
//                              a=a-b   >>   a=5;



        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a = " +a);
        System.out.println("b = "+b);
    }
}
