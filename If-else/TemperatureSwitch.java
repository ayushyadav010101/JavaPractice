import java.util.Scanner;
public class TemperatureSwitch {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Temperature : ");
        double t = sc.nextDouble();

        System.out.println("Enter Scale : C/K/F");
        char u = sc.next().charAt(0);

        switch(u){
            case 'C':
            case 'c':
                System.out.println("In Fahrenheit :" + ((t*9/5)+32) );
                System.out.println("In Kelvin :" + (t+273.15));
                break;

            case'F':
            case'f':
                System.out.println("In Celsius :" + ((t-32)*5/9) );
                System.out.println("In Kelvin :" + (((t-32)*5/9)+273.15) );
                break;

            case'K':
            case'k':
                System.out.println("In Celsius :" + (t-273.15 ));
                System.out.println("In Fahrenheit :" + ((t-273.15)*9/5+32 ));
                break;

            default :
                System.out.println("Invalid Temperature" );

        }

    }
}
