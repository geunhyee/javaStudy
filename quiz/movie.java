package quiz;
//VO(value object)
public class movie {
	private String title; //영화제목
	private String quote;	//명대사
	private String actors; // 배우
	private String word;	//초성
	
	public movie(String title, String quote, String actors, String word) {
		super();
		this.title = title;
		this.quote = quote;
		this.actors = actors;
		this.word = word;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "movie [title=" + title + ", quote=" + quote + ", actors=" + actors + ", word=" + word + "]";
	}
	
	
	
	

	

}
