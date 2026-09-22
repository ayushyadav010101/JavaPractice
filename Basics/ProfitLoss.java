import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price : ");
        int c = sc.nextInt();
        System.out.println("Enter Selling Price : ");
        int s = sc.nextInt();
        int profit = s-c;
        int loss = c-s;

        System.out.println("Profit is : " + (profit) );
        System.out.println("Loss is : " + (loss) );

        System.out.println("Profit % is :" + ((profit/c)*100.0 ));
        System.out.println("Loss % is :" + ((loss/c)*100.0 ));

    }
}
