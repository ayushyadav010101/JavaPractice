import java.util.Scanner;
public class CheakTwoStringEqual {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter String 1 :");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2 :");
        String s2 = sc.nextLine();

        // == compares String references, while .equals() compares String contents.
//        if ( s1==s2) System.out.println("Same String");
//        else System.out.println("Not same String");

        if ( s1.equals(s2)) System.out.println("Same String");
        else System.out.println("Not same String");

    }
}
