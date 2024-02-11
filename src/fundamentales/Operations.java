package fundamentales;

public class Operations {

	public static void main(String[] args) {
		 
		int a=200,b=50;
		
		//Arithmetic Operators
		System.out.println("Addition "+(a+b));
		System.out.println("Substraction "+(a-b));
		System.out.println("Multiplication "+(a/b));
		System.out.println("Division "+(a*b));
		System.out.println("Modular Division: "+(a%b));

		//Increment /Decrement Operators
		
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);
		
		a +=150; // a=a+150;
		System.out.println(a);
		
		a -=150; //a=a-150;
		System.out.println(a);
		
		System.out.println(a*=5); //a=a*5;
		System.out.println(a/=5); //a=a/5;
		System.out.println(a%=5); //a=a%5;
	
		System.out.println(a+=200); //a=a+200;
		System.out.println(a+300);
		
		System.out.println(a);
		
		System.out.println(a+=300);//a=a+300;
		System.out.println(a);
		
		//Comparison/Relational Operator
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		
		//Logical Operator
		
		System.out.println(a<b && a>b);
		System.out.println(a<b || a>b);
		System.out.println(!(a<b || a>b));
		
		//Ternary Operator
		
		System.out.println(a>b ? true : false);
		System.out.println(a>b ? a : b);
		System.out.println(a>b ? "A is bigger":"B is bigger");
		System.out.println(a>b ? a+300 : b+600);
		System.out.println(a>b ? 'A' : 'B');
	}

}
