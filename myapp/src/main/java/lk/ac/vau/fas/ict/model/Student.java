package lk.ac.vau.fas.ict.model;

public class Student {
	String regno;
	String name;
	int age;
	String course;
	double gpa;
	
	public Student(String regno, String name, int age, String course,double gpa) {
		super();
		this.regno = regno;
		this.name = name;
		this.age = age;
		this.course = course;
		this.gpa = gpa;
	}
	
	public String getRegNo() {
		return regno;
	}

	public void setId(String regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
	
}
