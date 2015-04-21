package mvc.supereasyexample;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View extends JFrame {
	
	JButton btnGetDate;
	JLabel lblDate;
	public View() {
	   setTitle("MVC Demo");
       setSize(300, 300);
       
	   setLayout(new FlowLayout());
       btnGetDate = new JButton("Today's Date");
       getContentPane().add(btnGetDate);
       lblDate = new JLabel();
       getContentPane().add(lblDate);

       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

	public void setCurrentDate(String currentDate) {
		lblDate.setText(currentDate);
	}
	
	public void setButtonListeners(Controller listener) {
		btnGetDate.addActionListener(listener);
	}
}