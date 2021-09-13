/*
 * 
 * 
 * Created By Tyree King 
 * GUI ; First JavaFx program 
 * 
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create panel
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		// title of the panel
		frame.setTitle("ATM");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// add panel
		frame.add(panel);
		panel.setLayout(null);

		JLabel accountlabel = new JLabel("Desired Amount of Cash:");
		accountlabel.setBounds(10, 20, 80, 25);

		panel.add(accountlabel);

		JTextField atmText = new JTextField(20);
		atmText.setBounds(100, 20, 165, 25);
		panel.add(atmText);

		JLabel cashLabel = new JLabel("Account Number:");
		cashLabel.setBounds(10, 50, 80, 25);
		panel.add(cashLabel);
		// account number field , security reasons so people don't see your account
		// number
		JPasswordField accountText = new JPasswordField();
		accountText.setBounds(100, 50, 165, 25);	
		panel.add(accountText);
		

		// create button
		JButton button = new JButton("Get Cash");
		button.setBounds(190, 80, 80, 25);
		panel.add(button);

		frame.setVisible(true);
	}

}
