package practice.submit01;


import java.util.Iterator;
import java.util.Scanner;

public class result03 {

	public static void main(String[] args) {
//		q.01 사용자로부터 국어, 영어, 수학 점수를 각각 입력받아 평균점수를 구하고 등급을 출력해주세요.
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수를 입력해 주세요");
		System.out.println(">>>");
		int korscore = scanner.nextInt();
		
		System.out.println("영어 점수를 입력해 주세요");
		System.out.println(">>>");
		int engscore = scanner.nextInt();
		
		System.out.println("수학 점수를 입력해 주세요");
		System.out.println(">>>");
		int mathscore = scanner.nextInt();
		
		double avg = (korscore + engscore + mathscore) / 3.0;
		System.out.printf("평균 : %.2f", avg );
		String grade = "";
		if(avg >=90) {
			grade = "A"; 
		}else if(avg >= 80) {
			grade = "B"; 
		}else if(avg >= 70) {
			grade = "C";
		}else {
			grade = "D";
		}
		System.out.println("등급:" + grade);
		
		scanner.close();
//		
//		q. 02
//		팩토리얼
//		수학기호로 4!는 4 팩토리얼을 의미하며,
//		그 값은 4X3X2X1 = 24입니다.
//		02-01.for문을 사용해서 10팩토리얼의 값을 출력해주세요.
//		결과:3628800
//		02-02.15팩토리얼의 값을 출력해주세요.
//		결과:1307674368000
		long result = 1;
		for(int i =1; i<=15; i++) {
			result *=i;
			
		}
		System.out.println(result);
	
		
//		q. 03
//		월리를 찾아라!
//		String findeWally = 
//		"윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
//		
//		위의 문자열 변수 findWally 중에 월리가 몇개 들어있는지 콘솔에 출력해주세요.
//		결과: 5
		
		// find
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
//		String Wally = findeWally + "";
		
//		System.out.println(findeWally.contains("월리"));

		//방법 1
		//
//		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int all = findWally.length();
		int after = findWally.replaceAll("월리", "").length(); /// replaceAll은 전체를 바꾸겠다
		System.out.println((all - after/2)); 
		
		//방법2
		int count = 0;
		for (int i=0; i<findWally.length(); i++) {
			String subWally = findWally.substring(i,i+2);
			if (subWally.equals("월리")) {
				count += 1;
				
			}
		}
		System.out.println("월리는 총:" + count);
		
		
		
		
		
		
//q. 04 거꾸로 트리를 5층 만들어주세요.
		
//		String star = "*"; // 증가할때 예문
//		for(int i=0; i <5; i++) {
//			star +="*";
//			System.out.println(star);
//		}
		
		//방법1
		String star = "*****";
		for (int i=5; i > 0; i--) {
			String subStar = star.substring(0,i);
			System.out.println(subStar);
		}
		//방법2
		for (int i = 0; i < 5; i++) {
			System.out.println(star.substring(i));
		}
		
	}

}
