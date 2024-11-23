import java.util.*;
public class reverse_string {
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        System.out.println("reversed string is:"+reversed);
    }
    
}
