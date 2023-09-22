package neww;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pallendrom {
	public static void main(String[] args) {
		int a=1000;
		int sum=0;
		int i=1;
		while(i<=30) {
			sum=sum+a;
			a=a+a;
			i++;
			System.out.println(sum);
		}
		System.out.println(sum);
	}	
}
