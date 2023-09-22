package neww;

public class CollectionsEx {
	
	public static void main(String[] args) {
		int n=1,m=100;
		int count=0;
		for(int i=n;i<=m;i++) {
			int num=i;
			while(num!=0) {
				int res=num%10;
				if(res==1) {
					count++;
				}
				num=num/10;
			}
		}
		System.out.println(count);
	}
}
