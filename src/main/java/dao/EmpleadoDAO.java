package dao;

import java.util.List;

import org.hibernate.Session;
import utils.*;
import beans.*;


public class EmpleadoDAO {

	public static List<Empleado> getEmpleados(){
		return getEmpleados(HibernateUtil.retrieveSession());
	}
	
	public static List<Empleado> getEmpleados(Session s){
		String hQuery = "from Empleado";
		List<Empleado> listaEmpleado = s.createQuery(hQuery, Empleado.class).list();
		return listaEmpleado;
	}
		
}
