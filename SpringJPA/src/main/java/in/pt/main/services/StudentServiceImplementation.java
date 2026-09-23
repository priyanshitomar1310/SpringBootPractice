package in.pt.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pt.main.entity.Student;
import in.pt.main.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService
{
	@Autowired
	private StudentRepository sr;

	@Override
	public boolean addStudentDetails(Student std) 
	{
		boolean status=false;
		try 
		{
			sr.save(std);
			status=true;
		}catch(Exception e)
		{
			e.printStackTrace();
			status=false;
		}
		
		return status;
	}

	@Override
	public Student getStudentDetails(int Id) 
	{
		Optional<Student> op=sr.findById(Id);
		try
		{
			if(op.isPresent())
			{
				return op.get();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudentDetails() 
	{
		return sr.findAll();
	}

	@Override
	public boolean updateStudentDetails(int Id, int age) {
		boolean status=false;
		Student st=getStudentDetails(Id);
		try {
			if(st!=null)
			{
				st.setAge(age);
				sr.save(st);
				status=true;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			status=false;
		}
		
		return status;
	}

	@Override
	public boolean deleteStudent(int Id) {
		boolean status=false;
		try {
			sr.deleteById(Id);
			status=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			status=false;
		}
		return status;
	}

}
