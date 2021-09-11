//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;

public class PostFixRunner
{
	public static void main(String [] args) throws FileNotFoundException
	{
		Scanner file=new Scanner(new File("postfixExp.in"));
		while(file.hasNextLine())
		{
			PostFix pf=new PostFix(file.nextLine());
			System.out.println(pf);
		}
	}

}