package fundamentales;

public class Variables {
	
	static int a =100;
	static int b =200;
	
	int c=300;
//	int c=500;// not allowed
	
	public static void addition() {
		System.out.println("Addition: "+(a+b));
	}
	
	public static int sum() {
		System.out.println("Sum: "+(a+b));
		return a+b;
	}
	
	public static void addition(int a, int b) {
		System.out.println("Addition: "+(a+b));
	}
	
	public static int sum(int a, int b) {
		System.out.println("sum: "+(a+b));
		return a+b;
	}
	
	public void print() {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		addition();
		addition(1000,200);
		sum();
		sum(2000,1000);
		
		System.out.println(sum() +1);
		
		int a=sum(1000,20000);
		int b=sum(10000,20000);
		System.out.println(a+b);
		int c=sum(1000,200)+sum(1000,20000);
//		int b=500;//not allowed to duplicate local variable

		System.out.println(c);
		
	}
	
	

}
