package unah.hn.poo.InterfaceService;

import java.util.List;
import java.util.Optional;

import unah.hn.poo.model.Categoria;

public interface ICategoriaService {
	public List<Categoria>listar();
	public Optional<Categoria>listarId();
	public int save(Categoria c);
	public void delete(int id);

}
