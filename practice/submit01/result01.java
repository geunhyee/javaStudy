package practice.submit01;

import java.util.Scanner;
import java.util.spi.LocaleNameProvider;

public class result01 {

	public static void main(String[] args) {
// q. 01 
		String name = "박근혜";
		System.out.println("이름:" + name);
		int age = 31;
		System.out.println("나이:"+ age);
		float height = 161.6f;
		System.out.println("키:"+ height );
		String number = "01094129056";
		System.out.println("연락처:"+ number);
		String email = "swing0323@naver.com";
		System.out.println("이메일:"+ email);
		
// q. 02
		String enigma = "너오구늘리뭐너먹구지리";
		enigma = enigma.replace("너","" ).replace("구", "").replace("리","");
		
		System.out.println(enigma);
		
//
//		System.out.println("1차 암호 해독[ 제거]"+ enigma.replace("너",""));
//		System.out.println("2차 암호 해독[ 제거]"+ enigma.replace("구",""));
//		System.out.println("3차 암호 해독[ 제거]"+ enigma.replace("리",""));
//		
//		
//	q. 03
		
		String example = "278";
		String strEx = example + "";
		
		String str1 = strEx.substring(0,1);
		String str2 = strEx.substring(1,2);
		String str3 = strEx.substring(2,3);
		int result = Integer.parseInt(str1)+Integer.parseInt(str2)+Integer.parseInt(str3);
		System.out.println(result);
	
		
//		문자 편집 shift + alt + a 마우스 커서가 +로 바뀜, 그러면 영역을 잡아서 지우거나 글자를 바꿀 수 있음
//		복사 ctrl + alt + 방향키 아래로 
//		엑셀 문자도 복사해서 넣을수있음 - 문자편집 단축키로
//		ctrl + shift+ f 정렬
		
		
		
		
		
		
	}

}
