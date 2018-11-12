package ar.com.fjs.jpamappingexamples.web;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.fjs.jpamappingexamples.service.ProductoService;

@Controller
public class ProductoController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/productos")
	public String getProductos(Model model) {
		model.addAttribute("productos", productoService.getProductos());
		return "productos";
	}
}
