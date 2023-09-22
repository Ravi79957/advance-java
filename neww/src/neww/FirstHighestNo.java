package neww;

import java.util.Scanner;

public class FirstHighestNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] ar=new int[5];
		for(int i=0;i<ar.length;i++) {
			System.out.println("enter the elements");
			ar[i]=sc.nextInt();
		}
		int h=ar[0];
		for(int j=1;j<ar.length;j++) {
			if(ar[j]>h) {
				h=ar[j];
			}
		}
		System.out.println("highest no "+h);
	}
}
