package neww;

public class NumberOf2S {
	public static void main(String[] args) {
		int n=75;
		int count=0;
		for(int i=0;i<=n;i++) {
			int tem=i;
			while(tem !=0) {
				int res=tem%10;
				if(res==2) {
					count++;
				}
				tem=tem/10;
			}
		}
		System.out.println(count);
	}
}
