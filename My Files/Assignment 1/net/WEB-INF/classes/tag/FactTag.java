package tag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;
public class FactTag extends SimpleTagSupport {
	int no;
	public void doTag() throws JspException, IOException  {
		int prod = 1;
		for(int j = 1;j <= no; j++)
			prod *= j;
		JspWriter out = getJspContext().getOut();
		out.println(prod);
	}
	public void setNo(int no) {
		this.no = no;
	}
}