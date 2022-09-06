package com.hsbc.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Person person = new Person("Alexandar", "Male");
		System.out.println(person.getName()+", "+person.getGender());
		
		Employee employee = new Employee(111, "Sonu", "Female", 35000);
		System.out.println(employee.getId()+", "+employee.getName()
		+", "+employee.getGender()+" "+employee.getSalary());
		
		Student student = new Student(999, "Vijay", "Male", "A");
		System.out.println(student.getRollNo()+", "+student.getName()
			+", "+student.getGender()+", "+student.getGrade());
		
		//modifying the grade using setGrade() on any of the above object
		student.setGrade("A+");
		System.out.println(student.getRollNo()+", "+student.getName()
		+", "+student.getGender()+", "+student.getGrade());
	}

}
