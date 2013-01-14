package kr.co.fivegt.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	@RequestMapping(value ={"/", ""}, method = RequestMethod.GET)
	public String company() {
		return "company/company";
	}
	
	@RequestMapping(value ={"/greeting"}, method = RequestMethod.GET)
	public String greeting() {
		return "company/greeting";
	}
	
	@RequestMapping(value ={"/organization"}, method = RequestMethod.GET)
	public String organization() {
		return "company/organization";
	}
	
	@RequestMapping(value ={"/ideology"}, method = RequestMethod.GET)
	public String ideology() {
		return "company/ideology";
	}
	
	@RequestMapping(value ={"/fivegt"}, method = RequestMethod.GET)
	public String fiveGT() {
		return "company/fivegt";
	}
	
	@RequestMapping(value ={"/contacUs"}, method = RequestMethod.GET)
	public String contacUs() {
		return "company/contacUs";
	}
	
}
