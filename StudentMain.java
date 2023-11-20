package ch09_class;

import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ch09_class.commons.UtilClass;

public class StudentMain {

	public static void main(String[] args) {
		// student 클래스를 인스턴스화(객체화) 함.
		Student pangsu = new Student("팽수", 90, 80, 87);
		Student gildong = new Student("길동", 80, 70, 65);
		System.out.println(pangsu);
		System.out.println(gildong);
		
		//캡슐화 적용
		//같은 private 필드는 해당클래스의 메서드를 사용해서 접근
		System.out.println(pangsu.getEng());
		System.out.println(pangsu.getKor());
		//수정 setter
		pangsu.setEng(85);
		System.out.println(pangsu);
//		pangsu.eng = 85; -> 캡슐화 걸어놔서 이렇게 다이렉트로 수정안됨
		
		Student nick  = new Student("닉", 85, 77, 65, UtilClass.weRound((85+77+65)/3.0, 1));
		System.out.println(nick);
		
		nick.setEng(100);
		System.out.println(nick);
		
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(pangsu);
		stuList.add(nick);
		stuList.add(gildong);
		stuList.add(new Student("주디", 80, 82, 77));
		stuList.add(new Student("짹", 70, 92, 78));
		
		for(int i =0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		//직접 내림차순 정렬
		System.out.println("\n ===========");
		for(int k = 0; k < stuList.size() -1 ; k++) {
			for(int i = 0; i < stuList.size() -1; i++) {
				//i <i+1 내림
				//i >i+1 오름
				if(stuList.get(i).getAng() < stuList.get(i+1).getAng()) { //
					Student t = stuList.get(i);
					stuList.set(i, stuList.get(i+1));
					stuList.set(i+1, t);
				}
			}
		}
		for(int i= 0; i < stuList.size(); i++) {
			System.out.println((i+1)+"등." + stuList.get(i));
		}
		Collections.sort(stuList, new Comparator<Student>() {
//			//오버라이드 불러오기
			
			public int compare(Student stuA, Student stuB) {
				double diff = stuB.getAng() - stuA. getAng();
				if(diff <0) {				//등호를 반대로 하면 오름차순
					return -1;
				}
 				return 1; 				//차이가 0보다 크면 B가 더 크기때문에 순서를 바꿈
			}
		});
		//람다 표현식 java 8부터 사용
		Collections.sort(stuList, (stuA, stuB) ->
						(stuB.getAng()-stuA.getAng() >0)? (1): (-1));
		
		
		for(int i = 0; i < stuList.size(); i++){
			System.out.println((i +1) + "등." + stuList.get(i));
		}
	}

}
