import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * The Player object is created after the user enters their
 * @author Zhang_Kelly
 *
 */
public class Player {
	static int id=0;
	String fName;
	String lName;
	char [] pwd;
	private Gender gender;
	public enum Gender {
		MALE,FEMALE;
		
	}
	String age;
	String campus;
	
	
	/**
	 * The player constructor creates an object containing the data that the user
	 * entered in the Create Account Page. 
	 * @param fname
	 * @param lname
	 * @param pass
	 * @param g
	 * @param a
	 * @param c
	 */
	public Player(String fname, String lname, char[] pass, Gender g,String a,String c)
	{
		fName=fname;
		lName=lname;
		pwd=pass;
		gender=g;
		age=a;
		campus=c;
		id++;
	}

	public static boolean confirmPassword(String s)
	{
		boolean x=false;
		if(s.matches(".{6,12}"))
		{
			if(s.matches(".*[\\W&\\D&\\S].*"))
			{
				if(s.matches(".*[A-Z].*"))
				{
					if(s.matches(".*[0-9]+.*"))
					{
						x=true;
					}
					
				}
			}
		}
		return x;
		
	
	}
	
	public static String evaluatePass(String s)
	{
		if(!confirmPassword(s))
		{
			if(!s.matches(".{6,12}"))
			{
				return "Password must be between 6 and 12 characters";
			}	
				
			else if(!s.matches(".*[\\W&\\D&\\S].*"))
			{
				return "Password must contain a special character";
			}
				
			else if(!s.matches(".*[A-Z].*"))
			{
				return "Password must contain a capital letter";
			}
					
			else if(!s.matches(".*[0-9]+.*"))
			{
				return "Password must contain a number";
			}
			else
				return "";
		}
		return "";
		}
			
						
	public static ArrayList<Player> findFNames(ArrayList<Player> arr)
	{
		ArrayList<Player> matches=new ArrayList<>();
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i).fName.matches(".*ly"))
			{
				matches.add(arr.get(i));
			}
		}
		return matches;
		
	}
		
	public static ArrayList<Player> findLNames(ArrayList<Player> arr)
	{
		ArrayList<Player> matches=new ArrayList<>();
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i).lName.matches("[AJ].*"))
			{
				matches.add(arr.get(i));
			}
		}
		return matches;
	}
	public String toString()
	{
		
		String pass="";
		String gnder;
		String description="Account info:	";
		description+="Name: ";
		description+=fName+" "+lName;
		description+=" Password: ";
		for(int i=0;i<pwd.length;i++)
		{
			pass+=pwd[i];
		}
		description+=pass;
		description+=" Gender: ";
		
		gnder=gender.name();
		
		final JPanel panel = new JPanel();
		while(!evaluatePass(pass).equals(""))
		{
			System.out.println("fail");
			JTextArea box=new JTextArea(1,1);
			JOptionPane.showMessageDialog(panel, box,"Invalid Password: "+evaluatePass(pass),
			        JOptionPane.WARNING_MESSAGE);
			pass=box.getText();
			
		}
		/*description+="Age: ";
		description+=age;
		description+=" Campus: ";
		description+=campus;
		*/
		
		
		return String.format("ID: %1$-5s Name: %2$-10s %3$-8s Gender: %4$-10s Age: %5$-15s  Campus: %6$-20s Password: %7$-20s", id, fName,lName,gnder,age,campus,pass);
	}
	public static void main(String[] args)
	{
		
		
	}
}
