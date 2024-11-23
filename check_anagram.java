import java.util.*;
public class check_anagram {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter str1");
        String str1=sc.nextLine();
        System.out.println("enter str2");
        String str2=sc.nextLine();
        if(anagram(str1, str2)){
            System.out.println("yes anagram");
        }else
        System.out.println("no not anagram");


    }
    public static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[]a=str1.toCharArray();
        char[]b=str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);


    }
    
}
