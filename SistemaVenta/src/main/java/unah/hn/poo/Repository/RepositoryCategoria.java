package unah.hn.poo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.hn.poo.model.Categoria;

public interface RepositoryCategoria extends JpaRepository<Categoria,Integer>{
	public Categoria findById(int id);
}
