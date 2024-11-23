import java.util.*;
public class pallindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int orignalnum=sc.nextInt();
        int num=orignalnum;
        int rev=0;
        int rem;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        if(orignalnum==rev){
            System.out.println("this number is pallendrome");

        }
        else{
            System.out.println("this is not pallendrome");
        }
    }
    
}
