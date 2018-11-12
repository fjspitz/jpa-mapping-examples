package ar.com.fjs.jpamappingexamples.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="detalle_orden")
public class OrdenItem {
	@Id
	@Column(name="id_detalle_orden")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int item;
	@ManyToOne
	@JoinColumn(name = "id_orden")
	private Orden orden;
	@ManyToOne
	@JoinColumn(name= "id_producto")
	private Producto producto;
	private int cantidad;
	
	public OrdenItem() {}

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
