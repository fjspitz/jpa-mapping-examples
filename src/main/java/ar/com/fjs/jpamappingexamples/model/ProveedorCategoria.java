package ar.com.fjs.jpamappingexamples.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProveedorCategoria {
	@Id
	@Column(name="id_proveedor_categoria")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="id_proveedor")
	private Proveedor proveedor;
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	
	public ProveedorCategoria() {
		/**
		 * Constructor para Hibernate.
		 */
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
}
