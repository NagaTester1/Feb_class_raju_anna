package fundamentales;

public class StaticandInstance {
	
	int a=100;
	int b=200;
	
	static int c=500;
	
	public void addition() {
		System.out.println(c);
		System.out.println("Addition: "+(a+b));
	}
	
	public void substraction() {
		System.out.println(c);
		addition();
		System.out.println("Substraction: "+(a-b));
	}
	
	public static void print() {
		System.out.println(c);
	}
	
	public static void print1() {
		int a=200;
		int b=300;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void print2() {
		int a=300;
		int b=400;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		
		print();
		print1();
		print2();
		
		
		StaticandInstance a=new StaticandInstance();
		a.addition();
		a.substraction();
		
		System.out.println(a.a);
		System.out.println(a.b);
		
		System.out.println(c);
	}
	

}
