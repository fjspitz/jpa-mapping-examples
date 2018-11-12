package ar.com.fjs.jpamappingexamples.web;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.fjs.jpamappingexamples.service.EmpleadoService;

@Controller
public class EmpleadoController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/empleados")
	public String getEmpleados(Model model) {
		model.addAttribute("empleados", empleadoService.getEmpleados());
		return "empleados";
	}
}
