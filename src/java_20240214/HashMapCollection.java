package java_20240214;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCollection {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(33, "Toy");
		map.put(47, "Box");
		map.put(67, "Robot");
		//반복해서 출력할 때..
		
		System.out.println(map.get(33));
		System.out.println("---------------------------------");
		
		System.out.println(map.entrySet());
		System.out.println("---------------------------------");
		
		Set<Integer> set = map.keySet(); //키만 모아서 set에 저장.
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
			System.out.println(map.get(it.next()));
		
		System.out.println("---------------------------------");
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
