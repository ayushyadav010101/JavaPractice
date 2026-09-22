import java.util.Scanner;

public class Name{
    public static void main( String[] args){

//   5-riya
//  3-banu
//  5,3 both - apurva
//  5or3 - isha

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num =");
        int n = sc.nextInt();

        if (n%5 == 0 & n%3==0 ){System.out.println("Apurva");}
        else if(n%5 == 0){ System.out.println("Riya");}
        else if ( n % 3 == 0){ System.out.println("Banu");}
        else{ System.out.println("Isha");}
    }
}