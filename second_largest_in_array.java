import java.util.*;
public class second_largest_in_array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements:");
        int n=sc.nextInt();
        int []arr=new  int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(secondlargest(arr)==Integer.MIN_VALUE){
            System.out.println("NO second largest element");
        }
        else{
            System.out.println("second largest  element is:"+secondlargest(arr));
        }
    }
    public static int secondlargest(int []arr){
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]>second && arr[i]!=largest){
                second=arr[i];
            }
        }
        return second;
    }
        


    
    
}
