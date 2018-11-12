package ar.com.fjs.jpamappingexamples.web;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.com.fjs.jpamappingexamples.model.TipoCliente;
import ar.com.fjs.jpamappingexamples.service.ClienteService;
import ar.com.fjs.jpamappingexamples.service.TipoClienteService;

@Controller
public class ClienteController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private TipoClienteService tipoClienteService;
	
	@GetMapping(value="/")
    public String homepage(){
        return "clientes";
    }
	
	@GetMapping("/clientes")
	public String getClientes(@RequestParam(value="tipoClienteSelected", required=false) Integer tipoClienteSelected, Model model) {
		model.addAttribute("tipoClienteSelected", 0);
		model.addAttribute("tipoClientes", tipoClienteService.getTipoCliente());
		
		if (tipoClienteSelected != null) {
			System.out.println("Pasa por el filtro...");
			TipoCliente tipoCliente = tipoClienteService.findTipoClienteById(tipoClienteSelected);
			model.addAttribute("clientes", clienteService.getClientes(tipoCliente));
		} else {
			System.out.println("Trae todo...");
			model.addAttribute("clientes", clienteService.getClientes());
		}
		return "clientes";
	}
	
	@GetMapping("/clientes/buscar")
	public String getClientesBuscar(@RequestParam(required = false, defaultValue = "") Integer tipoClienteSelected, Model model) {
		model.addAttribute("tipoClienteSelected", tipoClienteSelected);
		model.addAttribute("tipoClientes", tipoClienteService.getTipoCliente());
		
		if (tipoClienteSelected != null) {
			System.out.println("Pasa por el filtro...");
			TipoCliente tipoCliente = tipoClienteService.findTipoClienteById(tipoClienteSelected);
			model.addAttribute("clientes", clienteService.getClientes(tipoCliente));
		} else {
			System.out.println("Trae todo...");
			model.addAttribute("clientes", clienteService.getClientes());
		}
		return "clientes";
	}	
}
