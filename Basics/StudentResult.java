import java.util.Scanner;
public class StudentResult{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Student Name : ");
        String n = sc.nextLine();

        System.out.println("Enter Roll No. : ");
        int r = sc.nextInt();

        System.out.println("Enter S1 Marks : ");
        int s1 = sc.nextInt();
        System.out.println("Enter s2 Mark : ");
        int s2 = sc.nextInt();
        System.out.println("Enter s3 Mark : ");
        int s3 = sc.nextInt();

        System.out.println(n);
        System.out.println(r);
        System.out.println("Total Marks : "+ (s1+s2+s3));
        System.out.println("Average Marks is : " + ((s1+s2+s3)/3));
    }
}