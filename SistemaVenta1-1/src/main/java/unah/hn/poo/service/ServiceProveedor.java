package unah.hn.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.poo.model.Proveedor;
import unah.hn.poo.repository.RepositoryProveedor;



@Service
public class ServiceProveedor {
	@Autowired
	RepositoryProveedor repositoryProveedor;
	

	public void crearProveedor(Proveedor proveedor) {
		this.repositoryProveedor.save(proveedor);
		
	} 
	
	public List<Proveedor> obtenerTodosProveedor(){
		return this.repositoryProveedor.findAll();
				
	}
	
	public Proveedor buscarProveedor(int id) {
		return this.repositoryProveedor.findById(id);
				
	}
	
	

}
