import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainPage extends JFrame{
	public final int WIDTH=500;
	public final int HEIGHT=300;
	JButton createAccountB, logInB;
	public MainPage()
	{
		setSize(WIDTH, HEIGHT);
		setTitle("Game");
		
		JPanel mainPanel = new JPanel();
		this.add(mainPanel);
		
		mainPanel.setBackground(Color.CYAN);
		
		JLabel title=new JLabel("Create Account or Log In here: ");
		mainPanel.add(title);
		
		//instantiate the buttons
		createAccountB=new JButton("Create Account");
		createAccountB.setToolTipText("Click here to create new account");
		logInB=new JButton("Log In");
		logInB.setToolTipText("Click here to login");
		OptionButtonListener list=new OptionButtonListener();
		createAccountB.addActionListener(list);
		logInB.addActionListener(list);
		
		mainPanel.add(createAccountB);
		mainPanel.add(logInB);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		
		new MainPage();
		
	}
	private class OptionButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			CreateAccountPage c1;
			LoginPage l1;
			if(e.getSource()==createAccountB)
				c1=new CreateAccountPage();
			if(e.getSource()==logInB)
				l1=new LoginPage();
			
		}
	}
	
}
