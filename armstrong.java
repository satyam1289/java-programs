import java.util.*;
public class armstrong {
	 public static void main(String[] args)
{
	 Scanner sc=new Scanner(System.in);
	 int orignalnum=sc.nextInt();
	 int num=orignalnum;
	 int sum=0;
	 int digits=0;

	 while(num!=0){
		  num=num/10;
		  digits++;
	 }
	  num=orignalnum;
while(num!=0){
		int rem=num%10;
	 sum+=Math.pow(rem,digits);
	  num/=10;
	  }
  if(orignalnum==sum){
	 System.out.println("yes it is armstrong");
  }
  else{
	 System.out.println("no,not armstrong");
	  }
  }  
}
