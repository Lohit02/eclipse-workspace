package methods;

import java.util.Arrays;

public class dot_operator {

	public static void main(String[] args) {
		
//		
//		Student[] stu1= new Student[15];
//		System.out.println(Arrays.toString(stu1));
//		
		
		
		
//		
		Student lohit;
		lohit= new Student ();
		Student rima= new Student();
		rima.greeting();
		lohit.changeName("Shoelover");
		System.out.println(lohit.rollno);
		lohit.greeting();
		
		}
	}
	class Student{
		int rollno;
		String name;
		float percetage;
		double avg;
		String add;
		public Student(int rollno, String name, float percetage, double avg, String add, boolean married,
				boolean qualified) {
			this.rollno = rollno;
			this.name = name;
			this.percetage = percetage;
			this.avg = avg;
			this.add = add;
			this.married = married;
			this.qualified = qualified;
		}



		boolean married;
		boolean qualified;
		
		void greeting() {
			System.out.println(this.name);
		}
		void changeName(String newName) {
			this.name= newName;
}
		
		
		
		Student(){
			   this.rollno=13;
			   this.name="lohit biswas";
			   this.qualified=true;
			   
		}
		
	}
