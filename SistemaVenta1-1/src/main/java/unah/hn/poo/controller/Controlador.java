package unah.hn.poo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import unah.hn.poo.model.Empleado;
import unah.hn.poo.model.Proveedor;
import unah.hn.poo.service.ServiceEmpleado;
import unah.hn.poo.service.ServiceProveedor;

@Controller
public class Controlador {
	@Autowired
	ServiceEmpleado serviceEmpleado;
	ServiceProveedor serviceProveedor;
	
	
	
	@GetMapping("/Empleado/Registrar")
	public String registrarEmpleado() {
		return "registrarEmpleado";
	}
	
	
/*
	@GetMapping("/mecanico/detalle/{id}")
	public String registrarMecanico(@PathVariable("id") int id,
			                         Model model) {
		Mecanico mecanico = this.serviceMecanico.buscarMecanico(id);
		model.addAttribute("mecanico", mecanico);
		return "detalleMecanico";
	}
	*/
	@RequestMapping(value ="/mecanico/crearMecanico",method=RequestMethod.POST)
	public String crearEmpleado(@RequestParam(name = "id") int idMecanico,
		                          @RequestParam(name = "nombre1") String nombre1,
		                          @RequestParam(name = "nombre2") String nombre2,
		                          @RequestParam(name = "apellido1") String apellido1,
		                          @RequestParam(name = "apellido2") String apellido2,
		                          @RequestParam(name = "usuario") String correo,
		                          @RequestParam(name = "contrasenia") String clave,
		                          @RequestParam(name = "sueldo") int sueldo,
		                          @RequestParam(name = "telefono") String telefono,
		                          @RequestParam(name = "sexo") String sexo) {
		Empleado empleado = new Empleado( idMecanico, nombre1,nombre2, apellido1, apellido2, correo, clave, sueldo, telefono, sexo);
		this.serviceEmpleado.crearEmpleado(empleado);
		
		return "registrarEmpleado";
		
	}
	
	
	
	
	
	
	@RequestMapping(value ="/Empleado/listaEmpleado",method=RequestMethod.GET)
	public String listadoMecanico(Model model) {
		List<Empleado> empleado = this.serviceEmpleado.obtenerTodosEmpleado();
		model.addAttribute("empleados", empleado);
		
		return "listadoEmpleados";
	}
	
	
	//========================================
	//
	//======================================
	
	@GetMapping("/proveedor/Registrar")
	public String registrarProveedor() {
		return "registrarProveedor";
	}
	 
	
	
	@RequestMapping(value ="/proveedor/crearProveedor",method=RequestMethod.POST)
	public String crearProveedor(@RequestParam(name = "id") int IdProveedor,
		                          @RequestParam(name = "nombre1") String nombre1,
		                          @RequestParam(name = "nombre2") String nombre2,
		                          @RequestParam(name = "apellido1") String apellido1,
		                          @RequestParam(name = "apellido2") String apellido2,
		                          @RequestParam(name = "correo") String correo,
		                          @RequestParam(name = "telefono") String telefono,
		                          @RequestParam(name = "sexo") String sexo) {
		Proveedor proveedor = new Proveedor(IdProveedor, nombre1, nombre2, apellido1, apellido2, correo, telefono, sexo);
		this.serviceProveedor.crearProveedor(proveedor);
		return "registrarProveedor";
		
	}
	
	
	/*
	
		Empleado empleado = new Empleado( idMecanico, nombre1,nombre2, apellido1, apellido2, correo, clave, sueldo, telefono, sexo);
		this.serviceEmpleado.crearEmpleado(empleado);
		
		return "registrarEmpleado";
		
	}
	 * */
	
	

}
