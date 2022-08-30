package practice.method;

class Accounting2{
    public double valueOfSupply; //  a1에 속한 value를 쓰기떔느에 static 뺀다
    public static double vatRate = 0.1;   // 부가가치율은 어떤 인스턴스든 공통이기때문에 class소속 
    public Accounting2(double valueOfSupply) {
    	this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {   
        return valueOfSupply * vatRate;
    }
        // getVAT는 instance에 속한 value에 접근하기 때문에 static 뺀다.
        // static은 class의 소속인데, instance의 value 접근하기 위해 
        // 어떤 instance로 접근해야할지(a1인지 a2인지) 알 수 없기 떄문에.
        
        
    public double getTotal() {
        return valueOfSupply + getVAT();
    }   // 위 getVAT와 같이 static 뺸다.
}
public class AccountingApp2 {
    public static void main(String[] args) {
    	Accounting2 a1 = new Accounting2(10000.0);		// a1이라는 인스턴스를 만들어
//        a1.valueOfSupply = 10000.0; 						// a1의 value를  10000.0으로  
    	Accounting2 a2 = new Accounting2(20000.0);		// a1이라는 인스턴스를 만들어
//        a2.valueOfSupply = 20000.0; 						// a1의 value를  10000.0으로  
        
        System.out.println("Value of supply : " + a1.valueOfSupply);  // value는 a1 인스턴스에 속해있다.
        System.out.println("VAT : " + a1.getVAT());
        System.out.println("Total : " + a1.getTotal());
        
        System.out.println("Value of supply : " + a2.valueOfSupply);  // value는 a1 인스턴스에 속해있다.
        System.out.println("VAT : " + a2.getVAT());
        System.out.println("Total : " + a2.getTotal());
    }
}