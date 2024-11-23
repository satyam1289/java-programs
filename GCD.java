import java.util.*;
public class GCD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
         System.out.println("GCD of " + n1 + " and " + n2 + " is " + findGCD(n1, n2));
     }

    public static int findGCD(int n1, int n2) {
        if (n2== 0) {
            return n1;
        } else {
            return findGCD(n2, n1 % n2);
            
        }
        
    }
}
