import java.util.*;
public class prime {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isprime(n)){
            System.out.println("prime number");
        }
        else {
            System.out.println("not prime number");
        }
    }

       
       public static boolean isprime(int n){
        if(n<1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
    
}
