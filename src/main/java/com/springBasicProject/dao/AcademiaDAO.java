package com.springBasicProject.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springBasicProject.vo.AcademiaVO;

@Repository
public class AcademiaDAO {
	final static Logger logger = Logger.getLogger(AcademiaDAO.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * Devuelve una lista con todas las Academias de BBDD
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<AcademiaVO> getAllAcademias() {		
		logger.info("--- Inicio -- getAllAcademias ---");
		Session session = sessionFactory.openSession(); 
		List<AcademiaVO> academiaList = new ArrayList<AcademiaVO>();
		try {
			Query query = session.createQuery("from AcademiaVO");
			academiaList = query.list(); 
			logger.info("--- Fin -- getAllAcademias ---");
			return academiaList;
		} catch (Exception e) {
			logger.error("--- getAllAcademias " + e.getMessage() + "---");
			logger.error(e.getStackTrace());
			logger.error("--- Fin -- getAllAcademias ---");
		} finally {
			session.close();
		}
		return academiaList;
	}
}
