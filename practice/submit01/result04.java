package practice.submit01;

import java.util.Scanner;




public class result04 {

	public static void main(String[] args) {
		//q. 01
//룰렛을 아주 힘차게 돌렸더니 5834도가 돌아갔다고 합니다.
//한바퀴는 당연히 360도 겠죠?
//그렇다면 룰렛이 멈추고난 각도에 대한 경품이 뭔지 출력을 해주시고, 총 몇바퀴
// 돌아갔는지도 출력해 주세요.
//		경품조건
//		0도 이상 ~ 60도 미만: 사탕
//		60도 이상 ~ 120도 미만: 초콜릿
//		120도 이상 ~ 180도 미만: 쿠키
//		180도 이상 ~ 240도 미만: 콜라
//		240도 이상 ~ 300도 미만: 아이스크림
//		300도 이상 ~ 360도 미만: 커피
//		실행결과
//		Scanner scanner = new Scanner(System.in);

//		System.out.println("각도를 입력하세요");
//		System.out.println(">>>");
//		int useAngle = scanner.nextInt();
		
		int userAngle = 5834;
		int num = userAngle % 360; //바퀴수
		int angle = 5834 % 360; //각도 (나머지)
		
		if(num > 0 && num < 60 ) {
			System.out.println("사탕");
		}else if(num > 60 && num <120) {
			System.out.println("초콜릿");
				
		}else if(num > 120 && num <180) {
			System.out.println("쿠키");
				
		}else if(num > 180 && num <240) {
			System.out.println("콜라");
						
		}else if(num > 240 && num <300) {
			System.out.println("아이스크림");
							
		}else if(num > 300 && num <360) {
			System.out.println("커피");
								
		}
		
		
			
		
		
		
		
		//q.02
//		로꾸꺼 로꾸꺼
//		사용자에게 문자열을 입력받으시고, 입력받은 문자열의 순서를 뒤집어서 출력해보세요.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("글자를 입력하세요.");		
		System.out.println(">>>");
		String word = scanner.nextLine();
		String word1 = "";
		
		for(int i = word.length()-1; i >= 0; i--) {
			word1 = word1 + word.charAt(i);
		//다른 방법
		//for(int i = word.length(); i >0l; i-- {
//			word1 += word.substring(i -1, i); 
		
		}
		System.out.println(word1);
		
		
		//q.03
//		크리스마스 트리
//		반쪽짜리 트리가 아닌 제대로된 5층 트리를 만들어보세요.
		
//		String star = ""; 
		int line = 10;
		for(int i=0; i < line; i++) {
			for(int j = (line -1)-i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k =(i* 2)+1; k>0; k--){
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("-------------------");
		int line2 = 10;
		String blank ="";
		for(int i =0; i < line2; i++) {
			String stat = "*";
			for(int j =0; j< (line2-1)-i ; j++) {
				stat += "**";
			}
			System.out.println(blank + stat);
			blank += " ";
		}
	/*
	 * 1. 5번 반복
	 * 2. 별 1 3 5 7 9
	 * 3. 공백 4 3 2 1 */
//		String star= "*";
//		String blank = "";
//		for(int i = 0; i < 5; i++) {
//			if(i >0) {
//				star += "**";
//			}
//		}
//		blank ="";
//		for(int j = 1; j < 5-i; j++) {
//			blank += " ";
//		}
//		System.out.println(star);
	
	
	
	}
	/*
	 * 공백이 0, 1, 2, 3, 4
	 * 별이 9, 7, 5, 3, 1 
	 blank = ""
	 * for(int i = 0; i < 5; i++
	 * if(i > 0 {
	 * blank += " ";
	 * }
	 * star = "*";
	 * for(int j = 0; j < 4-i; j++){
	 * star += "**";
	 * }
	 * System.out.println(blank + star);
	 *
	 * 
	 * print사용
	 * for(int i = 0; i <5; i++){
	 * 공백
	 * for(int j = 5 -i ; j >1 ; j--}{
	 * 		system.out.print(" ");
	 * }
	 * 별
	 * for(int j = 0; j <=2 *i ; j++){
	 * 		system.out.print("*");
	 * }
	 * system.out.println();
	 * 
	 * 
	 * 다이아몬드 모양으로
	 * for(int i = num-2; i>=0; i--){
	 * 		for(int j= num -i; j >1; j--){
	 * 			system.out.print(" ");
	 * }
	 * for(int j =0; j<=2*i; j++){
	 * 		system.out.print("*");
	 * }
	 * system.out.println();
	 * */
	
	
	

}
