package com.niit.OnlineShopping.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController
{
	@RequestMapping("/login")
     public ModelAndView login()
     {
        ModelAndView mv=new ModelAndView("login");
        mv.addObject("title", "Login");
        mv.addObject("userClickLogin",true);
  		return mv;
     }
	
	@RequestMapping("/register")
	public ModelAndView register()
	{
		ModelAndView mv=new ModelAndView("register");
		mv.addObject("title","Register");
		mv.addObject("userClickRegister",true);
		return mv;
	}
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView("about");
		mv.addObject("title","About");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","main");
		mv.addObject("userClickPage",true);
		return mv;
	}
	
	
	
	@RequestMapping("/page")
	public ModelAndView Online()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","main");
		mv.addObject("userClickPage",true);
		return mv;
	}
	
	@RequestMapping({"/home"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("home");
	    mv.addObject("title","Home");
	    mv.addObject("userClickHome",true);
	    return mv;
	}
	
	@RequestMapping("/contact")
	public ModelAndView model()
	{
		ModelAndView mv=new ModelAndView("contact");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContact",true);
		return mv;
	}
}
