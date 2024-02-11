package demo;

public class First_Class {
	
	public static void print() {
		System.out.println("Hi.....!");
	}
	public static void print1() {
		System.out.println("Hello....!");
	}
	public static void print2() {
		System.out.println("How Are You.....");
	}
	public static void print3() {
		print1();
		print2();
		print();
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,int b, int c) {
		return a+b+c;
	}
	public static int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	public static void main(String[] args) {
		System.out.println("Hi.....Pavan");
		print3();
		
		int a=100;
		
		System.out.println(a);
		
		a=300;
		
		System.out.println(a);
		
		System.out.println(add(100,200,add(200,300,400,add(10,20,30,40))));
		
	}

}
