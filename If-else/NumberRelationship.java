import java.util.Scanner;
public class NumberRelationship {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter four Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a<b) {
            if(b<c){
                if(c<d){
                    System.out.println("Strictly Increasing");
                }
                else {
                    System.out.println("Unordered Numbers");
                }
            }  else{
                System.out.println("Unordered Numbers");
            }

        }else if(a>b){
                if(b>c){
                    if(c>d) {
                        System.out.println("Strictly Decreasing");
                    }
                     else {
                        System.out.println("Unordered Numbers");
                    }
                }  else {
                    System.out.println("Unordered Numbers");
                }

        }else if (a==b){
            if(b==c){
                if(c==d){
                    System.out.println("All are same");
                }
                else {
                    System.out.println("Unordered Numbers");
                }

            }  else{
                System.out.println("Unordered Numbers");
            }
        }else {
            System.out.println("Unordered Numbers");
        }


    }
}
