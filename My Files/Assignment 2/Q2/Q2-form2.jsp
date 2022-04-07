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
	<h1>Select a department</h1>
	<form action = "Q2b" method = "post">
		<select name="dept">
		<%
			Class.forName("com.mysql.jdbc.Driver");
		 	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Shibashis@99");
			Statement stmt = con.createStatement();
			String query = "select dname from dept";
			stmt.executeQuery(query);
			ResultSet rs = stmt.getResultSet();
			while(rs.next()){
				out.println("<option>" + rs.getString(1) + "</option>");
			}
		%>
		</select>
		<br><br>
		<button type = "submit">submit</button>
	</form>
</body>
</html>