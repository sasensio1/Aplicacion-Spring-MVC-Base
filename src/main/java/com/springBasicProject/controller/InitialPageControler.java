package com.springBasicProject.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.springBasicProject.logic.AcademiaService;
import com.springBasicProject.model.Academia;

 
@Controller
public class InitialPageControler {
	@Autowired
	private AcademiaService academiaService;

	
	
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
 
		List<Academia> academiaList = academiaService.getAllAcademias();
		
		return null;
	}
}
