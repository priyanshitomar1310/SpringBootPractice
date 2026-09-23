package in.pt.main;

import org.springframework.context.*;

import in.pt.main.entity.Student;
import in.pt.main.services.StudentServiceImplementation;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication 
{
	public static void main(String[] args) 
	{
//		Student st1=new Student();
//		st1.setAge(25);
//		st1.setName("Himanshi Tomar");
//		st1.setEmail("himanshitomar1709@gmail.com");
//		st1.setCourse("BA+BED");
		ApplicationContext ac=SpringApplication.run(SpringJpaApplication.class, args);
		StudentServiceImplementation ss=ac.getBean(StudentServiceImplementation.class);
//		boolean status=ss.addStudentDetails(st1);
//		if(status)
//		{
//			System.out.println("Details Added Successfully");
//		}
//		else
//		{
//			System.out.println("Error Occured");
//		}
//		Student st=ss.getStudentDetails(1);
//		List<Student> list=ss.getAllStudentDetails();
//        for(int i=0;i<list.size();i++)
//        {
//    		System.out.println("Id: "+list.get(i).getId());
//    		System.out.println("Age: "+list.get(i).getAge());
//    		System.out.println("Name "+list.get(i).getName());
//    		System.out.println("Email Id: "+list.get(i).getEmail());
//    		System.out.println("Course: "+list.get(i).getCourse());
//    		System.out.println("-----------------------------");
//        }
//		boolean status=ss.updateStudentDetails(2, 25);
//		if(status)
//		{
//			System.out.println("Updated Successfully");
//		}
//		else
//		{
//			System.out.println("Not Updated");
//		}
		boolean status=ss.deleteStudent(2);
		if(status)
		{
			System.out.println("Deleted Successfully");
		}
		else
		{
			System.out.println("Not Deleted");
		}


	}

}
