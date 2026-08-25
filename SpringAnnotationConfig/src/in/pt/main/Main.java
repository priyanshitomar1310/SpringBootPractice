package in.pt.main;
import in.pt.beans.Student;
import in.pt.resources.*;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std=(Student)ac.getBean("student");
		std.display();
	}
}
