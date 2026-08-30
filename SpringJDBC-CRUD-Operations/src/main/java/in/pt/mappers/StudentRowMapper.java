package in.pt.mappers;
import in.pt.beans.Students;
import java.sql.*;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Students>
{
	@Override
	public Students mapRow(ResultSet rs,int rowNum) throws SQLException{
		Students std=new Students();
		std.setName(rs.getString("name"));
		std.setEmail(rs.getString("email"));
		std.setAge(rs.getInt("age"));
		return std;
	}
}
