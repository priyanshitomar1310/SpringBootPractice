package in.pt.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController 
{
	@GetMapping("/openProfile")
	public String openProfilePage(Model model)
	{
		String name="Priyanshi Tomar";
		model.addAttribute("modelName", name);
		return "profile";
	}
}
