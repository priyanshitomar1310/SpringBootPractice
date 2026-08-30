package in.pt.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import in.pt.beans.*;
import in.pt.mappers.*;
import in.pt.resources.SpringConfigFile;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	
//    	Scanner sc=new Scanner(System.in);
//    	System.out.print("Enter name");
//    	String name=sc.nextLine();
//    	System.out.print("Enter email");
//    	String email=sc.next();
//    	sc.nextLine();
//    	System.out.print("Enter age");
//    	int age=sc.nextInt();
    	
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jd=ac.getBean(JdbcTemplate.class);
        
        
        /*Insert query
        String sqlQuery="Insert into Student_details VALUES(?,?,?)";
        int count=jd.update(sqlQuery,name,age,email);*/
        
        
        /*Delete Query
       String sqlQuery="DELETE FROM Student_details WHERE name=?";
      int count=jd.update(sqlQuery,name);*/
        
        
        /*Update Query
        String sqlQuery="UPDATE Student_details SET age=? WHERE name=?";
        int count=jd.update(sqlQuery,27,"Tushar Tomar");
        if(count>0)
        {
        	System.out.print("Data stored successfully");
        }
        else
        {
        	System.out.print("Error Occured");
        }*/
        
        /*Select Operation*/
        String sqlQuery="Select * from Student_details";
        List<Students> list=jd.query(sqlQuery, new StudentRowMapper());
        for(int i=0;i<list.size();i++)
        {
        	Students st=list.get(i);
        	System.out.println("Name : "+st.getName());
        	System.out.println("Email : "+st.getEmail());
        	System.out.println("Age : "+st.getAge());
        	System.out.println("-----------------");
        }

        
    }
}
