import java.applet.*;
import java.awt.*;
public class GraphicsExample extends Applet

{	public void paint(Graphics g)
	{
	 /*int a=500;
	g.drawString(""+a,100, 100); 	*///*///x,y
	
/*  g.drawRect(0, 0, 100, 100);//left top width height
	 g.drawOval(0, 200, 100, 100); */
	
	/* 	 g.setColor(Color.RED);
		g.fillOval(200, 200, 100, 100);
		g.setColor(Color.BLUE);
		g.fillRect(200, 0, 100, 100); */

	  setBackground(Color.green);
	
	Color c=new Color(150,150,150);//rgb
		g.setColor(c);
	g.drawRoundRect(300, 0, 100, 100,45,45);//left top width height xbend ybend	
	g.fillRoundRect(300, 200, 100, 100,60,60);   
	 
		
	}
}
