package unah.hn.poo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.poo.InterfaceService.IempleadoService;
import unah.hn.poo.Interfaces.IEmpleado;
import unah.hn.poo.Repository.RepositoryEmpleado;
import unah.hn.poo.model.Empleado;

@Service
public class EmpleadoService implements IempleadoService{
	
	@Autowired
	RepositoryEmpleado repositoryEmpleado;
	
	
	public void crearEmpleado(Empleado empleado) {
		this.repositoryEmpleado.save(empleado);
	}
	
	
	public List<Empleado> obtenerEmpleado(){
		return this.repositoryEmpleado.findAll();
	}
	
	
	public Empleado buscarEmpleado (int id) {
		return this.repositoryEmpleado.findById(id);
	}
	
	
	@Autowired
	private IEmpleado data1;
	
	
	public List<Empleado> listar() {
		// TODO Auto-generated method stub
		return (List<Empleado>)data1.findAll();
	}

	@Override
	public Optional<Empleado> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Empleado e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

	public List<Empleado> listar1() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Optional<Empleado> listarId1() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	
	public int save1(Empleado e) {
		// TODO Auto-generated method stub
		return 0;
	};
	
	
	
	
	


}

