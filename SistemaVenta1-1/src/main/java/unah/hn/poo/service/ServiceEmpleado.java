package unah.hn.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.poo.model.Empleado;
import unah.hn.poo.repository.RepositoryEmpleado;

@Service
public class ServiceEmpleado {
	@Autowired
	RepositoryEmpleado repositoryEmpleado;
	
	public void crearEmpleado(Empleado empleado) {
		this.repositoryEmpleado.save(empleado);
	
	} 
	
	public List<Empleado> obtenerTodosEmpleado(){
		return this.repositoryEmpleado.findAll();
				
			
	}
	
	public Empleado buscarEmpleado(int id) {
		return this.repositoryEmpleado.findById(id);
				
				
	}
	
	

}
