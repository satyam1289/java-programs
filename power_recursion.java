import java.util.*;
public class power_recursion {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
        System.out.println("evaluate:"+power(base,power));

    }
    public static int power(int base,int power){
        if(power==0){
            return 1;

        }else{
        return base*power(base,power-1);
        }
    }
    
}
