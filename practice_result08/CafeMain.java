package practice_result08;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		
		Caffe starBucks = new Caffe("스타벅스", "starburks");
		starBucks.addCoffe(new Coffee("아메리카노", 5000));
		starBucks.addCoffe(new Coffee("카푸치노", 5000));
		starBucks.addCoffe(new Coffee("오곡라떼", 5000));
		
		Caffe aKa = new Caffe("아카", "aKa");
		aKa.addCoffe(new Coffee("아메리카노",2800));
		aKa.addCoffe(new Coffee("바닐라라떼",3000));
		aKa.addCoffe(new Coffee("아이스티",2800));
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 스타벅스 방문|2. 아카 방문|3. 사무실 복귀");
			System.out.println(">>>");
			int select = Integer.parseInt(scanner.nextLine());
			if(select ==1 ) {
				System.out.println("어서오세요 스타벅스입니다.");
				starBucks.ShowMenu();
				starBucks.buyCoffee(scanner);
				
			}else if(select==2) {
				System.out.println("어서오세요 아카입니다.");
				aKa.ShowMenu();
				aKa.buyCoffee(scanner);

			}else {
				System.out.println("사무실로 복귀합니다.");
				break;
			}
		}
//		Scanner scanner = new Scanner(System.in);
//		while(true) {
//			System.out.println("행동을 선택해주세요.");
//			System.out.println("1.스타벅스 방문 | 2. 아카 방문 |3. 사무실 복귀");
//			System.out.println(">>>");
//			int commend = Integer.parseInt(scanner.nextLine());
//			if(commend == 1) {
//				
//			}else if(commend == 2){
//				
//			}else if(commend ==3){
//				
//			}else if(commend ==4) {
//				System.out.println("Bye Bye~");
//				break;
//			}
//		}

	}

}
