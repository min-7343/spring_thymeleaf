package kr.co.sist.obj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ObjectController {

	@GetMapping("obj/object_value")
	public String objData(Model model) {
		//view를 보여주기 위해 Model 사용하는 것
		ObjDTO obj=new ObjDTO();
		obj.setName("주현석");
		obj.setAge(27);
		
		model.addAttribute("data",obj);
		
		return "obj/obj_view";
	}//objData
	
}//class
