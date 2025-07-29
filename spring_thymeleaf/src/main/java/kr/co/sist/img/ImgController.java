package kr.co.sist.img;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ImgController {
	
	@GetMapping("/img/img_view")
	public String img(Model model) {
		//view로 데이터를 전달해야 한다->Model사용
		//클다의 위에다가 어떤 요청경로인지 적으면 좋다.
		
		model.addAttribute("default_img","default_img.jpg");
		
		ImgDTO iDTO=new ImgDTO();
		iDTO.setImg("default_img2.png");
		iDTO.setTitle("기본강아지 이미지");
		
		model.addAttribute("iDTO",iDTO);
		
		return "img/img_view";
	}//img
	
}//class
