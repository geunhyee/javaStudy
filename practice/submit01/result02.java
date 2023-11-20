package practice.submit01;

import java.util.Scanner;

public class result02 {

	public static void main(String[] args) {

//		q.01
//		사용자로부터 이름, 국어점수, 영어점수, 수학 점수를 입력 받고,
//		이름, 국어 점수, 영어점수, 수학 점수, 평균을 콘솔창에 출력해보세요.

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scanner. nextLine();
		String outputName = "이름: " + name;
		System.out.println(outputName);
		System.out.println("국어 점수를 입력해주세요");
		int korScore = scanner. nextInt();
		String outputKor = "국어: " + korScore;
		System.out.println("영어 점수를 입력해주세요");
		int engscore = scanner. nextInt();
		String outputEng = "영어" + engscore;
		System.out.println("수학 점수를 입력해주세요");
		int matscore = scanner. nextInt();
		String outputMath = "수학" + matscore;
		
		System.out.println(outputKor);
		System.out.println(outputEng);
		System.out.println(outputMath);
		System.out.println("평균:" + (korScore + engscore + matscore) / 3);
		
		double avg = (korScore + engscore + matscore) / 3.0;
//		System.out.println("평균 : %.2f", avg);
//		System.out.println();
		
		
		
		
//	q. 02

//		String idBack = "1231476";
//		String first = idBack.substring(0,1);
//		int num = Integer.parseInt(first);
//		String gender = (num % 2 == 0) ? ("여") : ("남");
//		System.out.println(gender);

		

	}

}
