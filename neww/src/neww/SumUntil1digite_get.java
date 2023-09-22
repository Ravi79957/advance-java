package neww;
import java.util.Scanner;


public class SumUntil1digite_get {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0,count=0;
		while(count != 1) {
			 sum=0;
			 count=0;
			 while(num !=0) {
				 int res=num%10;
				 sum=sum+res;
				 count++;
				 num=num/10;
			 }
			 num=sum;
		}
		System.out.println(sum);
	}
}
