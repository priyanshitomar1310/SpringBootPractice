package in.pt.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import in.pt.beans.*;
import org.springframework.jdbc.core.RowMapper;
import in.pt.beans.*;

public class StudentRowMapper implements RowMapper<Student> 
{
	@Override
	public Student mapRow(ResultSet rs,int rowNum) throws SQLException
	{
		Student st=new Student();
		st.setName(rs.getString("name"));
		st.setEmail(rs.getString("email"));
		st.setAge(rs.getInt("age"));
		return st;
	}
}
