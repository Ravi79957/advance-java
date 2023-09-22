package neww;

public class StringPallandrom {
	public static void main(String[] args) {
		String s="Madam Arora teachers Malayalam";
		String[] str=s.split(" ");
		for(String a : str) {
			if(a.equalsIgnoreCase(check(a))) {
				System.out.println(a);
			}
			
		}
	}
	public static String check(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			str1=str.charAt(i)+str1;
		}
		return str1;
	}
}
