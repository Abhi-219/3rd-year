<%@ taglib prefix="ukr" uri="/taglib/tags.tld" %>
<ukr:hello name="Tom"/>

<br>
<ukr:hello/>


<br>
<%!String name="Tom"; %>
<ukr:hello name="<%=name%>"/>
<br>
<ukr:fact no="5" />




<br>

<%
for(int i = 3; i <= 7; i++) {
%>
<%=i%>!=<ukr:fact no="<%=i%>" /><br>
<%
}
%>

<br>

<ukr:FactTable start="3" end="7">
	${count}! = ${fact}<br>
</ukr:FactTable>

