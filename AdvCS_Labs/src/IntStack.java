//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.*;

public class IntStack
{
	//pick your storage for the stack
	//you can use the an array or an ArrayList

	//option 1
	private ArrayList<Integer> rayOfInts;
	private int numInts;

	//option 2
	private ArrayList<Integer> listOfInts;

	public IntStack()
	{
		rayOfInts=new ArrayList<>();
		numInts=0;
	}

	public void push(int item)
	{
		rayOfInts.add(item);
		numInts++;
	}

	public int pop()
	{
		int num=rayOfInts.get(numInts-1);
		rayOfInts.remove(numInts-1);
		numInts--;
		return num;
	}

	public boolean isEmpty()
	{
		if(numInts==0)
		{
			return true;
		}
		else
			return false;
	}

	public int peek()
	{
		return rayOfInts.get(numInts-1);
	}

	public String toString()
	{
		return rayOfInts.toString();
	}
}