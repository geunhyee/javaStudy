package ch06_Method;
//javadoc 주석 단축키 shift + alt + j
//자동 주석 생성 설정
// window -> preferences -> java -> Code Stlye -> Code Templates -> Comments




/**
 * @파일명    :MethodMain.java
 * @프로젝트명 : javastudy
 * @작성일    :2023. 7. 21.
 * @작성자    :ParkGeunHye 
 * @프로그램명 :
 * @변경이력  : 
 */

/**
 * @파일명    :MethodMain.java
 * @프로젝트명 : javastudy
 * @작성일    :2023. 7. 21.
 * @작성자    :ParkGeunHye 
 * @프로그램명 :
 * @변경이력  : 
 */
public class MethodMain {

	

	public static void main(String[] args) {
		
		
		//method(메소드)클래스에 종속된 함수.
		//java는 모두 class에서 작성되기 때문에 사용되는 함수를 메소드라 부름.
		// function은 클래스에 독립적인 함수
		// 1~100까지 더하면 결과는?
		// 1~50까지 더하면 결과는?
		//1~ 25까지 더하면 결과는?
		// 30~ 60 까지 더하면?
		int sum = 0;
		for(int i = 1; i <= 100; i++) { //1부터 100까지 더하는것
			sum += i;
			
		}
		System.out.println(sum);
		//메소드 호출/ 아래에서 만들어준걸 호출하는 것임
		printSum(1, 100);
		printSum(1, 50);
		printSum(30, 60);
		int hap =returnSum(50,60);
		System.out.println("리턴 받았음" + hap);
		System.out.println("리턴 받았음" + returnSum(50, 60));
		print("hi"); 
		print("System.out.println이 쓰기 귀찮아서 만든것");
		
		//abs 절대값을 리턴하는 메소드
		int num1 = Math.abs(-10);
		print(num1);
		print(MyAbs(-10));
		


	}
	
	// 메소드 생성
	//[접근제어자 static] 리턴타입 메소드명(파라미터){
	/**
	 * @Method Name : main
	 * @작성일        : 2023. 7. 21.
	 * @작성자        : ParkGeunHye
	 * @메소드설명      :
	 * @param       : from 시작값, to 종료값
	 * @return      : from~to까지 값을 합하여 리턴
	 */
	public static void printSum(int from, int to) {
		int sum = 0;
		for(int i = from; i <= to; i++) {
			sum += i;
		}
		System.out.println(from +" 부터" + to + "까지 더한 결과는" + sum);
		
	}
	public static int returnSum(int from, int to) {
		int sum = 0;
		for(int i = from; i <= to; i++) {
			sum += i;
		}
		System.out.println(from +" 부터" + to + "까지 더한 결과는" + sum);
		return sum;
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	// 메소드 오버로딩 동일한 이름 입력 타입이 다른함수로 정의할 수 있음
	public static void print(int msg) {
		System.out.println(msg);
	}
	
	public static int MyAbs(int num) {
		if(num <0) {
			num *=-1;
		}
		return num;
	}
	
	
	
}

	
