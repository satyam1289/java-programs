import java.util.*;
public class lonest_word_in_string {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:");
        String str=sc.nextLine();
        System.out.println("longest word:"+lonest(str));

    }
    public static String lonest(String str){
        String[]words=str.split("\\s+");
        String longest="";
        for(String word:words){
           if(word.length()>longest.length()){
              longest=word;

           } 
        }
        return longest;

    }
    
}
