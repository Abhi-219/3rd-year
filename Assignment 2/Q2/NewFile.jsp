<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is test for JDBC</h1>
	
	<%@ page import="java.sql.* , java.util.*" %>
	
	<% 
	String url="jdbc:mysql://localhost:3306/joins";
	String usrName = "root";
	String password = "Abhi_pwd";
	String name = request.getParameter("dept");
	
	String query = "select * from students where dept = '"+ name+"'"  ;
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection(url, usrName, password);
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery(query);
	
	int i=0;
	rs.next();
	%>
	
	<% 
	while ( rs.next() ) {
		String str = rs.getString(1) + "  " + rs.getString(2)+"  " + rs.getString(3) ;
		out.println(str);
	%>	
		<br>
		
	<% 
	}
	
	
	rs.close();
	conn.close();
	
	%>
	
</body>
</html>
