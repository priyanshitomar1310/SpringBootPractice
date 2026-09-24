package in.pt.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pt.main.entity.Student;


public interface MyRepository extends JpaRepository<Student, Integer>
{
	Student findByEmail(String email);
}
