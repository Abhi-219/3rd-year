<%@page import="java.util.Enumeration"%>
<%
		Enumeration parameters = request.getParameterNames();
		while(parameters.hasMoreElements()) {
			String param = (String)parameters.nextElement();
			out.println(param+" : "+request.getParameter(param)+"<br>");
		}
%>