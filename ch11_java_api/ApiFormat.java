package ch11_java_api;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class ApiFormat {

	public static void main(String[] args) {
		//숫자 형식 DecimalFormat
		//자릿수에 맞춰 숫자 앞에 0 붙이기
		//format은 문자열로 출력됨
		
		DecimalFormat decimalFormat = new DecimalFormat("00000");
		System.out.println(decimalFormat.format(1));
		System.out.println(decimalFormat.format(10));
		System.out.println(decimalFormat.format(99));
		System.out.println(decimalFormat.format(88888));
		
		//자리수에 맞춰 소수 뒤에 0 붙이기
		decimalFormat = new DecimalFormat("0.000");
		System.out.println(decimalFormat.format(12.130));
		System.out.println(decimalFormat.format(12.1));
		//반올림이 일어남.
		System.out.println(decimalFormat.format(12.9999999));
		//천 단위마다, 붙이기
		decimalFormat = new DecimalFormat("0,000");
		System.out.println(decimalFormat.format(10000000));
		System.out.println(decimalFormat.format(215460000));
		System.out.println(decimalFormat.format(10000));
		
		//MessageFormat
		String message= "회원 ID: {0} \n회원 이름:{1} \n회원 전화:{2}";
		String result = MessageFormat.format(message, "a001","팽수","0100001234");
		System.out.println(result);
		
		Object[]argsObjects = {"a002","길동","1234567"};
		System.out.println(MessageFormat.format(message, argsObjects));
	}

}
