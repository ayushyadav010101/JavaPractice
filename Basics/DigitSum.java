import java.util.Scanner;
public class DigitSum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 digit : ");
        int d = sc.nextInt();

        int k1 = d%10;
        int k2 = (d/10)%10;
        int k3 = (d/100)%10;
        int k4 = (d/1000);

        System.out.println(" Sum of digit is : " +(k1 + k2+ k3 + k4 ));

    }

}


// 1234/10 = 123
//  1234/100 = 12
//  1234/1000 = 1