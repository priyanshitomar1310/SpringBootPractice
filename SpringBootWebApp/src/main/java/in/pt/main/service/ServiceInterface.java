package in.pt.main.service;

import in.pt.main.entity.Student;

public interface ServiceInterface 
{
	public boolean registerStudent(Student st);
	public Student getUser(String Email,String password);
}
