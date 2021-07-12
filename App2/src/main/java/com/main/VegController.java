package com.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/veg")
public class VegController 
{
	//Commenting out below annotation because we don't need String Object treated as reponse body
	//@ResponseBody //We use it to send Literal values as response eg. String
	@RequestMapping("/getFood")
	public String getFood(Model model)
	{
		String message = "Hey,  Welcome to non-veg cuisine";
		int orderId = 1234;
		String customerName = "Rohan";
		
		model.addAttribute("msg", message);
		model.addAttribute("id", orderId);
		model.addAttribute("name", customerName);
		
		return "prepareFood";
	}
	
}
