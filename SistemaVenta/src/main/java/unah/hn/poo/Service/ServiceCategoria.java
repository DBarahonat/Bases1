package unah.hn.poo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.poo.InterfaceService.ICategoriaService;
import unah.hn.poo.Interfaces.ICategoria;
import unah.hn.poo.Repository.RepositoryCategoria;
import unah.hn.poo.model.Categoria;

@Service
public class ServiceCategoria implements ICategoriaService{

	

	///********método
	@Autowired
	RepositoryCategoria repositoryCategoria;
	
	public void crearCategoria(Categoria categoria) {
		this.repositoryCategoria.save(categoria);
	}
	
	public List<Categoria> obtenerCategorias(){
		return this.repositoryCategoria.findAll();
	}
	
	public Categoria buscarCategoria(int id) {
		return this.repositoryCategoria.findById(id);
	}

	

	@Autowired
	private ICategoria data;


	public List<Categoria> listar(){
		return (List<Categoria>)data.findAll();
		
	}

	public Optional<Categoria>listarId(){
		return null;
		
	};
	public int save(Categoria c){
		return 0;
	};
	
	public void delete(int id){
		
		
	}

	
	public List<Categoria> listar1() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Optional<Categoria> listarId1() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	
	public int save1(Categoria c) {
		// TODO Auto-generated method stub
		return 0;
	};

}