package ar.com.fjs.jpamappingexamples.web;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.fjs.jpamappingexamples.model.Proveedor;
import ar.com.fjs.jpamappingexamples.service.ProveedorService;

@Controller
public class ProveedorController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ProveedorService service;
	
	@Value("${spring.application.name}")
    String appName;
	
	@GetMapping("/proveedores")
	public String getProveedores(Model model) {
		model.addAttribute("appName", appName);
		model.addAttribute("proveedorSelected", new Proveedor());
		model.addAttribute("proveedores", service.getProveedores());
		return "listadoProveedores";
	}

}
