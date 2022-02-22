package com.carmenguevara.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carmenguevara.models.Address;
import com.carmenguevara.models.Student;

@SpringBootApplication
public class SpringIntroApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringIntroApplication.class, args); 		//makes it and spring anotation
	
		Address stu_Address = new Address("4216 Cornell ", "Atlanta", "GA", 30076);
	
		Student ann = new Student();
		
		
		Student student1 = new Student(5, "Carmen", true, stu_Address, "678-637-7548");
		
		ann.setName("Ann Nunez");
		ann.setAddress(stu_Address);
		
		System.out.println("Student : " + ann.getName());
		System.out.println("Student : " + ann);
		System.out.println(student1);
		
	
	}

}
