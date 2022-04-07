<% String user = request.getParameter("user"); %>
<jsp:include page="getAllParameters.jsp">
	<jsp:param name="user" value="<%=user%>" />
	<jsp:param name="sessionId" value="<%=System.currentTimeMillis()%>" />
</jsp:include>

