import java.applet.*;
import java.awt.*;
public class BorderLayoutExample extends Applet {
	Button b1,b2,b3,b4,b5;	 
	public void init() { 
		setLayout(new BorderLayout());		
		b1=new Button("1"); add(b1,BorderLayout.EAST);
		b2=new Button("2"); add(b2,BorderLayout.WEST);
		b3=new Button("3"); add(b3,BorderLayout.NORTH);
		b4=new Button("4"); add(b4,BorderLayout.SOUTH);
		b5=new Button("5"); add(b5,BorderLayout.CENTER);
	}
}
