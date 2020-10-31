import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class AdjustmentListenerExample extends Applet implements AdjustmentListener
{
		Scrollbar sr,sb,sg;
		int x,y,z;
		
		public void init() {
		 sr=new Scrollbar(Scrollbar.HORIZONTAL,1,1,0,255); add(sr);
		 sg=new Scrollbar(1,1,1,0,255); add(sg);
		 sb=new Scrollbar(0,1,1,0,255); add(sb);
		 
		 sr.addAdjustmentListener(this);
		 sg.addAdjustmentListener(this);
		 sb.addAdjustmentListener(this);
		 }
	 
		public void adjustmentValueChanged(AdjustmentEvent ae) {
		 
			x=sr.getValue();
			y=sg.getValue();
			z=sb.getValue();
			
			repaint();			
		}
	 
		public void paint(Graphics g) {
			
			System.out.println(x+"  "+y+"  "+z);
			Color c=new Color(x,y,z);
			setBackground(c);
		}
	
	
}
