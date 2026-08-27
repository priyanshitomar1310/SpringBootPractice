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
		Name n=new Name();
		n.setFirstName("Priyanshi");
		n.setMiddleName(" ");
		n.setLastName("Tomar");
		return n;
	}
	@Bean("Std")
	public Student createBean()
	{
		Student std=new Student();
		std.setFullName(createBean1());
		std.setAge(134);
		std.setClasses(17);
		std.setEmail("priyanshitomar1506@gmail.com");
		return std;
	}
}
