package com.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/nonveg")
public class NonVegController {

	@RequestMapping("/getFood")
	public String getFood(Model model)
	{
		String msg = "my non veg food";
		String orderid = "1234";
		String customerName = "Rohan";
		model.addAttribute("message", msg);
		model.addAttribute("orderid", orderid);
		model.addAttribute("custName", customerName);
		
		return "getFoodView";
	}
}
