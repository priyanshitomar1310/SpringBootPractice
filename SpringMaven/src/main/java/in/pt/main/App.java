package in.pt.main;

import in.pt.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("in/sp/resources/SpringConfigFile.xml");
        Student std=(Student) ac.getBean("std");
        std.display();
    }
}
