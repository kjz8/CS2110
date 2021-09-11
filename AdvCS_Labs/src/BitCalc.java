import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BitCalc extends JFrame{
	public final int WIDTH=500;
	public final int HEIGHT=300;
	public BitCalc()
	{
		setSize(WIDTH, HEIGHT);
		setTitle("BitCalc");
		
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.GRAY);
		this.add(mainPanel);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		String first = JOptionPane.showInputDialog(mainPanel, "Input a number: ");
		String last = JOptionPane.showInputDialog(mainPanel, "Input a number: ");
		int result=multiply(Integer.parseInt(first),Integer.parseInt(last));
		JOptionPane.showMessageDialog(mainPanel,result);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public int multiply(int x, int y)
	{
		int result=0;
		int mult =y/2;
		for(int i=0;i<mult;i++)
		{
			result+=x<<1;
		}
		if(y%2==1)
		{
			result+=x;
		}
		return result;
	}
	public static void main(String[] args)
	{
		BitCalc b=new BitCalc();
		System.out.println(b.multiply(3,4));
	}
}
