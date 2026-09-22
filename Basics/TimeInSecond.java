import java.util.Scanner;
public class TimeInSecond {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Time in Hr ,Minute, Second : ");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        System.out.printf("Total time in second %d  : seconds%n " , ( h*3600 + m*60 + s));

    }

}
