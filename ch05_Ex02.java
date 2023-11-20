package ch05_controll;

import java.util.Scanner;

public class ch05_Ex02 {

	public static void main(String[] args) {
		//메뉴를 입력받아 가격을 출력하는 프로그램을 작성하시오
		//(아이스아메리카노는 호칭이 2개)
		
		//아아 or 아이스아메리카노 : 3000
		// 라떼 : 4500
		//에스프레소 : 2500
		// 위의 메뉴로 입력하면 "입력메뉴"는 000원 입니다. 출력
		
		//위의 메뉴가 아닌 메뉴는
		//"입력메뉴" 메뉴는 저희 매장에 없습니다. 출력
		
		int salePrice = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("메뉴를 주문하세요");
		System.out.println(">>> ");
		
		String inputMenu = scanner.nextLine();
		
		switch (inputMenu) {
		
		case "아이스아메리카노":
			System.out.println(inputMenu + "는 3000원 입니다.");
			break;
		case "아아":
			System.out.println(inputMenu + "는 3000원 입니다.");
			break;
			
		case "라떼":
			System.out.println(inputMenu + "는 4500원 입니다.");
			break;
			
		case "에스프레소":
			System.out.println(inputMenu + "는 2500원 입니다.") ;
			
		
		default :
			System.out.println(inputMenu + "는 저희 매장에 없습니다.");
		
			
	
		}
		float a = 2.1f;
		float b = 20/10.f; // 정수/정수 -> 정수로 나옴 소수점으로 나올려면 정수/플롯트 -> 플롯트
		
		System.out.printf("%.2f \n",a);
		System.out.printf("%.2f \n",b);

		
	}

}
