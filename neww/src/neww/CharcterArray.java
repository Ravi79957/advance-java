package neww;

import java.util.Scanner;

public class CharcterArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		char[] ch=new char[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the single charcter");
			ch[i]=sc.next().charAt(0);
		}
		count(ch);
	}
	public static void count(char[] ch) {
		int aC=0,dC=0,sC=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z') {
				aC++;
			}
			else if(ch[i]>='0'&&ch[i]<='9') {
				dC++;
			}
			else {
				sC++;
			}
		}
		System.out.println("no of digits"+dC);
		System.out.println("no of alphabets"+aC);
		System.out.println("no of sysmblos"+sC);
		
	}
}
