import java.util.*;
public class string_pallindrome {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String str=sc.nextLine();
        if(pallindrome(str)){
            System.out.println("yes");
        }else
        System.out.println("no");

    }
    public static boolean pallindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
               return false;

            }
            left++;
            right--;

        }
        return true;
    }
    
}
