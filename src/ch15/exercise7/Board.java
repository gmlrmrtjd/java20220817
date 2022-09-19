package ch15.exercise7;
// 게시물 클래스 
public class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public String getTitle() { return title; }
	
	public String getContent() {return content;}
}
