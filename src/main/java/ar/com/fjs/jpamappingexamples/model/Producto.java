package ar.com.fjs.jpamappingexamples.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Producto {
	@Id
	@Column(name="id_producto")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String descripcion;
	@OneToOne
	@JoinColumn(name="id_proveedor")
	private Proveedor proveedor;
	@OneToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	private double precioUnitario;
	@Column(name="unidades_stock")
	private int unidadesEnStock;
	private int unidadesPedidas;
	@Column(name="flg_discontinuo")
	private boolean discontinuo;
	
	public Producto() {}

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

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getUnidadesEnStock() {
		return unidadesEnStock;
	}

	public void setUnidadesEnStock(int unidadesEnStock) {
		this.unidadesEnStock = unidadesEnStock;
	}

	public int getUnidadesPedidas() {
		return unidadesPedidas;
	}

	public void setUnidadesPedidas(int unidadesPedidas) {
		this.unidadesPedidas = unidadesPedidas;
	}

	public boolean isDiscontinuo() {
		return discontinuo;
	}

	public void setDiscontinuo(boolean discontinuo) {
		this.discontinuo = discontinuo;
	}
	
}
