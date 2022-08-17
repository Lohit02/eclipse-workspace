package june;

public class Student {
	int roll_no;
	float marks;
	String name;
	double  percentage;
	String status;
	
	
	 Student(int roll,float marks,String name,double  percentage,String status) {
		this.roll_no= roll;
		this.name= name;
		this.marks= marks;
		this.percentage=percentage;
		this.status=status;
		
	}
	
/*
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	*/
}
