<%@page isThreadSafe="false" %>
<html>
	<head><title>Demo JSP page</title></head>
	<body>
	
<%!
	int n = 1;
	Object o = new Object();
%>
<%
synchronized(o) {
	for (int i = 0; i < 5; i++) {
  		out.println("Next integer: " + n++ + "<br>");  
  		Thread.sleep(500);
	}
}
%>





	</body>
</html>
