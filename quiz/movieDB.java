package quiz;

import java.util.ArrayList;

public class movieDB {

	private ArrayList<movie> movieList = new ArrayList<movie>();
	
	//싱글톤 패턴
	public movieDB() {
		movieList.add(new movie("신세계", "거 죽기 딱 좋은 날씨네", "박성웅", "ㅅㅅㄱ"));
		movieList.add(new movie("기생충", "넌 계획이 다 있구나", "송강호", "ㄱㅅㅊ"));
	}
	//인스턴스 생성을 해당 클래스에 하기때문에 (private) 외부에서 못함.
	private static movieDB instance = new movieDB();
	//외부에서 접근
	public static movieDB getInstance() {
		return instance;
	}
	//외부에서 접근
	public ArrayList<movie> getMovieList(){
		return movieList;
	}
}
