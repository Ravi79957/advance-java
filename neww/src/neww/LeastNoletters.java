package neww;

public class LeastNoletters {
	public static void main(String[] args) {
		String str="agnaagbbcccce";
		String s="";
		for(int i=0;i<str.length();i++) {
			if(s.contains(str.charAt(i)+"")) {
				continue;
			}
			else {
				s=s+str.charAt(i);
			}
		}
		System.out.println(s);
		
	}
}
