package ar.com.fjs.jpamappingexamples.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orden {
	@Id
	@Column(name="id_orden")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name="id_empleado")
	private Empleado empleado;
	@Column(name="fecha_generada")
	private Date fechaGenerada;
	@Column(name="fecha_entregada")
	private Date fechaEntregada;
	
	public Orden() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Date getFechaGenerada() {
		return fechaGenerada;
	}

	public void setFechaGenerada(Date fechaGenerada) {
		this.fechaGenerada = fechaGenerada;
	}

	public Date getFechaEntregada() {
		return fechaEntregada;
	}

	public void setFechaEntregada(Date fechaEntregada) {
		this.fechaEntregada = fechaEntregada;
	}

}
