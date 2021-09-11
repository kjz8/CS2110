import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class LoginPage extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final int WIDTH=500;
	public final int HEIGHT=300;
	
	public LoginPage()
	{
		
		setSize(WIDTH, HEIGHT);
		setTitle("Login Page");
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JPanel mainPanel = new JPanel();
		Border b=BorderFactory.createLineBorder(Color.RED);
		mainPanel.setBorder(b);
		mainPanel.setLayout(new GridBagLayout());
		mainPanel.setPreferredSize(new Dimension(400, 250));
		mainPanel.setBackground(Color.CYAN);
		
		Label nameL=new Label("Login ID: ");
		Label pwdL=new Label("Password: ");
		nameL.setFont(new Font("Arial", Font.ITALIC, 12));
		pwdL.setFont(new Font("Arial", Font.ITALIC, 12));
		TextField name=new TextField("",10);
		TextField pwd=new TextField("",10);
		JButton loginB=new JButton("Submit");
		JButton createAccB=new JButton("Create New Account");
		
		addComp(mainPanel,nameL,0,0,1,1,GridBagConstraints.LINE_START,GridBagConstraints.NONE);
		addComp(mainPanel,name,1,0,1,1,GridBagConstraints.LINE_END,GridBagConstraints.NONE);
		addComp(mainPanel,pwdL,0,1,1,1,GridBagConstraints.LINE_START,GridBagConstraints.NONE);
		addComp(mainPanel,pwd,1,1,1,1,GridBagConstraints.LINE_END,GridBagConstraints.NONE);
		addComp(mainPanel,loginB,0,2,1,1,GridBagConstraints.LINE_END,GridBagConstraints.NONE);
		addComp(mainPanel,createAccB,1,2,1,1,GridBagConstraints.LINE_END,GridBagConstraints.NONE);
		contentPane.add(mainPanel);
		
		
		loginB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Login button pressesd");
			}
			});
		createAccB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				CreateAccountPage c=new CreateAccountPage();
			}
		});
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	private void addComp(JPanel thePanel,Component comp,int colP,int rowP,int width, int height, int place, int stretch)
	{
		GridBagConstraints gc=new GridBagConstraints();
		gc.gridx=colP;
		gc.gridy=rowP;
		gc.gridwidth=width;
		gc.gridheight=height;
		gc.insets=new Insets(2,2,2,2);
		gc.anchor=place;
		gc.fill=stretch;
		thePanel.add(comp, gc);
	}
	public static void main(String[] args) {
		new LoginPage();
	}
}
