import java.applet.*;
import java.awt.*;
public class GridLayoutExample extends Applet {
	Button b1,b2,b3,b4,b5;
	 
	public void init() {
		//setLayout(new GridLayout());
		setLayout(new GridLayout(2,3));
		b1=new Button("1"); add(b1);
		b2=new Button("2"); add(b2);
		b3=new Button("3"); add(b3);
		b4=new Button("4"); add(b4);
		b5=new Button("5"); add(b5);		
 
	}

}
