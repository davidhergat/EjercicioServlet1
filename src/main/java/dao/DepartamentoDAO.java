package dao;

import java.util.List;

import org.hibernate.Session;
import utils.*;
import beans.*;


public class DepartamentoDAO {

	public static List<Departamento> getDepartamentos(){
		return getDepartamentos(HibernateUtil.retrieveSession());
	}
	
	public static List<Departamento> getDepartamentos(Session s){
		String hQuery = "from Departamento";
		List<Departamento> listaDepartamento = s.createQuery(hQuery, Departamento.class).list();
		return listaDepartamento;
	}
		
}
