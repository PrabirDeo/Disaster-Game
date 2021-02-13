package survive2020;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame{
	Frame(){
	    this.setTitle("Survive 2020");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(400, 500);
	    this.setResizable(false);
	    this.setLayout(null);
	    this.setVisible(true);
	    ImageIcon img = new ImageIcon("calendar.png");
	    this.setIconImage(img.getImage());
	    this.getContentPane().setBackground(new Color(126, 200, 80));

	}
}
