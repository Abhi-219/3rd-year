/*
<applet code="Message" width=150 height=50>
	<param name="message" value="Hello World!"
</applet>
 */

public class Message extends java.applet.Applet {
	String msg;
	public void init() {
		msg = getParameter("message");
	}

    public void paint(java.awt.Graphics g) {
        g.drawString(msg, 20, 20);
    }
}