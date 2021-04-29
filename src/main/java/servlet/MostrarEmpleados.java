package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import beans.Empleado;
import dao.EmpleadoDAO;
import utils.HibernateUtil;

/**
 * Servlet implementation class MostrarEmpleados
 */
@WebServlet("/MostrarEmpleados")
public class MostrarEmpleados extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger(MostrarDepartamentos.class);

	Session session;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarEmpleados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		session = HibernateUtil.getSessionFactory().openSession();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Empleado> listaDepartamento = EmpleadoDAO.getEmpleados(session);
		
		PrintWriter out = response.getWriter();
		printResponse(out, listaDepartamento);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private PrintWriter printResponse(PrintWriter out, List<Empleado> lista) {
		
		PrintWriter res = out;
		
		res.println("<html>");
		res.println("<title>Lista de partamento</title>");
		res.println("<body>");
		res.println("<h1> Lista departamentos </h1>");
		for(int i=0; i<lista.size(); i++) {
			res.println("<tr>");
			res.println("<td>"+ lista.get(i).getCodigoEmpleado() +"</td>");
			res.println("<td>"+ lista.get(i).getNombre() +"</td>");
			res.println("<td>"+ lista.get(i).getApellido1() +"</td>");
			res.println("<td>"+ lista.get(i).getApellido2() +"</td>");
			res.println("<td>"+ lista.get(i).getDireccion() +"</td>");
			res.println("<td>"+ lista.get(i).getFechaNacimiento() +"</td>");
			res.println("<td>"+ lista.get(i).getLugarNacimiento() +"</td>");
			res.println("<td>"+ lista.get(i).getTelefono() +"</td>");
			res.println("<td>"+ lista.get(i).getPuesto() +"</td>");
			res.println("</tr>");
			res.println("</br>");
		}
		res.println("</body>");
		res.println("</html>");
		
		return res;
	}

}
