package survive2020;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    
    frame.setTitle("Survive 2020");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 500);
    frame.setResizable(false);
    frame.setLayout(null);
    frame.setVisible(true);
    ImageIcon img = new ImageIcon("calendar.png");
    frame.setIconImage(img.getImage());
    /*this.getContentPane().setBackground(new Color(126, 200, 80));*/
  }
}