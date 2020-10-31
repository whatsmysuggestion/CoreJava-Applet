import java.applet.*;
import java.awt.*;
public class NullLayoutExample extends Applet{	
Button b1,b2,b3; 
	public void init() {
		setLayout(null);
		b1=new Button("Click");
		add(b1);
		b1.setBounds(200, 200, 50, 50);		
		
		b2=new Button("Click");
		add(b2);
		b2.setBounds(550, 200, 50, 50);		
		b3=new Button("Click");
		add(b3);
		b3.setBounds(600, 200, 50, 50); 
	}	
}
