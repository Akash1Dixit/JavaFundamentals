 class Human{
     public void eat(){
         System.out.println("human");
     }
 }
 class Boy extends Human{
     
     public void eat(){
         System.out.println("boy");
     }
     
 }
 public class Eat{
 public static void main(String args[]){
    Boy ob = new Boy();
    ob.eat();
 }
 }