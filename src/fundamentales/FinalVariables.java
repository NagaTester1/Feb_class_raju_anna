package fundamentales;

public class FinalVariables {
	
	final int A=100;
	
	final static int B=200;
	
	public void addition(final int A,int B) {
		
		System.out.println(A+B);
	}

	public static void main(String[] args) {
		
		FinalVariables fv=new FinalVariables();
		
		fv.addition(100,300);
		
		System.out.println(B);
		
//		fv.B=300;
		
		
	}

}
