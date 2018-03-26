package com.capacitacion.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capacitacion.dao.AutomovilDAO;
import com.capacitacion.model.Automovil;

@Service
@Transactional
public class AutomovilServiceImpl {


	@Autowired
	private AutomovilDAO automovilDAO;

	
	
	public List<Automovil> getAutomoviles()
	{
		return  automovilDAO.getAutomoviles();		
	}
		
	public Automovil getAutomovil(long automovilId)
	{
		return automovilDAO.getAutomovil(automovilId);
	}
	
	public void addAutomovil(Automovil automovil)
	{
		automovilDAO.addAutomovil(automovil);
		
	}
	
	public void updateAutomovil(long automovilId, Automovil automovil)
	{		
		automovilDAO.updateAutomovil(automovilId, automovil);
	}
	
	public void deleteAutomovil(long automovilId)
	{
		automovilDAO.deleteAutomovil(automovilId);
	}

	
	
	
	
	
	
	
}
