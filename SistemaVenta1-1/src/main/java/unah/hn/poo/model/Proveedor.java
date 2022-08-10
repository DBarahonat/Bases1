package unah.hn.poo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proveedor")
public class Proveedor {
	@Id
	private int IdProveedor;
	private String nombre1;
	private String nombre2;
	private String apellido1;
	private String apellido2;
	private String correo;
	private String telefono;
	private String sexo;
	
	
	public Proveedor() {
	}
	
	public Proveedor(int idProveedor, String nombre1, String nombre2, String apellido1, String apellido2, String correo,
			String telefono, String sexo) {
		super();
		IdProveedor = idProveedor;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.correo = correo;
		this.telefono = telefono;
		this.sexo = sexo;
	}
	public int getIdProveedor() {
		return IdProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		IdProveedor = idProveedor;
	}
	public String getNombre1() {
		return nombre1;
	}
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	public String getNombre2() {
		return nombre2;
	}
	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	

}
