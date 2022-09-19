package ch15.exercise7;

import java.util.ArrayList;
import java.util.List;

// 게시물을 가져오는 클래스 
public class BoardDao {
	//코드 작성 
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		
		return list;
		
	}
}
