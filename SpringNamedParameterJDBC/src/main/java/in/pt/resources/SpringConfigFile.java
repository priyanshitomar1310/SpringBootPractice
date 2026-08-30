package in.pt.resources;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.core.namedparam.*;


@Configuration
public class SpringConfigFile 
{
	@Bean
	public DriverManagerDataSource myDataSource()
	{
		DriverManagerDataSource dr=new DriverManagerDataSource();
		dr.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dr.setUrl("jdbc:mysql://localhost:3306/students");
		dr.setUsername("root");
		dr.setPassword("Mummypapa@1506");
        return dr;
	}
	
	@Bean
	public NamedParameterJdbcTemplate myTemplate()
	{
		NamedParameterJdbcTemplate njd=new NamedParameterJdbcTemplate(myDataSource());
		return njd;
	}
}
