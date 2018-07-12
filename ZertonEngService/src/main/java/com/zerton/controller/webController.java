package com.zerton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zerton.utility.constanturl.WebConstantUrl;

@Controller
public class webController {

	
	@RequestMapping(value=WebConstantUrl.WebLogin )
	public String test(Model model)
	{
		System.out.println("inside controller");
		model.addAttribute("msg","hiii Spring data");
		return "home";
	}
	
}
