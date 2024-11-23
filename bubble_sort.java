import java.util.*;
public class bubble_sort {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of elements:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter no.of elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubblesort(arr);
        System.out.println("sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static  void bubblesort(int[]arr){
        int n=arr.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=arr[j];
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
    
}
