package practice.submit01;

import java.util.jar.Attributes.Name;

import org.w3c.dom.ls.LSOutput;

public class result06 {

	public static void main(String[] args) {
		//q. 1
		// 출력하는 메소드 만들기
//		BusinessCard("박근혜", " 010-9412-9056", "swing0323@naver.com");
		
		String name = "박근혜";
		String phone = "010-9412-9056";
		String email = "swing0323@naver.com";
		
		printcard(name,phone,email);
		
		//q.2
		//같은 성을 가진 사람이 몇명인지
				
		String[] classMate = {"김규영", "김동현", "김상준", "김성운", "김세준", "노윤기", "박근혜", "사원기", "송현지", "신가희", "예준서", "윤가영", "윤서준",
							"이규환", "이상희", "이영규", "이재우", "이호제", "임지윤", "정민형", "조하은", "최민혁", "최성웅"};
		//매개변수가 두개인 메서드 만들기
		SerchName("이", classMate);
		
		//q.3
		//최대값, 최소값 찾기
		
		
		
	
		
		
	}

	public static void printcard(String name, String phone, String email) {
		System.out.println("====================");
		System.out.println("이름:" + name);
		System.out.println("연락처:" + phone);
		System.out.println("이메일:" + email);
		System.out.println("===================");

	}
	
	public static void SerchName(String first, String[] arr) {
		int count = 0;
		String nm = "";
		for(int i =0; i < arr.length; i++) {
			if(arr[i].substring(0,1).equals(first)) {
				count++;
				nm += arr[i] + "씨";
			}
		}
		System.out.println(first + "씨 성을 가진 동기분은 총"+count +"명 있습니다.");
		System.out.println(nm);
	
	
	}
	
	public static void MinMax(int[] intArr) {
		int maxVal = intArr[0];
		int minVal = intArr[0];
		for(int i = 1; i<intArr.length; i++) {
			if(maxVal <intArr[i]) {
				maxVal = intArr[i];
			}
			if(minVal > intArr[i]) {
			minVal = intArr[i];
			}
			
		}
		System.out.println("최댓값:" + maxVal);
		System.out.println("최솟값:" + minVal);
	}
	
}
