import java.util.Scanner;

public class ValidDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day:");
        int day = sc.nextInt();

        System.out.println("Enter month:");
        int month = sc.nextInt();

        System.out.println("Enter year:");
        int year = sc.nextInt();

        int maxDays;

        if (month < 1 || month > 12) {

            System.out.println("Invalid Date");

        } else {

            if (month == 1 || month == 3 || month == 5 ||
                    month == 7 || month == 8 || month == 10 || month == 12) {

                maxDays = 31;

            } else if (month == 4 || month == 6 ||
                    month == 9 || month == 11) {

                maxDays = 30;

            } else {

                // February
                if (year % 400 == 0 ||
                        (year % 4 == 0 && year % 100 != 0)) {

                    maxDays = 29;

                } else {

                    maxDays = 28;
                }
            }

            if (day >= 1 && day <= maxDays)
                System.out.println("Valid Date");
            else
                System.out.println("Invalid Date");
        }
    }
}
