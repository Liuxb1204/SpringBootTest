package com.dancer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dancer
 *	页面跳转
 */
@Controller
public class PageController {
	
	@RequestMapping("/index")
	public String index(Model mode){
		
		List<String> list = new ArrayList<String>();
		list.add("佩奇");
		list.add("乔治");
		list.add("肖恩");
		list.add("舒克");
		list.add("贝塔");
		mode.addAttribute("phone", "15732174319");
		mode.addAttribute("list", list);
		mode.addAttribute("name","斌哥");
		return "index";
	}
}















