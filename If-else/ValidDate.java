//import java.util.Scanner;
//
//public class ValidDate {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter day:");
//        int day = sc.nextInt();
//
//        System.out.println("Enter month:");
//        int month = sc.nextInt();
//
//        System.out.println("Enter year:");
//        int year = sc.nextInt();
//
//        int maxDays;
//
//        if (month < 1 || month > 12) {
//
//            System.out.println("Invalid Date");
//
//        } else {
//
//            if (month == 1 || month == 3 || month == 5 ||
//                    month == 7 || month == 8 || month == 10 || month == 12) {
//
//                maxDays = 31;
//
//            } else if (month == 4 || month == 6 ||
//                    month == 9 || month == 11) {
//
//                maxDays = 30;
//
//            } else {
//
//                // February
//                if (year % 400 == 0 ||
//                        (year % 4 == 0 && year % 100 != 0)) {
//
//                    maxDays = 29;
//
//                } else {
//
//                    maxDays = 28;
//                }
//            }
//
//            if (day >= 1 && day <= maxDays)
//                System.out.println("Valid Date");
//            else
//                System.out.println("Invalid Date");
//        }
//    }
//}

import java.util.Scanner;
public class ValidDate{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter days : ");
        int d = sc.nextInt();

        System.out.println("Enter days : ");
        int m = sc.nextInt();

        System.out.println("Enter days : ");
        int y = sc.nextInt();

        int maxDays;

        if(m<1 || m>12) {
            System.out.println("Invalid Month");
        } else if  (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            maxDays = 31;
        } else {
            if (m == 4 || m == 6 || m == 9 || m == 11) {
                maxDays = 30;
            } else {
                if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) {
                    maxDays = 29;
                } else {
                    maxDays = 28;
                }
            }

            if (d >= 1 && d <= maxDays) {
                System.out.println("Valid Date");
            } else {
                System.out.println("Invalid date");
            }
        }

    }
}