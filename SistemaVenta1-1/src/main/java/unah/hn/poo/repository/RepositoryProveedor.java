package unah.hn.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import unah.hn.poo.model.Proveedor;

public interface RepositoryProveedor extends JpaRepository<Proveedor, Integer>{
	public Proveedor findById(int id);
}
