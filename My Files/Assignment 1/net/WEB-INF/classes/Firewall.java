import java.io.*;
import javax.servlet.*;
public class Firewall implements Filter {
  private FilterConfig config = null;
  public void init(FilterConfig config) throws ServletException {
    this.config = config;
  }
  public void doFilter(ServletRequest request, ServletResponse response,
                     FilterChain chain) throws IOException, ServletException {
						 System.out.println(request.getRemoteAddr());
   	if(request.getRemoteAddr().equals("172.18.0.141"))
    chain.doFilter(request, response);

  }
  public void destroy() {
    config = null;
  }
}