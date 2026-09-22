import java.util.Scanner;
public class DistanceBtwTwoPoints {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Point 1 : ");
    int p1 = sc.nextInt();
    int p2 = sc.nextInt();

    System.out.println("Enter Point 2 : ");
    int p3 = sc.nextInt();
    int p4 = sc.nextInt();

   double dist = Math.sqrt (
            Math.pow(p1 - p3, 2) + Math.pow(p2 - p4 , 2)
    );
System.out.printf(" Distance between Two points is : %.2f%n " ,dist);


    }
}
