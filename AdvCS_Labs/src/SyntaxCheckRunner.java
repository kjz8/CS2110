//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -  
//Class -
//Lab  -

import java.util.Scanner;
import java.util.Stack;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;

public class SyntaxCheckRunner
{
	public static void main ( String[] args ) throws FileNotFoundException
	{
		//add test cases	
		Scanner file=new Scanner(new File("syntax.txt"));
		while(file.hasNextLine())
		{
			String line=file.nextLine();
			SyntaxChecker sc=new SyntaxChecker(line);
			System.out.println(sc+"\n");
		}
	}
}