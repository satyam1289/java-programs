import java.util.*;
public class factorial_recursion {
    public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 int num=sc.nextInt();
 System.out.println("factorial of num:"+factorial(num));
    }
    public static int  factorial(int num){
        if(num>=1){
            return  num*factorial(num -1);
        }else{
            return 1;
        }
    }
    
}
