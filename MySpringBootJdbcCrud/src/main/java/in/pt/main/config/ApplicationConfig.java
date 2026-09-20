package in.pt.main.config;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pt.main.dao.UserDao;
import in.pt.main.entity.User;
import in.pt.main.entity.*;

@Configuration
public class ApplicationConfig 
{
	@Autowired
	private UserDao userdao;
	
	@Bean
	public CommandLineRunner cmd()
	{
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
//				boolean status=userdao.insertUser(userBean());
//				boolean status=userdao.updateUser(101,134);
//				boolean status=userdao.deleteUser(103);
//				if(status)
//				{
//					System.out.println("Successfully completed");
//				}
//				else
//				{
//					System.out.println("Error Occured");
//				}
				
//				User user=userdao.getUser(101);
//				System.out.println("User Id: "+user.getUserId());
//				System.out.println("Name: "+user.getName());
//				System.out.println("Email Id: "+user.getEmailId());
//				System.out.println("Age: "+user.getAge());
				
				List<User> list=userdao.getAllUsers();
				for(int i=0;i<list.size();i++)
				{
					System.out.println("User Id: "+list.get(i).getUserId());
					System.out.println("Name: "+list.get(i).getName());
					System.out.println("Email Id: "+list.get(i).getEmailId());
					System.out.println("Age: "+list.get(i).getAge());
					System.out.println("-------------------------");
				}
				
			}
			
		};
	}
	
	@Bean 
	public User userBean()
	{
		return new User(103,"Tushar Tomar","tushartomar1409@gmail.com",27);
	}
	
}
