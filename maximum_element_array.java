import java.util.*;

public class maximum_element_array {
    public static int findmax(int [] array){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];

            }
        }
        return max;
    }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter no. of elements in array:");
            int n=sc.nextInt();
            int[] array=new int[n];
            System.out.println("enter elements of array:");
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
         System.out.println("gretest:"+findmax(array));
        }
    }

