import java.applet.*;
import java.awt.event.*;
public class MouseAdapter extends Applet{

	public void init() {
 
		addKeyListener(new KeyAdapter() {			
		 
			public void keyTyped(KeyEvent arg0) {
				if(arg0.getKeyChar()=='e'||arg0.getKeyChar()=='E')
					System.exit(0);
		 
			}	
			 
		 
			
		});				
		 
	}
	
}
