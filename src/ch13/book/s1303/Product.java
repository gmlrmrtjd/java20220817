package ch13.book.s1303;
//제네릭 클래스 
public class Product<T, M> {  //2개의 파라미터를 가짐 
	private T kind;
	private M model;
	
	
	public T getKind() { 
		return this.kind; }
	public M getModel() { 
		return this.model; }
	
	public void setKind(T kind) {
		this.kind = kind; }
	public void setModel(M model) {
		this.model = model; }
	
}
