package ch08_collection;

import java.util.HashSet;
import java.util.Iterator;


public class Colletction2 {

	public static void main(String[] args) {
		//집합(Set) 중복을 허용하지 않음.
		HashSet<String> stuSet = new HashSet<String>();
		
		//.add(값)
		stuSet.add("팽수");
		stuSet.add("팽순");
		System.out.println(stuSet);
		
		//중복된 값이 추가되지 않으며 에러는 안남.
		stuSet.add("팽수");
		System.out.println(stuSet);
		
		//.size()
		System.out.println(stuSet.size());
		
		//.contains(값) true, false
		System.out.println(stuSet.contains("팽수"));
		// set은 순서정보가 없음 그래서 향상된 for문을 쓰거나
		for(String stu : stuSet) {
			System.out.println(stu);
		}
		//Iterator 사용
		Iterator<String> iterator = stuSet.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		
		
		
		
	}

}
