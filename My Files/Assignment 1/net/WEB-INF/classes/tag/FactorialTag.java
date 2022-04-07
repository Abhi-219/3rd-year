package tag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class FactorialTag extends SimpleTagSupport {
	int start, end;
	public void doTag() throws JspException, IOException  {
		for(int i=start;i<=end;i++) {
			int prod = 1;
			for(int j=1;j<=i;j++)
				prod*=j;
			getJspContext().setAttribute("count", String.valueOf(i) );
			getJspContext().setAttribute("fact", String.valueOf(prod) );
			getJspBody().invoke(null);
		}
	}
	public void setStart(int start) {
		this.start = start;
	}
	public void setEnd(int end) {
		this.end = end;
	}
}