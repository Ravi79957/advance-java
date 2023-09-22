package neww;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class SecondMaxNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter tghe size of array");
		int size=sc.nextInt();
		int[] ar=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the elements");
			ar[i]=sc.nextInt();
		}
		int max=ar[0];
		int secondMax=ar[0];
		for(int j=1;j<ar.length;j++) {
			if(ar[j]>max) {
				secondMax=max;
				max=ar[j];
				
			}
			else if(ar[j]>secondMax) {
				secondMax=ar[j];
			}
		}
		System.out.println("second maxmium height no"+secondMax);
	}

}
