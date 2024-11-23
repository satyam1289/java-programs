import java.util.*;
public class frequency_char {
public static void main(String[]args){
    HashMap <Character,Integer>map=new HashMap<Character,Integer>();
   
    int count1=0;
    int count2=0;
    int count3=0;
    int[]arr={'a','b','c','c'};
    for(int num=0;num<arr.length;num++){
        if(arr[num]=='a'){
            count1++;
            
        }
        else if(arr[num]=='b'){
            count2++;
        }
        else {
            count3++;
        }
        
    }
    map.put('a',count1);
    map.put('b',count2);
    map.put('c',count3);
    System.out.println(map);
}
    
}
