package com.package1;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Q2
 */
@WebServlet("/Q2")
public class Q2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q2() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Shibashis@99");
			Statement stmt = con.createStatement();
			String inputText = request.getParameter("text");
			String query = "select * from students where name REGEXP \"" + inputText + "\";";
			stmt.executeQuery(query);
			ResultSet rs = stmt.getResultSet();
			response.setContentType("text/html");
			ResultSetMetaData md = rs.getMetaData();
			PrintWriter out = response.getWriter();
			out.println("<html><body>"); 
			out.println("<table border=\"1\"><tr>"); 
			for (int i = 1; i <= md.getColumnCount(); i++) { 
			  out.print("<th>" + md.getColumnName(i) + "</th>"); 
			} 
			out.println("</tr>");
			while (rs.next()) { 
			  out.println("<tr>");
			  for (int i = 1; i <= md.getColumnCount(); i++) { 
			     out.print("<td>" + rs.getString(i) + "</td>"); 
			  } 
			  out.println("</tr>"); 
			} 
			out.println("</table>");
			out.println("</body></html>");
			rs.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
