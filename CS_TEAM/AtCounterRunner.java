//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounterRunner
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter a=new AtCounter();
		//test the code
		System.out.println(a);
		System.out.println(a.printString(0, 0));
		System.out.println(a.printString(2, 5));
		System.out.println(a.printString(5, 0));
		System.out.println(a.printString(9, 9));
		System.out.println(a.printString(3, 9));
	}
}