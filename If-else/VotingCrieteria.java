import java.util.Scanner;
public class VotingCrieteria {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        System.out.println("Enter Citizenship in  true/false");
        boolean c = sc.nextBoolean();

        if(age >= 18 && c) System.out.println ("You are Eligible for voting");
        else if (age<18 && c) System.out.println ("You are underage");
        else if (age>= 18 && !c) System.out.println("You are not citizen");
        else System.out.println("You are not citizen and underage");


    }
}
