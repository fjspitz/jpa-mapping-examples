package ar.com.fjs.jpamappingexamples.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Empleado {
	@Id
	@Column(name="id_empleado")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombre;
	@ManyToOne
	@JoinColumn(name="id_jefe")
    private Empleado jefe;
    @OneToMany(mappedBy="jefe")
    private List<Empleado> jefes;
    private String puesto;
	
	public Empleado() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Empleado getJefe() {
		return jefe;
	}

	public void setJefe(Empleado jefe) {
		this.jefe = jefe;
	}

	public List<Empleado> getJefes() {
		return jefes;
	}

	public void setJefes(List<Empleado> jefes) {
		this.jefes = jefes;
	}
}
