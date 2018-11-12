package ar.com.fjs.jpamappingexamples.web;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.fjs.jpamappingexamples.model.Categoria;
import ar.com.fjs.jpamappingexamples.model.Cliente;
import ar.com.fjs.jpamappingexamples.model.Producto;
import ar.com.fjs.jpamappingexamples.model.Proveedor;
import ar.com.fjs.jpamappingexamples.service.CategoriaService;
import ar.com.fjs.jpamappingexamples.service.ClienteService;
import ar.com.fjs.jpamappingexamples.service.OrdenService;
import ar.com.fjs.jpamappingexamples.service.ProductoService;
import ar.com.fjs.jpamappingexamples.service.ProveedorService;

@Controller
public class OrdenesController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private OrdenService ordenService;
	
	@Autowired
	private ProveedorService proveedorService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/ordenes")
	public String getProveedores(Model model) {
		model.addAttribute("proveedorSelected", new Proveedor());
		model.addAttribute("categoriaSelected", new Categoria());
		model.addAttribute("productoSelected", new Producto());
		model.addAttribute("clienteSelected", new Cliente());
		
		model.addAttribute("proveedores", proveedorService.getProveedores());
		model.addAttribute("categorias", categoriaService.getCategorias());
		model.addAttribute("productos", productoService.getProductos());
		model.addAttribute("clientes", clienteService.getClientes());
		model.addAttribute("ordenes", ordenService.getOrdenes());
		
		return "ordenes";
	}

}
