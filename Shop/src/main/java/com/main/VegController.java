package com.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/veg")
public class VegController {

	@ResponseBody
	@RequestMapping("/getFood")
	public String getFood()
	{
		return "My Food veg";
	}
	
	@ResponseBody
	@RequestMapping("/getFoodById")
	public String getFood(@RequestParam String Id)
	{
		return "My Food veg "+Id;
	}
}
