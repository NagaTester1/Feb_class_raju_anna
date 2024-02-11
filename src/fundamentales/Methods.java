package fundamentales;

public class Methods {
	
	public static void addition() {
		int a=100;
		int b=200;
		System.out.println("addition: "+(a+b));
	}
	
	public static int sum() {
		int a=100;
		int b=200;
		System.out.println("Sum: "+(a+b));
		return a+b;
	}
	public static void addition(int a, int b) {
		System.out.println("Addition: "+(a+b));
	}
	public static int sum(int a,int b) {
		System.out.println("Sum: "+(a+b));
		return a+b;
	}
	
	public static void substraction() {
		int a=100;
		int b=200;
		System.out.println("Substraction: "+(a-b));
	}
	
	public static void multiplication() {
		int a=100;
		int b=200;
		System.out.println("Multiplication: "+(a*b));
	}
	
	public static void division() {
		int a=100;
		int b=200;
		System.out.println("Division: "+(a/b));
	}
	public static void modDivision() {
		int a=100;
		int b=200;
		System.out.println("modDivision: "+(a%b));
	}
	
	public static void main(String[] args) {
		addition();
		sum();
		addition(100,2000);
		sum(700,1200);
		
		System.out.println(sum()+1);
		
		int a=sum(1000,2000);
		int b=sum(10000,1000);
		
		System.out.println(a+b);
	}

}
