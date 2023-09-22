package neww;

import java.util.Scanner;

public class Occurence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] a=new int[size];
		int[] b=a;
		for(int i=0;i<size;i++) {
			System.out.println("enter the elemnts");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			int count=0;
			for(int j=0;j<size;j++) {
				if(a[i]==b[j]&&i>j) {
					break;
				}
				if(a[i]==b[j]) {
					count++;
				}
			}
			if(count>=1) {
				System.out.println(a[i]+" occurence"+count);
			}
		}
	}
}
