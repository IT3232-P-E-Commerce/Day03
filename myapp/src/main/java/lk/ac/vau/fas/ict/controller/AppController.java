package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class AppController {
	
	Student st1 = new Student("132","Alice",12,"ICT",3.5);
	Student st2 = new Student("743","Jane",17,"AMC",2.5);
	Student st3 = new Student("156","Marry",22,"BIO",4.0);
	Student st4 = new Student("933","Gray",32,"ICT",1.8);

	List<Student> students = new ArrayList<Student>();
	
	public AppController() {
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
	}
	
	@GetMapping("/info")
	public List<Student> getStudents(){
		return students;
	}
	
	@GetMapping("/id/{id}") // path variable
	public Student getById(@PathVariable("id")String idnum) {
		for(Student stu : students) {
			if(stu.getRegNo().equals(idnum)) {
				return stu;
			}
		}
		return null;
	}
	
	@GetMapping("/detail/{ag}")
	public String getAge(@PathVariable("ag")int age) {
		return " Age is : "+age;
	}
	
	@GetMapping("/detail/{nm},{ag}")
	public String getDetail(@PathVariable("nm")String name,@PathVariable("ag")int age) {
		return "Name is : "+name+" Age : "+age;
	}
	
}
