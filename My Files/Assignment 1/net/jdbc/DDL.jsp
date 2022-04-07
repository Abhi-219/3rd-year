<!--DDL.jsp-->
<%@page import="java.sql.*"%>
<%
  try {
    new com.mysql.jdbc.Driver();
    String url = "jdbc:mysql://localhost:3306/test?user=root&password=nbuser";
    Connection conn = DriverManager.getConnection(url);
    Statement stmt = conn.createStatement();

    String create = "CREATE TABLE accounts (		    	" +
		    "  accNum		integer	 primary key,	" +
		    "  holderName	varchar(20),   		" +
		    "  balance		integer			" +
		    ")";
    stmt.executeUpdate(create);

    String insert = "INSERT INTO accounts VALUES(1,'Uttam K. Roy', 10000)";
    stmt.executeUpdate(insert);
    insert = "INSERT INTO accounts VALUES(2,'Bibhas Ch. Dhara', 20000)";
    stmt.executeUpdate(insert);
    stmt.close();
    conn.close();
    out.println("Created table accounts");
  } catch (Exception e) {
    out.println(e);
  }
%>