import java.util.Scanner;
public class ATM {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter Balance : ");
        int b = sc.nextInt();

        System.out.println("Enter Withdrawl : ");
        int w = sc.nextInt();
        int r = b-w;

        if (w<=0){
            System.out.println("Invalid Amount");
        }
        else if (w>0 && w>b){
            System.out.println("Insufficient Amount");
        }
        else {
            System.out.println("Withdrawl successful");
            System.out.println("Remaining Balnce is : " + (r));
        }
    }
}
