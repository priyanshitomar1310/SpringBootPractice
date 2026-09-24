package in.pt.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pt.main.entity.Student;
import in.pt.main.repository.MyRepository;

@Service
public class StudentServiceImplement implements ServiceInterface
{
    @Autowired
    MyRepository mr;
    
	@Override
	public boolean registerStudent(Student st) {
		boolean status=false;
		try
		{
			mr.save(st);
			status=true;
		}catch(Exception e)
		{
			e.printStackTrace();
			status=false;
		}
		return status;
	}

	@Override
	public Student getUser(String email, String password) 
	{
		Student st=mr.findByEmail(email);
		if(st!=null && st.getPassword().equals(password))
		{
			return st;
		}
		return null;
	}

}
