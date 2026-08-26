package in.pt.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.pt.beans.Student;

public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("in/pt/resources/springConfigFile.xml");
		Student std=(Student) ac.getBean("std1");
		std.display();
	}
}
