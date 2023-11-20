package ch05_controll;




public class Conditional {
	// 전역 변수
	// class 중괄호 안에 선언된 변수
	// 해당 클래스 내 어디서든 사용 가능하다.
	static String subject = "조건문";

	public static void main(String[] args) {
		// 지역 변수
		// 해당 스코프 안에서만 사용가능 {}
		
//		int price = 3000; //price라는 변수는 main 메서드 안에서만 사용 가능 지역변수 특, 벗어나면 출력 불가
//		int myMoney = 10000;
//		
//		// 조건문 if문
//		if(myMoney < price) {
//			System.out.println(subject);
//			System.out.println("돈이 부족합니다.");
//		}
//		//if문 블록{} 안의 명령어가 한줄이면 {} 생략가능
//		if(myMoney < price) // 참고로 알아둘것, 사용하지 않는 편이 좋음
//			System.out.println(subject);
//	
//		System.out.println("종료");
//		// 변수의 사용범위(Scope)
//		//중괄호 블록{} 내부에 선언된 변수는
//		//해당 중괄호 바깥에서 사용할 수 없음.
//		
//		String review = "음식이 맛있어요^^";
//		String msg = ""; 
//		
//		if(review.length() < 12) {
////			String msg = ""; //해당 {} 안에서만 사용가능
//			msg = "리뷰는 12자 이상 작성하세요!!";
//		}else {
//			msg = "통과";
//			
//		}
//		System.out.println(msg);
//
////		조건이 2개 일때
//		int score = 85;
//		String grade = "";
//		if (score >= 90) {
//			grade="A";
//		}else if (score >=80){
//			grade="B";
//		}else if (score >=70){
//			grade="C";
//		}else {
//			grade="F";
//		}
//		System.out.println(grade);
//		//순서에 주의해야하는 경우
//		int score1 = 92;
//		if (score1 >= 80) { // 가장먼저 오는 순서에서 TRUE이면 이후 조건문은 걸리지않음
//			grade = "B";
//			
//		}else if{score1 >= 90) {
//			grade = "A";
//		}
//		System.out.println(grade);	
//
//		if (score1 >= 80 %% score < 90) {
//			grade = "B";
//			
//		}else if (score >= 90) {
//			grade = "A";
//		}
//		System.out.println(grade);
//		// 중첩 if문(1)
//		//회원가입 조건을 체크하세요
//		//이름     : 조건(한글자 이상)
//		//휴대폰 번호 : 조건(10자리 또는 11자리)
//		//나이     : 조건(14세 이상)
//		String name = "팽수";
//		String phone = "01096101000";
//		int age = 30;
//		//이름조건
//		if (name.length() >= 1) {
//			//휴대폰
//			if (phone.length() == 10 || phone.length() == 11) {
//			//나이
//				if (age >= 14) {
//					System.out.println("회원가입 성공");
//				}else {
//					System.out.println("회원가입 실패");
//				}
//			}else {
//				System.out.println("회원가입실패");
//			}
//		}else {
//			System.out.println("회원가입 실패"); 
//		}
//		//중첩if(2)
//		boolean isOkay = false;
//		if (name.length() >= 1) {
//			if (phone.length() == 10 || phone.length() == 11) {
//				if (age >= 14) {
//					isOkay = true;
//					
//				}
//			}
//		}
//			
//		if (isOkay == true) {
//			System.out.println("회원가입 성공");
//		}else {
//			System.out.println("회원가입 실패");
//		}
//		
//		//if(3)
//		if(name.length() >= 1)
//			&& (phone.length() == 10 || phone.length() == 11)
//			&& (age >= 14) {
//			System.out.println("회원가입 성공");
//		}else {
//			System.out.println("g회원가입실패");
//		}
		
		//switch문 단순 값을 매칭하는 경우 많이 사용(코드해석이 쉬운 장점)
		int month = 3;
		switch(month) {
		case 0:
			System.out.println("수강등록");
			break;
		
		case 1:
			System.out.println("프로그래밍 기초");
			break;
			
		case 2:
			System.out.println("DB");
			break;
			
		case 3:
			System.out.println("웹 프로그래밍");
			break;
			
		default :
			System.out.println("bmfhrmfoa");
		}

	}
	
}
	

