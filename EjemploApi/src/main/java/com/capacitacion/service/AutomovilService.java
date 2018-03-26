package com.capacitacion.service;

import java.util.List;
import com.capacitacion.model.Automovil;

public interface AutomovilService {

	public List<Automovil> getAutomoviles();

	public Automovil getAutomovil(long automovilId);

	public void addAutomovil(Automovil automovil);

	public void updateAutomovil(long automovilId, Automovil automovil);

	public void deleteAutomovil(long automovilId);

}
