package com.capacitacion.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capacitacion.model.Automovil;
import com.capacitacion.repository.AutomovilRepository;




@Repository
public class AutomovilDAOImp  implements AutomovilDAO  {

	@Autowired
    AutomovilRepository objRepository;		
	
	public List<Automovil> getAutomoviles()
	{
		return  objRepository.findAll();		
	}
		
	public Automovil getAutomovil(long automovilId)
	{
		try 
		{	
			return objRepository.findById(automovilId).get();
		} 
		catch (Exception e) {
			return null;
		}
		
	}
	
	public void addAutomovil(Automovil automovil)
	{
		try 
		{
			 objRepository.save(automovil);	
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		
	}
	
	public void updateAutomovil(long automovilId, Automovil automovil)
	{
		
			boolean existe = objRepository.findById(automovilId).isPresent();
			
			if (existe) {
				objRepository.save(automovil);		
			}
				
			
			 
	}
	
	public void deleteAutomovil(long automovilId)
	{
		boolean existe = objRepository.findById(automovilId).isPresent();
		
		if (existe) {
			objRepository.deleteById(automovilId);
		}
	}

	
}
