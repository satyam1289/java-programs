import java.util.*;
public class fibonacci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of terms");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.println("fibonacci series:"+a+" "+b+" ");
        for(int i=2;i<n;i++){
         int next=a+b;
         a=b;
         b=next;
         System.out.println(next+" ");


        }

    }
    
}
