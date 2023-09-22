package nikilesh;

import java.util.ArrayList;
import java.util.List;

public class S2 {
	public static void main(String[] args) {
		Student s1=new Student("ravi",1,65,22);
		Student s2=new Student("niki",2,75,23);
		Student s3=new Student("savi",6,30,32);
		Student s4=new Student("raju",4,10,42);
		Student s5=new Student("rani",5,20,22);
		
		List<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println(al);
		System.out.println("*******************");
		for(int i=0;i<al.size();i++) {
			if(al.get(i).markes<35) {
				al.remove(i);
			}
		}
		System.out.println(al);
	}
}
