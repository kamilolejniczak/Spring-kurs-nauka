package pl.reaktor.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
	//@GetMapping("/")
	
	@RequestMapping("/")		//przekierowuje
	
	public String hello(){		//zwraca metode hello
		return "hello";
	}
	
}
