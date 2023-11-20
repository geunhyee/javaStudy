package ch10_extends_interface.simple;



public class SimpleMain {
	//슈퍼클래스(부모)
	//서브클래스(자식) 서브 클래스는 슈퍼클래스의 모든 필드와 메소드를 상속 받음.
	public static void main(String[] args) {
		
		Parent papa = new Parent("아부지",60);
		System.out.println(papa.toString());
		papa.sayHello();
		
		Child baby = new Child();
		baby.setAge(10);
		baby.setName("아기");
		baby.sayHello();
		System.out.println(baby.toString());
	}

}
