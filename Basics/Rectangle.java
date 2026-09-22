import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
      Scanner sc = new Scanner (System.in);

      System.out.println("Enter Length = ");
      int l = sc.nextInt();

      System.out.println("Enter width = ");
      int w = sc.nextInt();

      System.out.println("Area is = "+(l*w));
      System.out.println("Perimeter is = "+ ( 2*(l+w)));
      System.out.println("Diagonal is = "+ ( Math.sqrt ((l*l)+(w*w))));

    }
}
