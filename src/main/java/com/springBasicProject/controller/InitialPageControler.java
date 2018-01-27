package com.springBasicProject.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class InitialPageControler {
    final static Logger logger = Logger.getLogger(InitialPageControler.class);
	/**
	 * Metodo que nos lleva a la pagina inicial
	 * 
	 *  @return
	 */
	@RequestMapping(value={"/"}, method = RequestMethod.GET)
	public ModelAndView goInicio() {		
		logger.info("--- inicio ---");
		ModelAndView model = new ModelAndView();
		model.setViewName("initialPage");
		return model;		
	}
	
	@RequestMapping(value ="/private/welcome",method = RequestMethod.GET)
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		System.out.println(message);
		return null;
	}
}
