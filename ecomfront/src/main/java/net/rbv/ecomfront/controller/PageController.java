package net.rbv.ecomfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		
		ModelAndView mv =new ModelAndView("page");
		mv.addObject("userClickedHome", true);
		mv.addObject("title", "Home");
		return mv;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about(){
		
		ModelAndView mv =new ModelAndView("page");
		mv.addObject("userClickedAbout", true);
		mv.addObject("title", "About");
		return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact(){
		
		ModelAndView mv =new ModelAndView("page");
		mv.addObject("userClickedContact", true);
		mv.addObject("title", "Contact Us");
		return mv;
	}
	
}
