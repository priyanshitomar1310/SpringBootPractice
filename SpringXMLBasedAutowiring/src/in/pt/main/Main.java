package in.pt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.pt.resources.*;
import in.pt.beans.Student;

public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("in/pt/resources/SpringConfigFile.xml");
		Student st=(Student)ac.getBean("std");
		st.display(); 
	}
}
