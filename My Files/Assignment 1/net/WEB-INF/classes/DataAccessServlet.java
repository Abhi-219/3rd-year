import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Enumeration;
public class DataAccessServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String param;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Enumeration parameters = request.getParameterNames();
		while(parameters.hasMoreElements()) {
			param = (String)parameters.nextElement();
			out.println(param+" : "+request.getParameter(param)+"<br>");
		}
	}
}
