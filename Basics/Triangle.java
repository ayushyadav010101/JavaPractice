import java.util.Scanner;
public class Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("a =" );
        int a = sc.nextInt();

        System.out.println("b =");
        int b = sc.nextInt();

        System.out.println("c =");
        int c = sc.nextInt();
if(a+b>c & b+c>a & c+a> b)
    System.out.println("Valid Triangle");
else
    System.out.println("Invalid Triangle");
    }
}