package in.pt.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.pt.main.entity.Student;
import in.pt.main.services.Studentservice;

@RestController
public class MyController 
{
	@Autowired
	private Studentservice ss;
	
	@PostMapping("/student")
	public Student addUser(@RequestBody Student student)
	{
		return ss.addUser(student);
	}
	
	@GetMapping("/student")
	public List<Student> getAllUser()
	{
		return ss.getAll();
	}
	
	@GetMapping("/student/{user_id}")
	public ResponseEntity<Student> getUserbyId(@PathVariable int user_id) {
		Student st=ss.getUserbyId(user_id).orElse(null);
		if(st!=null)
		{
			return ResponseEntity.ok().body(st);
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping("/student/{user_id}")
	public ResponseEntity<Student> updateUserDetails(@PathVariable int user_id,@RequestBody Student st)
	{
		Student updatedStd=ss.updateStudent(user_id, st);
		if(updatedStd!=null)
		{
			return ResponseEntity.ok(st);
		}
		else
		{
			return  ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/student/{user_id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable int user_id)
	{
		ss.deleteStudent(user_id);
		return ResponseEntity.noContent().build();
	}
	
}
