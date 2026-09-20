package in.pt.main.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.*;
import in.pt.main.entity.*;

public class UserRowMapper implements RowMapper<User>
{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User();
		user.setUserId(rs.getInt("UserId"));
		user.setName(rs.getString("Name"));
		user.setEmailId(rs.getString("EmailId"));
		user.setAge(rs.getInt("Age"));
		return user;
	}
	
}
