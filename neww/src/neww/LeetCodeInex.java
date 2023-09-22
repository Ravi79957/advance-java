package neww;

import java.util.Arrays;

public class LeetCodeInex {
	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4,5,6,7};
		int k=3;
		int[] res=new int[a.length];
		for(int i=0;i<3;i++) {
			res[i]=a[a.length-k+i];
			
		}
		int j=0;
		for(int i=k;i<a.length;i++) {
			res[i]=a[j++];
		}
		System.out.println(Arrays.toString(res));

		
	}
}

