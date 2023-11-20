package practice.submit01;

import java.util.IllegalFormatCodePointException;
import java.util.Random;
import java.util.Scanner;



public class result05 {

	public static void main(String[] args) {
		
//		Random random = new Random();
////		Scanner scanner = new Scanner(System.in);	
//		boolean isSuccess = false;
//		
//				
//		while (true) {
//			int comNum = random.nextInt(5000) % 50 + 1;
//			System.out.println("컵퓨터가 생성한 난수:" + comNum);
//		
//		for (int i =1; i<= 5; i++) {
//			System.out.println("숫자를 입력하세요");
////			int userNum = scanner.nextInt();
//			
//			if(userNum > comNum) {
//				System.out.println("다운");
//				
//			}else if (userNum < comNum) {
//				System.out.println("업");
//				
//			}
//			else {
//				System.out.println("정답");
//				isSuccess = true;
//				break;
//				}
//			
//			}
//		if(isSuccess == false) {
//			System.out.println("실패");
//			}
//		}
		
		// 1~ 50사이의 랜덤한 수가 생성
		// 사용자가 입력한 숫자에 대해 업, 다운 제시
		// 5번의 기회 동안 사용자가 정답을 맞추지 못하면 "실패" 문구 출력 후 프로그램 종료 -> break로 빠져나가야하나
		// 사용자가 정답을 맞추면 "정답" 문구 출력 후 프로그램 종료 -> break?
		
		int ranInt = (int) (Math.random()*50 +1);
		Scanner scanner = new Scanner(System.in);
		int chance = 5;
		while (true) {
			System.out.println("숫자를 입력해주세요");
			int userPic = Integer.parseInt(scanner.nextLine());
			if(userPic == ranInt) {
				System.out.println("정답입니다.");
				break;
				
			}
			chance -= 1;
			if(chance <=0) {
				System.out.println("실패하였습니다. 정답은 "+ ranInt + "입니다.");
				
			}if(userPic < ranInt) {
				System.out.println("업! 기회가" + chance + "남았습니다." );
					
			}else if(userPic > ranInt) {
				System.out.println("다운 기회가 " + chance +"남았습니다.");
			}
		}
		//for문으로 할 경우
		for(int i = 4; i >=0; i--) {
			System.out.println("기회가 " + i + "남았습니다.");
		}

		// 02.q
		
		int elevatorA = 10; //ev A의 위치
		int elevatorB = 4; //EV B의 위치
		
		//움직이는 엘레베이터가 a이면 1, b이면 2
		final int ACTIVE_ELEVATOR_A = 1;
		final int ACTIVE_ELEVATOR_B = 2;
		int activeElevator = 0;
		
		while(true) {
			System.out.println("\n=======미래융합 엘리베티어=======\n");
			System.out.println("승강기 A의 현재 위치: " + elevatorA);
			System.out.println("승강기 B의 현재 위치: " + elevatorB);
			System.out.println("몇층에 계시나요?[종료하시려면 q or exit 입력]" );
			
			String inputText = scanner.nextLine();
			if(inputText.equalsIgnoreCase("q") ||
					inputText.equalsIgnoreCase("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			//사용자가 입력한 층수
			int custFloor = Integer.parseInt(inputText);
			System.out.println(custFloor + "층에서 엘리베이터 호출");
			//사용자의 위치와 각 층수의 차이 계산
			int diffFloorA = (custFloor > elevatorA) ? (custFloor - elevatorA) :(elevatorA - custFloor);
			int diffFloorB = Math.abs(custFloor -elevatorB);
			
			//위치 차이에 따른 엘리베이터 이동
			//A 승강기가 더 멀때
			if (diffFloorA > diffFloorB) {
				System.out.println("승강기 B가 " + custFloor + "층으로 이동하였습니다.");
				elevatorB = custFloor;
				activeElevator = ACTIVE_ELEVATOR_B;
			//B 승강기가 더 멀때	
			
			}else if (elevatorA < elevatorB){
				System.out.println("승강기 A가 " + custFloor + "층으로 이동하였습니다.");
				elevatorA = custFloor;
				activeElevator = ACTIVE_ELEVATOR_A;
			//같을때
				
			}else {
				if(elevatorA > elevatorB) {
					System.out.println("승강기 a가 "+ custFloor +"층으로 이동하였습니다.");
					elevatorA = custFloor;
					activeElevator = ACTIVE_ELEVATOR_A;
				}else {
					System.out.println("승강기 B가 " + custFloor + "층으로 이동하였습니다.");
					elevatorB = custFloor;
					activeElevator = ACTIVE_ELEVATOR_B;
				}
			}
			System.out.println("어느 층으로 이동하시겠습니까?:");
			inputText = scanner.nextLine();
			
			int goToFloor = Integer.parseInt(inputText);
			if(activeElevator == ACTIVE_ELEVATOR_A) {
				System.out.println("승강기 A" + goToFloor +"층으로 이동하였습니다.");
				elevatorA = goToFloor;
			}else {
				System.out.println("승강기 B가" + goToFloor + "층으로 이동하였습니다.");
				elevatorB = goToFloor;
			}
				break;
			
		}
		


	}

}
