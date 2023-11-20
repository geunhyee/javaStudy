package ch05_controll;

import java.util.Scanner;

public class oper {

	public static void main(String[] args) {
		int i = 1;
		//조건이 ture 이면 반복(무한 루프를 조심해야함)
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		int j = 1;
		//조건이 ture 이면 반복(무한 루프를 조심해야함)
		while(true) {
			System.out.println(j);
			j++;
			if(j == 10) {
				break;
			}
		}
		boolean flag = true;
		while(flag) {
			j++;
			System.out.println(j);
			if(j == 20) {
				flag = false; //break대신 변수 값을 변경해줘서 멈추게 만듬
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while(isRun) {
			System.out.println("이름을 입력하세요(종료 q or Q)");
			System.out.println(">>>");
			String input = scanner.nextLine();
			if (input.equals("q")|| input.equals("Q")) {
				isRun = false;								// 여기서 break를 걸면 그 다음 스텝은 출력이 안됨. 그 다음 스텝까지 나오려면 변수로
				System.out.println("종료 하겠습니다.");
			}else {
				System.out.println(input + "님 환영합니다. ^^");
			}
			System.out.println("==============================="); 
		}
		//do-while문
		//최소 한번은 실행해야할때
		isRun = false;
		do {
			System.out.println("hi");
		} while(isRun);
		
		//while문을 써서 구구단 2 ~ 9단
		//증가값을 만들어 줘야함
		
		int num = 1 ;
		while(num <= 9) {
			System.out.println("2 x"+ num + "=" + (2*num));
			num ++;
		}
		
		int dan = 2;
		// ㅣabel
		outer : while(dan <= 9) {
			int num1 = 1; //초기값을 정해줘야함
			System.out.println(dan + "단");
			while(num1 <= 9) {
			System.out.printf("%d * %d = %d \n", dan,num1,(dan*num1));
			
			num1++;
			if(num1 == 5) {
				break;
			}
			if(dan == 4) {
				//outer 하위 내용 탈출
				break outer;
				}
			}
			dan++;
		}
		//label 특정시점까지 break를 하고 싶을때
		//단순 break는 해당 반복문만 탈출하게됨.
		out1 : for(int x = 0; x < 5; x++) {
			out2 : for(int y = 0 ; y <5; y++) {
				out3 :for(int z = 0; z < 5; z++) {
					if(x *y * z >10) {
						break out2;
					}
				}
				System.out.println(x + " "+ y + " " + z );
			}
		}
	}
	

}
