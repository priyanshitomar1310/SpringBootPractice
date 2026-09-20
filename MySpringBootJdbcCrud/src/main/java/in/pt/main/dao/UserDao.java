package in.pt.main.dao;

import in.pt.main.mapper.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.pt.main.entity.User;

@Repository
public class UserDao 
{
	@Autowired
	private JdbcTemplate myJdbcTemplate;
	
	// INSERT OPERATION
	public boolean insertUser(User user)
	{
		boolean status =false;
		try
		{
			String myQuery="INSERT INTO USER VALUES(?,?,?,?)";
			int count=myJdbcTemplate.update(myQuery,user.getUserId(),user.getName(),user.getEmailId(),user.getAge());
			if(count>0)
			{
				status=true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	//UPADTE OPERATION
	public boolean updateUser(int UserId1,int UserId2)
	{
		boolean status =false;
		try
		{
			String myQuery="UPDATE USER SET UserId=? where UserId=?";
			int count=myJdbcTemplate.update(myQuery,UserId1,UserId2);
			if(count>0)
			{
				status=true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	//DELETE OPERATION
	public boolean deleteUser(int UserId)
	{
		boolean status =false;
		try
		{
			String myQuery="DELETE FROM USER where UserId=?";
			int count=myJdbcTemplate.update(myQuery,UserId);
			if(count>0)
			{
				status=true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	//SELECT OPERATION FOR SINGLE USER
	public User getUser(int UserId)
	{
		String myQuery="SELECT * FROM User WHERE UserId=?";
		return myJdbcTemplate.queryForObject(myQuery,new UserRowMapper(),UserId);
	}
	
	//SELECT OPERATION FOR ALL USERS
	public List<User> getAllUsers()
	{
		String myQuery="SELECT * FROM User";
		return myJdbcTemplate.query(myQuery,new UserRowMapper());
	}
}
