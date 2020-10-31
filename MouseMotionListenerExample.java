import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MouseMotionListenerExample extends Applet implements MouseMotionListener 
{
	int x=0,y=0; 
	public void init() {
	 addMouseMotionListener(this);
	}	 
	public void mouseDragged(MouseEvent me) {	} 	
	
	public void mouseMoved(MouseEvent me1) {
	 x=me1.getX();
	 y=me1.getY();
	 repaint();	
	 /*Graphics g=getGraphics();
	 paint(g);*/ 
	}
	public void paint(Graphics g) {
		g.drawString(x+"  "+y, x,y);
 	}

}
