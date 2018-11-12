package ar.com.fjs.jpamappingexamples.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoCliente {
	@Id
	@Column(name="id_tipo_cliente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String descripcion;
	
	public TipoCliente() {}

	public TipoCliente(int tipoCliente) {
		this.id = tipoCliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
