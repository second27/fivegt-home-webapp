package kr.co.fivegt.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value ={"/", ""}, method = RequestMethod.GET)
	public String home() {
		return "home/home";
	}
	
	@RequestMapping(value ={"/siteMap"}, method = RequestMethod.GET)
	public String siteMap() {
		return "home/siteMap";
	}
	
}
