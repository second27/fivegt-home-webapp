package kr.co.fivegt.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/business")
public class BusinessController {
	
	@RequestMapping(value ={"/faceRecognition"}, method = RequestMethod.GET)
	public String faceRecognition() {
		return "business/faceRecognition";
	}
	
	@RequestMapping(value ={"/anc"}, method = RequestMethod.GET)
	public String anc() {
		return "business/anc";
	}
	
	@RequestMapping(value ={"/design"}, method = RequestMethod.GET)
	public String design() {
		return "business/design";
	}
	
	@RequestMapping(value ={"/engineering"}, method = RequestMethod.GET)
	public String engineering() {
		return "business/engineering";
	}
	
	@RequestMapping(value ={"/fireDitection"}, method = RequestMethod.GET)
	public String fireDitection() {
		return "business/fireDitection";
	}
	
}
