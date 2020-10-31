import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ActionEventListenerExample extends Applet  implements ActionListener
{

	TextField t1,t2,t3;
	Button b1,b2;
	 
	public void init() {
		t1=new TextField(10); add(t1);
		t2=new TextField(10); add(t2);
		t3=new TextField(10); add(t3);
		t3.setEditable(false);
		
		b1=new Button("Add"); add(b1);
		b2=new Button("Clear"); add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);		
 
	}
	 
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a+b;
			t3.setText(""+c);
		}
		else
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		 
		
	}

}
