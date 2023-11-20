package ch04_operator;

import java.util.Scanner;

public class OperatorMain {

	public static void main(String[] args) {
//		연산자 Operator
//		1. 증감 연산자
		int num = 10;
		System.out.println(num);
		num ++; // 후위 증가 1
		System.out.println(num);
		num --; // 후위 감소 1
		System.out.println(num);
		++ num; // 전위 증가
//		증감 연산자가 앞, 뒤에 따라 실행순서가 다름.
		int a, b;
		a = num ++; //할당 후 증가
		b = ++ num;//증가 후 할당
		System.out.printf("a : %d 는 할당 후 증가, b : %d는 증가 후 할당.", a, b);
		
		System.out.println("\n============대입 연산자 ===========\n");
		num = 10;
		num += 1;
		System.out.println(num); //11
		num -= 2;
		System.out.println(num); //9
		num *=2;
		System.out.println(num);// 18
//	나누기의 몫 리턴
		num /=2;
		System.out.println(num);//9
//		나누기의 나머지 리턴
		num %= 2;
		System.out.println(num);//
		
		System.out.println("\n===========산술 연산자=============\n");
		// + - * / %
		int numA = 10;
		int numB = 3;
		numA = numA + 1;
		System.out.println(numA);
		System.out.printf("numA:%d numB:%d \n", numA, numB);
		System.out.printf("더하기 : "+ (numA + numB));
		System.out.printf("빼기 : "+ (numA - numB));
		System.out.printf("곱하기 : "+ (numA * numB));
		System.out.printf("나누기 : "+ (numA / numB));
		System.out.printf("나머지 : "+ (numA % numB));
		
		System.out.println("\n===========비교 연산자============\n");
//		비교 결과 에 따라 ture /false 가 리턴된다.
		int numFive = 5;
		double pi = 3.14;
		int numOne = 1;
		System.out.println(numFive > numOne);
		boolean result = numFive < numOne;
		System.out.println(result);
//		타입이 다른 숫자도 비교 가능
		System.out.println(numFive >= pi);
//		== 같다 != 같지 않다.
		System.out.println(numFive == pi);
		System.out.println(numFive == 5);
//		문자에 대해서도 비교 연산이 가능
		System.out.println("가 > 나");
		System.out.println('가' < '나');//char 데이터 타입 쌍따옴표 아님
		
		String stuA = "김길동";
		String stuB = "홍길동";
		System.out.println("김 > 홍");
		System.out.println(stuA.charAt(0) > stuB.charAt(0));
		
//		문자열이 서로 같은지 비교. equals 사용
		String ship = "배"; //문자열 리터럴(값 그자체를 넣어줄때 의미함) 사용 (constant pool 이라는 공간에 저장)
		String pear = "배";
		String bae = new String("배"); // new 생성자 사용하여 객체 생성시 heap 영역에 저장
		System.out.println(ship == pear); //true
		System.out.println(ship == bae); //false 저장공간이 다름
		System.out.println(ship.equals(bae)); //true 문자열 자체 비교
//		null은 값이 없음을 의미함
		String serverDataString = null;
		System.out.println(serverDataString != null);
//		주소 존재함 문자열 데이터가 없음.
		String inputData = ""; // 비어있는(공백) 개념 null과 다름
		System.out.println(inputData == null);
		System.out.println(inputData.equals(""));
		System.out.println(inputData.length()== 0);
		System.out.println(inputData.isEmpty());
		
		System.out.println("\n ========= 삼항 연산자==========\n");
//		String inputId = "nick1234";
//	 	inputId의 길이가 7이상이면 통과, 아니면 재 입력 출력
//		(a) ? (b) L (c) a의 식이 true이면 b, false 이면 c를 리턴
//		String check = (inputId.length() >= 7)? ("통과") : ("재입력");
//		System.out.println(check);
//		이중 삼항 연산자
//		score가 90보다 크면 grade "A" 80점 보다 크면 "B", 나머지는 C
		int score = 76;
		String grade = (score > 90)? ("A") :((score > 80 ? ("B"): ("C")));
		System.out.println(grade);
		
//		문제 1. 사용자의 나이를 입력받아 10대, 20대, 30대...를 출력하고
//			10대일 경우에는 입장 불가를 출력하시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("==============");
		System.out.println("나이를 입력해주세요");
//		int age = scanner.nextInt();
		
//		String strNum = age + "";
//		String output = (age >=20) ? strNum.substring(0,1) + "0대 입장가능" : "10대 입장불가.";
//		System.out.println(output);
//		String age10 = (age > 19)? (age + "출입하세요") : ("입장불가");
//		System.out.println(age10);
		
		System.out.println("\n========논리 연산자 ========\n");
//		조건 체크를 여러번 하지 않고 한번에 끝낼 수 있도록 도와줌
		int inputAge = 24;
		String inputPhone = "01078910000";
//		나이는 14세 이상, 휴대폰 번호는 11자리 체크
		System.out.println(inputAge >= 14);
		System.out.println(inputPhone.length() == 11);
//		 && and의 의미 true %% true 이면 true /앞에도 true여야 뒤에도 체크함
//		shift + \ -> |
//		|| or의 의미 둘중 하나가 true 이면 true
		System.out.println(inputAge >=14 && inputPhone.length() == 11);
		
//		사용자의 아이디를 입력받아 8자리 이상 14자리 이하일 경우 -> "사용가능한 아이디 입니다."
//									  아닐 경우 -> "8~14 자리로 입력해주세요."
//		를 출력하시오.
		System.out.println("사용 아이디를 입력하시오.");
		String userId = scanner.nextLine();
		int len = userId.length();
		System.out.printf("입력아이디: %s, 문자열길이: %d \n", userId, len);
		String output = (len >= 8 && len < 15)? "사용가능한 아이디입니다." : "8~14 자리로 입력하세요.";
		System.out.println(output);
		

	
	}

}
