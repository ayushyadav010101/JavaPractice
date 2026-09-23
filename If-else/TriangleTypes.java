import java.util.Scanner;
public class TriangleTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Triangle all 3 Sides :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");

        if (a == b && b == c  /* automatically  -> && c == a */)
            System.out.println("Equilateral Triangle");
        else if (a == b || b == c || c == a)
            System.out.println("Isosceles Triangle");
        else /*  else me condition nahi likhi jati  (a != b && b != c && c != a) */
            System.out.println("Scalene Triangle");
    } else {
        System.out.println("Invalid Triangle");
    }
    }
}
