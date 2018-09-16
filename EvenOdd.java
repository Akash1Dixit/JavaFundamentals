import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]){
        int i ;
         System.out.println("enter String");
         Scanner in = new Scanner(System.in);
         i = in.nextInt();
         if(i%2==0)
         System.out.println("no is even");
         else {
             System.out.println("ODD");
         }
    }
}