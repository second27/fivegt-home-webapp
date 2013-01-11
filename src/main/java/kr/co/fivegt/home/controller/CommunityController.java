package kr.co.fivegt.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/community")
public class CommunityController {
	
	@RequestMapping(value ={"/", ""}, method = RequestMethod.GET)
	public String community() {
		return "community/community";
	}
	
}
