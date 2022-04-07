import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.text.SimpleDateFormat;  
public class CookieDemo extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws IOException, ServletException  {
    PrintWriter out = response.getWriter();
    Cookie[] cookies = request.getCookies();
    boolean found = false;
    if(cookies != null)
      for(int i=0;i<cookies.length;i++)
        if(cookies[i].getName().equals("session_started")) {
          found = true;
          out.println("You started this session on : " );
          out.println(cookies[i].getValue());
        }
        if(!found) {
		  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
          response.addCookie(new Cookie("session_started", formatter.format(new java.util.Date())));
          out.println("Welcome to out site...");
        }
  }
}
