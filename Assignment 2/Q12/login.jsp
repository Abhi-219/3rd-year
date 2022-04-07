<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joins","root","Abhi@");
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		PreparedStatement ps = con.prepareStatement("select user from users where user=? and password=?");
		ps.setString(1, name);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			out.println("Login Successful");
		}
		else{
			out.println("Error in Username / Password ");
		}
	%>
</body>
</html>
