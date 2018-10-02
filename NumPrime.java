import java.util.Scanner;
public class Prime{
    public static void main(String args[]){
        int num,i=2;
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        while(i<=num/2){
            if(num%i==0){
                flag = true;
                break;
            }
            ++i;
        }
        if(!flag){
            System.out.println("prime");
        }
        else {
            System.out.println("not");
        }
    }
}