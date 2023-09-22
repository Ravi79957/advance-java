
package neww;

public class NewPgrm {
	public static void main(String[] args) {
		String str="ThisWasASampleString";
		int n=5;
		int noParts=str.length()/n;
		//System.out.println(noParts);
		int strtindex=0;
		int endindex=noParts;
		String[] eP=new String[n];
		for(int i=0;i<n;i++) {
			if(i==n-1) {
				eP[i]=str.substring(strtindex);
			}
			else {
				eP[i]=str.substring(strtindex, endindex);
				strtindex=endindex;
				endindex+=noParts;
			}
		}
		for(String a: eP) {
			System.out.println(a);
		}
	}
}
