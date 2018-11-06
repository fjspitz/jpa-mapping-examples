package ar.com.fjs.jpamappingexamples.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orden {
	@Id
	private int id;
	private String cliente;
	
	public Orden() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
}
