package practice.method;

class Accounting{
    public double valueOfSupply;
    public static double vatRate = 0.1;
    public Accounting(double valueOfSupply) {
    	this.valueOfSupply = valueOfSupply;
    	
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    // ...
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp{
    public static void main(String[] args) {
    	Accounting a1 = new Accounting(10000.0);
//    	a1.valueOfSupply = 10000.0;
    	Accounting a2 = new Accounting(20000.0);
//    	a2.valueOfSupply = ;

		System.out.println("Value of supply : " + a1.valueOfSupply);  
		System.out.println("Value of supply : " + a2.valueOfSupply);  
		
		System.out.println("VAT : " + a1.getVAT());  // 10퍼 금액 
		System.out.println("VAT : " + a2.getVAT());  // 10퍼 금액 
		  
		System.out.println("Total : " + a1.getTotal()); // 공급가+ 부가가치세 
		System.out.println("Total : " + a2.getTotal()); // 공급가+ 부가가치세 



//    	Accounting.valueOfSupply = 10000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);  
//    	Accounting.valueOfSupply = 20000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        
//    	Accounting.valueOfSupply = 10000.0;
//    	System.out.println("VAT : " + Accounting.getVAT());  // 10퍼 금액 
//    	Accounting.valueOfSupply = 20000.0;
//    	System.out.println("VAT : " + Accounting.getVAT());  // 10퍼 금액 
//    	
//    	Accounting.valueOfSupply = 10000.0;
//        System.out.println("Total : " + Accounting.getTotal()); // 공급가+ 부가가치세 
//    	Accounting.valueOfSupply = 20000.0;
//        System.out.println("Total : " + Accounting.getTotal()); // 공급가+ 부가가치세 
  
    }
}