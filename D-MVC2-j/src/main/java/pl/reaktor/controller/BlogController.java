package pl.reaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import pl.reaktor.model.Kontakt;
import pl.reaktor.model.Posts;

@Controller
public class BlogController {

	@RequestMapping("/")		
	public String omnie(){		
		return "omnie";
	}
	@RequestMapping("/blog")		
	public String blog(Model model){
		model.addAttribute("post", new Posts());		//post od nazwy obiektu a Posts od nazwy klasy
		return "blog";
	}
	@RequestMapping("/kontakt")		
	public String kontakt(Model model){
		model.addAttribute("c", new Kontakt());
		return "kontakt";
	}
	@PostMapping("/success")
	public String success(@ModelAttribute Kontakt c, Model model){
		model.addAttribute("c", c);
		return "success";
	}
	@PostMapping("/add")
	public String add(@ModelAttribute Posts post, Model model){
		model.addAttribute("post", post);
		return "add";
	}
}
