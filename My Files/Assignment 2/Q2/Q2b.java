package com.package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Q2b
 */
@WebServlet("/Q2b")
public class Q2b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q2b() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Shibashis@99");
			Statement stmt = con.createStatement();
			String dname = request.getParameter("dept");
			String query = "select * from students where dept = \"" + dname + "\"";
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
