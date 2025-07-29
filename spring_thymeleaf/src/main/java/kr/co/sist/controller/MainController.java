package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
@Controller
public class MainController {

	@RequestMapping(value="/",method= {GET,POST})
	public String index(Model model) {
		model.addAttribute("helloMsg", "Hello Thymeleaf");
		model.addAttribute("helloMsg2", "<strong>Two-Hello Thymeleaf</strong>");
		
		model.addAttribute("name", "이장훈");
		model.addAttribute("name2", "주현석");
		
		model.addAttribute("id","ju");
		return "index"; //Prefix : /templates/, suffix : .html
	}
}//class
