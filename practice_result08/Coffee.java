package practice_result08;

public class Coffee {  // 게터세터만든이유는 이 캡슐화한 객체에 접근하기 위해서
	private String name;
	private int price ;
	
	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
}