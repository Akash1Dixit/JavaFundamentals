import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        int t1=0,t2=1,n,i;
        Scanner in  = new Scanner(System.in);
        n = in.nextInt();
        while(t1<=n){
            System.out.println(t1);
            int sum = t1+t2;
            t1 = t2;
            t2= sum;
            
        }
        
    }
}