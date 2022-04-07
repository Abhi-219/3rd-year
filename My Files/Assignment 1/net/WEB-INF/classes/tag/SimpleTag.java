package tag;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
public class SimpleTag extends TagSupport {
	public int doStartTag() {
		JspWriter out = pageContext.getOut();
		try {
			out.println("Hello World!");
		}catch(Exception e) {e.printStackTrace();}
		return SKIP_BODY;
	}
}