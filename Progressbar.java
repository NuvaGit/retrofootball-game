import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Progressbar {
// progress bar
	// visual aid to show the user whats processing
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	JLabel label = new JLabel();

	Progressbar() {
      
		bar.setValue(0);
		bar.setBounds(50, 0, 450, 50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		label.setText("loading");
		label.setBounds(0,0,50,50);
		label.setBackground(Color.cyan);
		
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,500);
      frame.setLayout(null); 
      frame.setVisible(true);
      frame.add(bar);
      frame.add(label);
    fill();
	
	
	}
public void fill() {
	int count = 0;
	while(count <=100) {
		bar.setValue(count);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count +=1;
	}
	bar.setString("FINSIHED");
}

}
