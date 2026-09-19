package in.pt.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pt.main.beans.Student;

@Configuration
public class ApplicationConfig {
	@Bean
	public CommandLineRunner cmd() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				std().display();
			}
		};
	}

	@Bean
	public Student std() {
		return new Student("Priyanshi Tomar", 134, "priyanshitomar1506@gmail.com");
	}
}
