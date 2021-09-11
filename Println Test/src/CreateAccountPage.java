import java.awt.Checkbox;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;

/**
 * The CreateAccountPage is a class will allow the user to create a new account they can sign in with.
 * 
 * @author Zhang_Kelly
 *
 */
public class CreateAccountPage extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final int WIDTH=500;
	public final int HEIGHT=300;
	Label fNameLabel=new Label("First Name: ");
	Label lNameLabel=new Label("Last Name: ");
	Label pwdLabel=new Label("Password: ");
	Label campusLabel=new Label("Campus: ");
	TextField fName=new TextField("", 10);
	TextField lName=new TextField("",10);
	JComboBox<String> campusBox = new JComboBox<String>();
	JPasswordField pwd=new JPasswordField("",10);
	Label gender=new Label("Gender: ");
	Label age=new Label("Age: ");
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox ck1=new Checkbox("Male",false,cbg);
	Checkbox ck2=new Checkbox("Female",false,cbg);
	ButtonGroup ages=new ButtonGroup();
	JRadioButton icon1=new JRadioButton("7 and under");
	JRadioButton icon2=new JRadioButton("8 to 13");
	JRadioButton icon3=new JRadioButton("13 and older");
	JButton createA;
	JButton cancelB=new JButton("Cancel");
	LoginPage lp;
	String sAge="";
	/**
	 * This constructor will create a JFrame that contains the fields
	 * for first name, last name, password, Campus, Gender, and age for
	 * the user to fill out
	 */
	public CreateAccountPage()
	{
		setSize(WIDTH, HEIGHT);
		setTitle("Create Account");
		this.setIconImage(new ImageIcon(getClass().getResource("dogboneicon.png")).getImage());
		campusBox.addItem("Hart Elementary");
		campusBox.addItem("Puster Elementary");
		campusBox.addItem("Lovejoy Elementary");
		campusBox.addItem("Sloan Creek Intermediate");
		campusBox.addItem("Willlow Springs");
		campusBox.addItem("Lovejoy High");
		fNameLabel.setFont(new Font("Arial", Font.ITALIC, 12));
		fNameLabel.setForeground(Color.GRAY);
		lNameLabel.setFont(new Font("Arial", Font.ITALIC, 12));
		lNameLabel.setForeground(Color.GRAY);
		pwdLabel.setFont(new Font("Arial", Font.ITALIC, 12));
		pwdLabel.setForeground(Color.GRAY);
		pwd.setEchoChar('*');
		createA=new JButton("Create Account");
		createA.setToolTipText("Click here to create account");
		cancelB.setToolTipText("Click here to cancel");
		ages.add(icon1);
		ages.add(icon2);
		ages.add(icon3);
		JPanel mainPanel = new JPanel();
		add(mainPanel);
		mainPanel.setBackground(Color.CYAN);
		
		TitledBorder border = new TitledBorder("Name");
	    border.setTitleJustification(TitledBorder.CENTER);
	    border.setTitlePosition(TitledBorder.TOP);
		JPanel names=new JPanel();
		names.setBorder(border);
		names.add(fNameLabel);
		names.add(fName);
		names.add(lNameLabel);
		names.add(lName);
		
	
		mainPanel.add(names);
		mainPanel.add(pwdLabel);
		mainPanel.add(pwd);
		mainPanel.add(gender);
		mainPanel.add(ck1);
		mainPanel.add(ck2);
		mainPanel.add(age);
		mainPanel.add(icon1);
		mainPanel.add(icon2);
		mainPanel.add(icon3);
		mainPanel.add(campusLabel);
		mainPanel.add(campusBox);
		mainPanel.add(createA);
		mainPanel.add(cancelB);
		createA.addActionListener(new OptionButtonListener());
			/*public void actionPerformed(ActionEvent e) {
				Player p1=new Player(fName.getText(),lName.getText(),pwd.getPassword(),ck1.getState(),ages.getSelection(),campusBox.getSelectedItem().toString());
				System.out.println(p1);
				lp=new LoginPage();
				*/
			
		
		cancelB.addActionListener(new OptionButtonListener());
		icon1.addActionListener(new RButtonListener());
		icon2.addActionListener(new RButtonListener());
		icon3.addActionListener(new RButtonListener());
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		//this.pack();
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/**
	 * this method will listen for the cancel button to be pressed.
	 * If the button is pressed, it will inform the user it was pressed through the console
	 * If it is not pressed, a new Player object will be created using the data the user enters
	 * on the create account page.
	 * @author Zhang_Kelly
	 *
	 */
	private class OptionButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource().equals(cancelB))
				System.out.println("cancel button pressed");
			else
			{
				Player.Gender g;
				if(ck1.getState()==true)
					g=Player.Gender.MALE;
				else
					g=Player.Gender.FEMALE;
				Player p1=new Player(fName.getText(),lName.getText(),pwd.getPassword(),g,sAge,campusBox.getSelectedItem().toString());
				System.out.println(p1);
				lp=new LoginPage();
			}
				
			
		}
	}
	/**
	 * This method is used to listen for the radiobuttons.
	 * @author Zhang_Kelly
	 *
	 */
	private class RButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource().equals(icon1))
				sAge="7 and under";
			else if(e.getSource().equals(icon2))
				sAge="8 to 13";
			else 
				sAge="13 and older";
	        
		}
		
	}
	public static void main(String[] args) {
		new CreateAccountPage();
	}
}
