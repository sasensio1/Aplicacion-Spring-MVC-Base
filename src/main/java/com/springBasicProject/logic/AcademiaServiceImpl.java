package com.springBasicProject.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springBasicProject.dao.AcademiaDAO;
import com.springBasicProject.model.Academia;
import com.springBasicProject.util.ParserModelVO;
import com.springBasicProject.vo.AcademiaVO;

public class AcademiaServiceImpl implements AcademiaService {

	@Autowired
	private AcademiaDAO academiaDAO;
	
	//Recuperamos todas las academias
	@Override
	public List<Academia> getAllAcademias(){
		List<Academia> academiaList= new ArrayList<Academia>();
		
		List<AcademiaVO> academiaVOList= academiaDAO.getAllAcademias();
		ParserModelVO.parseDataModelVO(academiaVOList, academiaList);
		
		return academiaList;
	}
}
