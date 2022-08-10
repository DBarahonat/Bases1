package unah.hn.poo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import unah.hn.poo.InterfaceService.IempleadoService;
import unah.hn.poo.Service.EmpleadoService;
import unah.hn.poo.Service.ServiceCategoria;
import unah.hn.poo.model.Categoria;
import unah.hn.poo.model.Empleado;

@Controller
@RequestMapping
public class Controlador {
	@Autowired
	ServiceCategoria serviceCategoria;
	EmpleadoService serviceEmpleado;
	//ServiceEmpleado serviceEmpleado;
	//ServiceCliente serviceCliente;
	//ServiceSucursal serviceSucursal;

	
	//============================================
	//
	//============================================
	
	@GetMapping("empleado/listarEmpleado")
	public String listarE(Model model) {
		List<Empleado> empleados=serviceEmpleado.listar();
		model.addAttribute("empleados", empleados);
		return "index2";
	}
	

	//==================
	//  Categoria
	//=================
	@GetMapping("/")
	public String registrarCategoria() {
		return "RegistrarCategoria";
	}

	@RequestMapping(value="/Categoria/crearCategoria",method= RequestMethod.POST)

	public String crearCategoria(@RequestParam(name="idCategoria") int idCategoria,
			          @RequestParam(name="Nombre") String Nombre,
			          @RequestParam(name="Estado") int Estado ) {
		
		Categoria categoria =new Categoria(idCategoria, Nombre, Estado);
		this.serviceCategoria.crearCategoria(categoria);
		return "RegistrarCategoria";
	}

	@GetMapping("/Categoria/listar")
	public String listar(Model model){
		List<Categoria> categorias = serviceCategoria.listar();
		model.addAttribute("categorias", categorias);
		return "Listar";
	}

/*
	@RequestMapping (value = "/Venta/crearVenta",method=RequestMethod.GET)
	public Venta crearVenta(@RequestParam(name = "idSucursal") int idSucursal,
			                      @RequestParam(name = "idCliente") int idCliente,
			                      @RequestParam(name = "idEmpleado") int idEmpleado,
			                      @RequestParam(name = "idVenta") String idVenta,
			                      @RequestParam(name = "nombreEmpresa") String nombreEmpresa,
			                      @RequestParam(name = "telefono") String telefono,
			                      @RequestParam(name = "numeroIdentidad") String numeroIdentidad,
			                      @RequestParam(name = "nombreCliente") String nombreCliente,
			                      @RequestParam(name = "domicilio") String domicilio,
			                      @RequestParam(name = "montoPago") double montoPago,
			                      @RequestParam(name = " montoCambio") double  montoCambio,
			                      @RequestParam(name = "gravado15") double gravado15,
			                      @RequestParam(name = "gravado18") double gravado18,
			                      @RequestParam(name = "montoTotal") double montoTotal,
			                      @RequestParam(name = "fechaRevision") @DateTimeFormat(iso = ISO.DATE)  LocalDate fechaRegistro

			                      ) {


		Empleado empleado= this.serviceEmpleado.buscarEmpleado(idEmpleado);
		Cliente cliente = this.serviceCliente.buscarCLiente(idCliente);

		Sucursal sucursal= this.serviceSucursal.buscarSucursal(idSucursal);

		Venta tmpVenta= new Venta(idSucursal,idCliente,idEmpleado,idVenta,nombreEmpresa,telefono,numeroIdentidad
				,nombreCliente, domicilio, montoPago, montoCambio, gravado15, gravado18, montoTotal, fechaRegistro

				);
		this.serviceVenta.crearVenta(tmpVenta);


		return tmpVenta;
	}*/
}
