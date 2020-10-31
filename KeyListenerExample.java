import java.applet.*;
import java.awt.event.*;
public class KeyListenerExample extends Applet implements KeyListener{
 char ch;
	public void init() {
	addKeyListener(this);
	}
	public void keyPressed(KeyEvent e) {
//	setBackground(Color.red);
	}
	public void keyReleased(KeyEvent e) {	
		/*setBackground(Color.cyan);*/
	}
	public void keyTyped(KeyEvent e) {
		ch=e.getKeyChar();
		if(ch=='e'||ch=='E')
			System.exit(0);
	}
}
