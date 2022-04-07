<%
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));
	out.println(a + " + " + b + " = " + (a + b));
%>
