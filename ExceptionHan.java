public class Exception{
    public static void main(String args[]){
        int a=0,j=10;
        try{
            int f = j/a;
            System.out.println("error");
        }
        catch(ArithmeticException e){
            System.out.println("not be executed");
        }
        
        System.out.println("end of main class");
    } 
}