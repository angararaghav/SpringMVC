package com.springmvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	  @RequestMapping("/add")
		//public ModelAndView add(HttpServletRequest objRequest , HttpServletResponse objResponse)
		public ModelAndView add(@RequestParam("num1") int i,  @RequestParam("num1") int j,HttpServletRequest objRequest , HttpServletResponse objResponse)
		{
			System.out.println("Hi 6");
			
			//int i = Integer.parseInt(objRequest.getParameter("num1"));
			//int j = Integer.parseInt(objRequest.getParameter("num2"));
			int k = i + j;
			ModelAndView objModelView = new ModelAndView();
			objModelView.setViewName("display");
			objModelView.addObject("result",k);
			return objModelView;
			
		}

}
