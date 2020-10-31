import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ItemListenerExample extends Applet implements ItemListener
{	Choice ch; 
	public void init() {
		ch=new Choice();
		add(ch);
		ch.addItemListener(this);
		ch.add("A");
		ch.add("B");
		ch.add("C");
		ch.add("D");
		 
		
	}	 
	public void itemStateChanged(ItemEvent ie) 
	{
	// repaint();
		Graphics g=getGraphics();
	paint(g);	
	}	
	
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawString(ch.getSelectedItem(), 100, 100);
 	}
}
