package ch11.book.s110302;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

		
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
