package practice.Ingeritance;

public class Calculator {		// 기본 생성자가 없지만 자동으로 생성됨(단 변수가진 생성자 생성하면 안됨)   
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() { 
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
	    super(left, right);   // super는 부모 클래스를 의미.  ()를 붙이면 생성자라는   뜻 
	    // 상위 클래스에 생성자 초기화가 없을 때 하위 클래스에 상위클래스 생성자 생성 후 초기화 코드 작성 해야 
	    // 초기화 코드~
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}