package beans;


import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "departamento")
public class Departamento implements Serializable {

	@Id
	@Column(name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "cod_responsable")
	private int codigoResponsable;
	
	public Departamento() {
		super();
	}

	public Departamento(int codigoDepartamento, String nombre, int codigoResponsable) {
		super();
		this.codigo = codigoDepartamento;
		this.nombre = nombre;
		this.codigoResponsable = codigoResponsable;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigoDepartamento) {
		this.codigo = codigoDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoResponsable() {
		return codigoResponsable;
	}

	public void setCodigoResponsable(int codigoResponsable) {
		this.codigoResponsable = codigoResponsable;
	}

	@Override
	public String toString() {
		return "Departamento [codigoDepartamento=" + codigo + ", nombre=" + nombre + ", codigoResponsable="
				+ codigoResponsable + "]";
	}
	
	
	
}
