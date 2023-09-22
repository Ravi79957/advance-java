package neww;

public class PrimeGivenarray {
	public static void main(String[] args) {
		int[] a= {23,43,5,43,8,7,898,653,2};
		for(int i=0;i<a.length;i++) {
			if(prime(a[i])) {
				System.out.println(a[i]);
			}
		}
	}

	private static boolean prime(int i) {
		int count=0;
		for(int k=2;k<=i;k++) {
			if(i%k==0) {
				count++;
			}
		}
		if(count==1) {
			return true;
		}
		else {
			return false;
		}
	}
}
