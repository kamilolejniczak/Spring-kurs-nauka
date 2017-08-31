package pl.reaktor.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	//@GetMapping("/")
	@RequestMapping("/")		//przekierowuje
	public String hello(){		//zwraca metode hello
		return "hello";
	}
	@RequestMapping("/info")
	public String info(){
		return "info";
	}
	@RequestMapping("/hello")
	public String helo2(){
		return "hello";
	}
}
