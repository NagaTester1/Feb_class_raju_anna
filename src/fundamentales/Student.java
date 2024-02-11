package fundamentales;

public class Student {
	
	String sName;
	int rollno;
	static String college;
	static String qualification;
	
	public void DisplayStudent() {
		System.out.println(sName);
		System.out.println(rollno);
		System.out.println(college);
		System.out.println(qualification);
		
	}
	
	public static void main(String[] args) {
		
		Student a=new Student();
		a.sName="pavan";
		a.rollno=123;
		Student.college="mpl";
		Student.qualification="B.tech";
		a.DisplayStudent();
		System.out.println("-------------------------------");
		
		Student b=new Student();
		b.sName="Naga";
		b.rollno=124;
		Student.college="mpl";
		Student.qualification="B.tech";
		b.DisplayStudent();
		
		System.out.println("--------------------------");
		
		Student c=new Student();
		c.sName="subbu";
		c.rollno=125;
		Student.college="mpl";
		Student.qualification="B.tech";
		c.DisplayStudent();
		
		
		c.college="zpc";
		
		
		c.DisplayStudent();
		a.DisplayStudent();
		b.DisplayStudent();
		
	}

}
