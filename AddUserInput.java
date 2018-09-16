import java.util.Scanner;

public class Add{
    public static void main(String args[]){
      int a,c,n;
      System.out.println("enter");
      Scanner in  = new Scanner(System.in);
      a =  in.nextInt();
      c = in.nextInt();
      n= a + c;
      System.out.println(n);
    }
}