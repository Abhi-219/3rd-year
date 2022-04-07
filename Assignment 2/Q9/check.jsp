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
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joins","root","Abhi@2000");
		String[] answers = new String[3];
		for(int i = 1; i <= 3; i++){
			String param = "Q" + String.valueOf(i);
			answers[i-1] = request.getParameter(param);
		}
		PreparedStatement ps = con.prepareStatement("select * from QnA");
		ResultSet rs = ps.executeQuery();
		int correctAnswers = 0;
		int i = 0;
		while(rs.next()){
			String question = rs.getString("question");
			String answer = rs.getString("answer");
			if(answer.equals(answers[i])){
				correctAnswers++;
			}
			i++;
		}
		out.println("Total number of correct answers are " + correctAnswers);
	%>
	
</body>
</html>
