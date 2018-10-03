import java.util.*;
public class Reverse{
    public static void main(String args[]){
        int i,reverse= 0;
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        while(i !=0){
            reverse  = reverse * 10;
            reverse = reverse+i%10;
            i= i/10;
        }
        System.out.println(reverse);
    }
}