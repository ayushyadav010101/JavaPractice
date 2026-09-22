import java.util.Scanner;
public class Temperature {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temp in Celsius : "  );
        double c = sc.nextDouble();
        System.out.println("In Fahrenheit will be : " + ((c*9/5)+32)+" F");
        System.out.println("In Kelvin will be : " + (c + 273.15)+" K");

        System.out.printf("In Fahrenheit will be : %.2f F%n", ((c * 9 / 5) + 32));
        System.out.printf("In Kelvin will be : %.2f K%n", (c + 273.15));

    }
}
