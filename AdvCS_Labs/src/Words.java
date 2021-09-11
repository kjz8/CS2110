
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Words {
	static Scanner file; 
	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		try{
		file = createScanner();
		int lines = file.nextInt();
		file.nextLine();
		String s ="";
		String[] s1;
		for(int k = 0; k<lines;k++)
		{
			s  = file.nextLine();
			 s1 = s.split(" ");
			 System.out.print(s1[0]);
			for (int g = 1 ; g<s1.length; g++)
			{
				System.out.print(" " + s1[g].charAt(0));
			}
			System.out.println();
		}

		int x=3/0;
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception caught");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds exception caught");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception caught");
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("No Such Element exception caught");
		}
		finally 
		{ 
			System.out.println("This is in the finally clause");
		}
		
		
		
	}
	public static Scanner createScanner()
	{
		Scanner s=null;
		try {
		s= new Scanner(new File ("empty.txt"));
		
		}
		catch(FileNotFoundException e)
		{
			JFrame f=new JFrame();
			JOptionPane.showMessageDialog(f, "File missing or invalid");
			System.exit(0);
		}
		
		finally {
			return s;
		}
	}

}
