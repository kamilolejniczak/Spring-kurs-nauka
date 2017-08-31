package pl.reaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(){
		return "home";
	}
	@RequestMapping("/secured")
	public String secured(){
		return "secured";
	}
	@RequestMapping("/supersecured")
	public String supersecured(){
		return "supersecured";
	}
	@RequestMapping("/logowanie")
	public String logowanie(){
		return "logowanie";
	}
}
