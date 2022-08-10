package unah.hn.poo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.hn.poo.model.Empleado;

public interface RepositoryEmpleado extends JpaRepository<Empleado,Integer>{
	public Empleado findById(int id);
}
