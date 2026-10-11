package in.pt.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pt.main.entity.Student;
import in.pt.main.repository.StudentRepo;

@Service
public class StudentServiceImplemenation implements Studentservice
{

	@Autowired
	private StudentRepo sr;
	
	@Override
	public Student addUser(Student std) 
	{
		return sr.save(std);
	}

	@Override
	public List<Student> getAll() 
	{
		return sr.findAll();
	}

	@Override
	public Optional<Student> getUserbyId(int user_id) 
	{
		return sr.findById(user_id);
	}

	@Override
	public Student updateStudent(int user_id, Student st) 
	{
		Student std=sr.findById(user_id).orElse(null);
		if(std!=null)
		{
			return sr.save(st);
		}
		else
		{
			throw new RuntimeException("User not Found with id: "+user_id);
		}
		
	}

	@Override
	public void deleteStudent(int user_id) 
	{
		sr.deleteById(user_id);
	}
	

}
