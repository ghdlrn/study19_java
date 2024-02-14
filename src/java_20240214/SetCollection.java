package java_20240214;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		
		//중복 저장되지 않는다. 순서가 없다.
		Set<String> set = new HashSet<>();
		
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Toy");
		
		System.out.println(set);
		Iterator<String> it = set.iterator(); //반복자
		
		while(it.hasNext() ) {
			System.out.print(it.next()+'\n');
		}
		System.out.println();
	}

}
