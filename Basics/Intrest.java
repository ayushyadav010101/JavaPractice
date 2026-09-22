import java.util.Scanner;
public class Intrest {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rate : ");
        int r = sc.nextInt();
        System.out.println("Enter Principle : ");
        int p = sc.nextInt();
        System.out.println("Enter Time : ");
        int t = sc.nextInt();

        System.out.println("SI will be : " + (p*r*t/100));
        double a = p * Math.pow(1+r/100.0,t);
        System.out.printf("CI will be : %.2f%n " , (a-p) );
    }
}
