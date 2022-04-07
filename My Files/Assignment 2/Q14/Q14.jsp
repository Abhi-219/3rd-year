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
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String roll = request.getParameter("rollNo");
		String semester = request.getParameter("semester");
		String subject = request.getParameter("subject");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","Shibashis@99");
		PreparedStatement ps = con.prepareStatement("select marks from marks where roll = ? and semester = ? and subject = ?");
		ps.setString(1, roll);
		ps.setString(2, semester);
		ps.setString(3, subject);
		ResultSet rs = ps.executeQuery();
		rs.next();
		out.println("The marks obatained is : " + rs.getString(1));
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	%>
</body>
</html>