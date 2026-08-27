package in.pt.resources;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import in.pt.beans.*;

@Configuration
public class SpringConfigFile 
{
	@Bean("fullname")
	public Name createBean1()
	{
		Name n=new Name("Priyanshi"," ","Tomar");
		return n;
	}
	@Bean("Std")
	public Student createBean()
	{
		Student std=new Student(createBean1(),134,17,"priyanshitomar1506@gmail.com");
		return std;
	}
}
