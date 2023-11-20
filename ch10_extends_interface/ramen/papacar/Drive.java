package ch10_extends_interface.ramen.papacar;

public class Drive {

	public static void main(String[] args) {
		Vehicle car1 = new car();
		Vehicle car2 = new car2();
		car1.start();
		car2.start();
		
		// List 라는 동일한 인터페이스를 구현한 클래스
		// 동일한 인터페이스를 구현했기 때문에 동일한 메서드가 있음
		List list = new ArrayList();	//
		List list2 = new LinkedList();
	}

}
