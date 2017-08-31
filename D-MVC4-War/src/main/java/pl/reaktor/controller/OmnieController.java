package pl.reaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OmnieController {
	
	@RequestMapping("/")		
	public String omnie(){		
		return "omnie";
	}
	@RequestMapping("/omnie")		
	public String omnie2(){		
		return "omnie";
	}
	@RequestMapping("/blog")		
	public String blog(){		
		return "blog";
	}
	@RequestMapping("/kontakt")		
	public String kontakt(){		
		return "kontakt";
	}
}