package practice.submit01;

import java.nio.channels.ShutdownChannelGroupException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;



public class result07_1 {

	public static void main(String[] args) {
		
		System.out.println(makeLotto());
		System.out.println(ShuffleLotto());
		System.out.println(setLotto);

	}
	
	public static ArrayList<Integer> makeLotto(){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(numbers.size()<6) {
			int lotto = (int) (Math.random()*45 +1);
			boolean isEqual = false;
			for(int i = 0; i< numbers.size(); i++) {
				if(lotto == numbers.get(i)) {
					isEqual = true;
				}

			}if(!isEqual) {
				numbers.add(lotto);
		}
			Collections.sort(numbers);
			return numbers;
		}
	
		public static ArrayList<Integer> shuffleLotto(){
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			int maxNum = 45;
			for(int i = 1; i <= maxNum; i++) {
				numbers.add(i);
			}
			Collections.shuffle(numbers);
			ArrayList<Integer> result = 
					new ArrayList<Integer>(numbers.subList(0, 6));
			
			return result;
		}
		public static ArrayList<Integer> setLotto(){
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			HashSet<Integer> lottoSet = new HashSet<Integer>();
			while(lottoSet.size() < 6) {
				int num = (int)(Math.random()*45 +1);
				lottoSet.add(num);
			}
			for(Integer val : lottoSet) {
				numbers.add(val);
			}
			Collections.sort(numbers);
			return numbers;
		}
	}
	
	
	

}
