package in.pt.main.services;

import java.util.List;
import java.util.Optional;


import in.pt.main.entity.Student;

public interface Studentservice 
{
	public Student addUser(Student std);
	public List<Student> getAll();
	public Optional<Student> getUserbyId(int user_id);
	public Student updateStudent(int user_id,Student st);
	public void deleteStudent(int user_id);
}