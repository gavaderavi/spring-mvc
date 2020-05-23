package com.zensar;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zensar.service.AddService;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String printHello() {
		return "hello";
	}

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam(name = "a") int i, @RequestParam(name = "b") int j,Locale locale, HttpServletRequest req,
			HttpServletResponse res) throws NumberFormatException {
//		int i = Integer.parseInt(req.getParameter("a"));
//		int j = Integer.parseInt(req.getParameter("b"));

		AddService as = new AddService();
		int k = as.add(i, j);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("disp");
		mv.addObject("result", k);
		mv.addObject(locale.getCountry());
		return mv;
	}
}
