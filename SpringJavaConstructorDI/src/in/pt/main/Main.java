package in.pt.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.pt.beans.Student;
import in.pt.resources.*;



public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext ac= new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student st=(Student) ac.getBean("Std");
		st.display();
	}
}
