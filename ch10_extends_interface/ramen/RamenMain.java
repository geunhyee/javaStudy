package ch10_extends_interface.ramen;

public class RamenMain {

	public static void main(String[] args) {
//		Ramen ramen = new Ramen("진라면",1000)//추상클래스는 객체로 만들수없음 -> 오류남 
		JinRamen jin = new JinRamen("진라면 기본", 1000);
		jin.printRecipe();
		JjaPpagheti jja = new JjaPpagheti("짜파게티", 1200);
		jja.printRecipe();

	}

}
