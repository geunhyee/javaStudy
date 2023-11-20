package ch11_java_api;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;



import practice.submit01.result01;

public class ApiMath {

	public static void main(String[] args) {
		//Math
		//수학에서 사용되는 여러가지 함수들을 메서드로 제공하는 클래스
		final double PI = 3.141592;
		//반올림 round
		long roundPI = Math.round(PI);
		System.out.println(roundPI);
		//소수 넷째 자리에서 반올림
		double fourPI = (Math.round(PI * 1000)) /1000.0;
		System.out.println(fourPI);;
		//올림
		double ceilPI = Math.ceil(PI);
		//내림 floor
		double floorPI = Math.floor(PI);
		//절대값
		int minus = -10;
		System.out.println(Math.abs(minus));
		//제곱 3의 4제곱
		double powVal = Math.pow(3, 4);
		System.out.println(powVal);
		//제곱근(루트)
		int anyNum = 144;
		System.out.println(Math.sqrt(anyNum));
		//  랜덤 숫자(난수)생성
		//0~1 사이 실수 리턴(0은 포함, 1은 포함되지 않음)
		
		for(int i = 0; i <100; i++) {
			double randNum = Math.random();
			System.out.println(randNum);
		}
		
		// 1~45 랜덤 숫자
		int lotto = (int)(Math.random()*45)+1;
		System.out.println(lotto);
		//10~20까지 랜덤 숫자
		int ranNum = (int)(Math.random()*11)+10;
		System.out.println(ranNum);
		for(int i = 0; i <100; i++) {
			System.out.println(makeNum(1,10 ));
		}
		//Random은 클래스로 존재함.
//		Random random = new Random();
//		//.nextInt(n) 0~ n-1사이의 정수 리턴
//		int randomNum = random.nextInt(10); // 0~9
//		System.out.println(randomNum);
//		//1~100사이의 정수
//		randomNum = random.nextInt(100)+1; // +1 해줘서 0부터가 아니고 1부터 시작
//		System.out.println(randomNum);
//		//10%의 확률 당첨
//		if(randomNum <=10) {
//			System.out.println("당첨!![10%]");
//		}else {
//			System.out.println("꽝!");
//		}
		
		ArrayList<String> classMateList =
				new ArrayList<String>(
						Arrays.asList("김규영", "김동현", "김상준", "김성운", "김세준", "노윤기", "박근혜", "사원기", "송현지", "신가희", "예준서",
								"윤가영", "윤서준", "이규환", "이상희", "이영규", "이재우", "이호제", "임지윤", "정민형", "조하은", "최민혁", "최성웅"));
		
		HashMap<String ,String> resultMap = randomCoffe(classMateList);
		
		Set<String>keySet = resultMap.keySet();
		for(String key:keySet) {
			System.out.println(key + "님은 " + resultMap.get(key));
		}
		
		
	}
	public static HashMap<String, String> randomCoffe(ArrayList<String>arr){
		
		HashMap<String, String> resultMap = new HashMap<String, String>();
		//1. input으로 받은 arr의 건수 만큼 for문
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
			resultMap.put(arr.get(i), randomCard());
		}
		
		return resultMap;
	}
		//2. 10% 확률로 당첨/꽝 결과
		//3. resultMap.put(학생이름, 결과)로 담기
		
	
	
	//a부터 b사이의 랜덤 숫자 리턴
	public static int makeNum(int a, int b) {
		int result = (int)(Math.random()*(b-a+1))+ a;
		return result;
	}
		
	public static String randomCard() {
		
		Random random = new Random();
		String result;
	
		int randomNum = random.nextInt(100)+1;
		System.out.println(randomNum);
		//10%의 확률 당첨
		if(randomNum <=10) {
			result = "당첨";
		}else {
			result= "꽝";
	}
		return result;
	

	}
}
