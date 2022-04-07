package tag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import java.io.IOException;
public class HelloTag extends SimpleTagSupport {
	String name = "World!" ;
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("Hello " + name);
	}
	public void setName(String name) {
		this.name = name;
	}
}