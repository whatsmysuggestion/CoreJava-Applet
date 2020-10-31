import java.applet.*;
import java.awt.*;
import java.awt.event.*;
 
public class MouseListenerExample extends Applet implements MouseListener {
 
	public void init() {
	 addMouseListener(this);		
	}	 
	public void mouseClicked(MouseEvent arg0) { 
		System.exit(0);
	}	 
	
	public void mouseEntered(MouseEvent arg0) {	
		setBackground(Color.RED);
	}	 
	public void mouseExited(MouseEvent arg0) { 
		
		setBackground(Color.green);
	}
	 
	public void mousePressed(MouseEvent arg0) {
		
		setBackground(Color.yellow);
	}
	  
	public void mouseReleased(MouseEvent arg0) {
		
		setBackground(Color.cyan);
	}	

}
