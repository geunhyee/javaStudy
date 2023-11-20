package practice.submit01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class result07 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lottoNumbers = makeLotto();
		System.out.println("로또 번호:" + lottoNumbers);
	}
	
	public static ArrayList<Integer> makeLotto() {
		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		Random random = new Random();
		
		while (lottoNumbers.size() <6) {
			int ramdomNumber = random.nextInt(45) +1;
			if(!lottoNumbers.contains(ramdomNumber)) {
				lottoNumbers.add(ramdomNumber);
			}
		}
		
		lottoNumbers.sort(null);
		
		return lottoNumbers;
		
	}

}

//죄송해요 모르겠어요.........ㅠㅠㅠㅠㅠㅠㅠㅠㅠ
