import java.util.Scanner;
public class CalculatorViaSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 :");
        double a = sc.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        char op = sc.next().charAt(0);

        System.out.println("Enter num1 :");
        double b = sc.nextDouble();

        switch (op) {

            case '+':
                System.out.println("Result : " + (a + b));
                break;

            case '-':
                System.out.println("Result :" + (a - b));
                break;

            case '*':
                System.out.println("Result : " + (a * b));
                break;

            case '/':
                if (b != 0) System.out.println("Result : " + (a / b));
                else System.out.println("Number is not divisible by Zero");
                break;

            default :
                System.out.println("Invalid Operator");
        }


        }
    }
