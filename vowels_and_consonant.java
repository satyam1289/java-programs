import java.util.*;
public class vowels_and_consonant {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        int[]count=check(str);
        System.out.println("vowels:"+count[0]);
        System.out.println("consonant:"+count[1]);

    }
    public static int[] check(String str){
        int vowels=0;
        int consonant=0;
         str=str.toLowerCase();
         for(char c:str.toCharArray()){
            if(c>='a'&& c<='z'){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowels++;
                }else
                consonant++;

            }
        }
            return new int[]{vowels,consonant};

         
    }    
}
