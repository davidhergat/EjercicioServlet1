package beans;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {

	@Id
	@Column(name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido1")
	private String apellido1;
	
	@Column(name = "apellido2")
	private String apellido2;
	
	@Column(name = "lugar_nacimiento")
	private String lugarNacimiento;
	
	@Column(name = "fecha_nacimiento")
	private String fechaNacimiento;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "puesto")
	private String puesto;
	
	@Column(name = "cod_departamento")
	private int codigoDepartamento;
	
	public Empleado() {
		
	}

	public Empleado(int codigo, String nombre, String apellido1, String apellido2, String lugarNacimiento,
			String fechaNacimiento, String direccion, String telefono, String puesto, int codigoDepartamento) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.puesto = puesto;
		this.codigoDepartamento = codigoDepartamento;
	}

	public int getCodigoEmpleado() {
		return codigo;
	}

	public void setCodigo(int codigoEmpleado) {
		this.codigo = codigoEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(int codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	@Override
	public String toString() {
		return "Empleado [codigoEmpleado=" + codigo + ", nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", lugarNacimiento=" + lugarNacimiento + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", telefono=" + telefono + ", puesto=" + puesto
				+ ", codigoDepartamento=" + codigoDepartamento + "]";
	}
		
	
}
