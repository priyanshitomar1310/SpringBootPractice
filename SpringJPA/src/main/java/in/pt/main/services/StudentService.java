package in.pt.main.services;

import java.util.List;

import in.pt.main.entity.Student;

public interface StudentService 
{
	public boolean addStudentDetails(Student std);
	public Student getStudentDetails(int Id);
	public List<Student> getAllStudentDetails();
	public boolean updateStudentDetails(int Id,int age);
	public boolean deleteStudent(int Id);
	
}
