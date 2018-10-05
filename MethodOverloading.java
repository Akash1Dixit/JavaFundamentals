 class Add{
    int add(int a ,int b){
        return a+b;
    }
    int add(int a , int b , int c){
        return a+b+c;
    }
}
public class Demo{
    public static void main(String args[]){
        Add ob= new Add();
        System.out.println(ob.add(1,2));
        System.out.println(ob.add(1,2,8));
        
    }
}