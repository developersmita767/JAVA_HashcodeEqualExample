package Abacus;

import java.util.HashSet;
import java.util.Set;

public class HashCodeEqualExample {

	public static void main(String[] args) {
		/*Set<String> strSet=new HashSet<String>();
		strSet.add("Odisha");
		strSet.add("Delhi");
		strSet.add("MP");
		strSet.add("Odisha");
		System.out.println(strSet.size());*/
		Set<Student> stdSet=new HashSet<Student>();
		Student st1 = new Student(1, "Ram", 90, "A");
		Student st2 = new Student(2, "Shyam", 85, "A");
		Student st3 = new Student(1, "Ram", 90, "A");
		stdSet.add(st1);
		stdSet.add(st2);
		stdSet.add(st3);
		//System.out.println(st1.hashCode()+" "+st2.hashCode()+" "+st3.hashCode());
		System.out.println(stdSet);
		
	}

}
