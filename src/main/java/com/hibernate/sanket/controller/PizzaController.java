package com.hibernate.sanket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hibernate.sanket.dao.PizzaDao;
import com.hibernate.sanket.model.Pizza;

@Controller
@RequestMapping("/")
public class PizzaController {

	@Autowired
	private PizzaDao pizzaDao;
	
	@RequestMapping(value="/getPizza", method=RequestMethod.GET)
	public ModelAndView getAllPizzas(){
		ModelAndView mav= new ModelAndView("pizza/viewpizza");
		List<Pizza> piz= pizzaDao.getAllPizza();
		mav.addObject("pizzas",piz);
		return mav;
	}
	
}
