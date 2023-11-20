package ch12_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		System.out.println("메인 시작");

		int[] intArr = {1, 2, 3};
		try {
			System.out.println(intArr[3]);	// 빨간줄은 안뜨는데 run이 안되는것이 컴파일 오류
		} catch (ArrayIndexOutOfBoundsException e) { // 정의되어있는 오류 클래스임-> 특정오류일때 여기서 잡히게끔
			System.out.println("인덱스 문제! 사이즈에 맞게 사용하세요.");
			e.printStackTrace();
		
		} catch (Exception e) {
			// printStackTrace 오류 출력
			e.printStackTrace();
			System.err.println("오류났어!");
			System.out.println("오류 났을때 처리구간");
		}
		//try catch가 없으면 메인종료까지 나올 수 없음 - > 중단된다는 의미
		System.out.println("메인 종료");
		
		try {
			System.out.println(ExMethod.dateMillSec("2023.07.12"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(ExMethod.dateMillSec2("2023.07.12"));
		
		try {
			ExMethod.printName("길");
		} catch (BizExveption e) {
			System.out.println(e.getErrCode());
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}


	}
	

}
