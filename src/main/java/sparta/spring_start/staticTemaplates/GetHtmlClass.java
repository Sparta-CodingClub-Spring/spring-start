package sparta.spring_start.staticTemaplates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetHtmlClass {

	@GetMapping("/hello1")
	public String staticHello1(){
		return "/statichello.html";
	}
	@GetMapping("/hello2/world")
	public String staticHello2(){
		return "/statichello.html";
	}
	@GetMapping("/hello3/world")
	public String staticHello3(){
		return "forward:/statichello.html";
	}
	@GetMapping("/hello4/re")
	public String redirectHello(){
		System.out.println("hello/re API 입니다.");
		return "redirect:/hello1";
	}

	@GetMapping("/hello5")
	public String templatesHello(){
		return "templateshello";
	}

	@GetMapping("/hello6")
	public String templatesHello6(){
		return "/templateshello.html";
	}
}
