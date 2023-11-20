package practice.submit01;



public class practice_ex {

	public static void main(String[] args) {
		String [] data = {"팽수","길수","수잔","수촨","길동","동길"};
		int cnt = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i].indexOf("수")>=0) {
				cnt++;
			}
		}
		System.out.println("수가 포함된 이름의 수는:" +cnt);
	}

}
