package neww;

public class LeetCodeSum {
	public static void main(String[] args) {
		int[] nums= {1,2,3,0,0,0};
		int nums1[]= {2,6,5};
		int m=3;
		int n=3;
		int[] num=new int[m+n];
		for(int i=0;i<m;i++) {
			num[i]=nums[i];
		}
		int k=0;
		for(int j=m;j<num.length;j++) {
			
				num[j]=nums1[k++];
				
			}
		
		for(int l=0;l<num.length-1;l++) {
			int a=0;
			if(num[l]>num[l+1]) {
				a=num[l];
				num[l]=num[l+1];
				num[l+1]=a;
			}
		}
		for(int b:num) {
			System.out.println(b);
		}
	}
}
