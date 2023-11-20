package practice_result08;

import java.util.ArrayList;
import java.util.Scanner;

public class Caffe {
	private String korNm ;
	private String enNm;
	private ArrayList<Coffee> menuList = new ArrayList<Coffee>();
	
	
		
	public Caffe(String korNm, String enNm) {
		super();
		this.korNm = korNm;
		this.enNm = enNm;
		this.menuList = new ArrayList<Coffee>();
	}
	
	

	public Caffe(String korNm, String enNm, ArrayList<Coffee> menuList) {
		super();
		this.korNm = korNm;
		this.enNm = enNm;
		this.menuList = menuList;
	}



	public String getKorNm() {
		return korNm;
	}

	public void setKorNm(String korNm) {
		this.korNm = korNm;
	}

	public String getEnNm() {
		return enNm;
	}

	public void setEnNm(String enNm) {
		this.enNm = enNm;
	}

	public ArrayList<Coffee> getMenuList() {
		return menuList;
	}

	public void setMenuList(ArrayList<Coffee> menuList) {
		this.menuList = menuList;
	}

	@Override
	public String toString() {
		return "Caffe [korNm=" + korNm + ", enNm=" + enNm + ", menuList=" + menuList + "]";
	}
	
	//커피 메뉴를 추가
	public void addCoffe(Coffee cf) {
		menuList.add(cf);
	}
	//메뉴판 출력 메소드
	public void ShowMenu() {
		for(int i =0; i < menuList.size(); i++) {
			System.out.println((i+1)+"."+menuList.get(i));
		}
	}
	//커피 구매하는 메소드
	public void buyCoffee(Scanner sc) {
		System.out.println("메뉴를 선택해주세요: ");
		int choice = Integer.parseInt(sc.nextLine());
		System.out.println(menuList.get(choice-1).getName()+
				"를" + menuList.get(choice-1).getPrice()+"원에 구매했습니다.");
	}
	

	
	
	
	
	
	
	

}
