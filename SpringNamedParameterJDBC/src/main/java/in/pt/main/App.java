package in.pt.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.*;
import in.pt.beans.*;
import java.util.*;
import in.pt.mapper.*;

import in.pt.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        NamedParameterJdbcTemplate njd=ac.getBean(NamedParameterJdbcTemplate.class);
        Map<String,Object> map=new HashMap<>();
        map.put("name","Shorya Tomar");
        map.put("age","16");
        map.put("email","shoryatomar2209@gmail.com");
        String SqlQuery="INSERT INTO Student_details VALUES(:name,:age,:email)";
        int count=njd.update(SqlQuery,map);
        if(count>0)
        {
        	System.out.println("Operation Performed Successfully");
        }
        else
        {
        	System.out.println("Error Occured");
        }
    }
}
