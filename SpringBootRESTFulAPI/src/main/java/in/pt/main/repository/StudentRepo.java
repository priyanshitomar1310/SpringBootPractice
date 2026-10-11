package in.pt.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pt.main.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>
{
	
}
