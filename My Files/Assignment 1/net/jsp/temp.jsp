<html>
	<head><title>Square table</title></head>
	<body>
		<table border="1">
			<caption>Temperature Conversion chart</caption>
			<tr><th>Celsius</th><th>Fahrenheit</th></tr>
		<%
			for(int c = 0; c <= 200; c+=20) {
				double f = (c*9)/5.0 + 32;
				out.println("<tr><td>" + c + "</td><td>" + f + "</td></tr>");
			}
		%>
		</table>
	</body>
</html>
