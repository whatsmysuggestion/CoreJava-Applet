import java.awt.*;
import java.awt.event.*;
 
public class FrameExample extends Frame implements ActionListener {
	
	Button b1;
	public FrameExample() {
	 setTitle("First Frame");
	 setSize(300, 300);
	 setVisible(true);
	setLayout(new FlowLayout());	
	b1=new Button("Click Me");
	add(b1);
	b1.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		 System.exit(0);
		
	}
	
	public static void main(String[] args) {
		 
		FrameExample fe=new FrameExample();
	}

}
