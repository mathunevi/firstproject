package org.college;

public class College {
public void collegeName() {
	System.out.println("bharthithasan");
	
}
public void collegeCode() {
	System.out.println("2345");
	
}
public void collegeRank() {
	System.out.println("30");
	
}
public static void main(String[] args) {
	College c=new College();
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	Student s=new Student();
	s.studentName();
	s.studentDept();
	s.studentId();
	Hostel h=new Hostel();
	h.hostelName();
	Dept d=new Dept();
	d.deptName();
}
}
