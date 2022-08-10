package unah.hn.poo.InterfaceService;

import java.util.List;
import java.util.Optional;


import unah.hn.poo.model.Empleado;

public interface IempleadoService {
	public List<Empleado>listar();
	public Optional<Empleado>listarId(int id);
	public int save (Empleado e);
	public void delete(int id);

}
