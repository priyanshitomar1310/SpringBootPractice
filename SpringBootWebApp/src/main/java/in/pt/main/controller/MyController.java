package in.pt.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.pt.main.entity.Student;
import in.pt.main.service.StudentServiceImplement;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController 
{
	@Autowired
	StudentServiceImplement ssi;
	
	@GetMapping("/registerPage")
	public String registerStudent(Model model)
	{
		model.addAttribute("Student", new Student());
		return "register";
	}
	
	@PostMapping("/register")
	public String submitRegisterForm(@ModelAttribute("Student") Student st,Model model)
	{
		System.out.println("Email received = " + st.getEmail());
		boolean status=ssi.registerStudent(st);
		if(status)
		{
			model.addAttribute("successMsg","User Registered Successfully, Login Now");
		}
		else
		{
			model.addAttribute("errorMsg","User already Registered");
		}
		return "login";
	}
	
	@GetMapping("/login")
	public String getProfilePage(Model model)
	{
		model.addAttribute("student", new Student());
		return "login";
	}
	
	@PostMapping("/profilePage")
	public String profileforUser(@ModelAttribute("student")Student st,Model model)
	{
		Student std=ssi.getUser(st.getEmail(),st.getPassword());
		if(std!=null)
		{
			return "profilePage";
		}
			model.addAttribute("errorMsg","Email Id or password does'nt match");
			return "login";
	}
	
	@GetMapping("/logout")
	public String logOut(HttpServletRequest req)
	{
		HttpSession session=req.getSession();
		session.invalidate();
		return "login";
		
	}
}
