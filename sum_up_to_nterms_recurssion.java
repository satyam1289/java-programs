import java.util.*;
public class sum_up_to_nterms_recurssion {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+sum(n-1);
        }
    }
       
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("sum of terms upto n:"+sum(n));
        }
    }
    

