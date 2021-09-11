//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker()
	{
		symbols=new Stack<>();
		exp="";
	}

	public SyntaxChecker(String s)
	{
		exp=s;
		symbols=new Stack<>();
		
	}
	
	public void setExpression(String s)
	{
		exp=s;
	}

	public boolean checkExpression()
	{
		char [] chars=exp.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			char x=chars[i];
			if(x=='('||x=='{'||x=='[')
			{
				symbols.push(x);
			}
			else if(((x==')')||(x=='}')||(x==']')))
			{
				if(!symbols.isEmpty())
				{
					char s=symbols.pop();
					if((s=='(')&&(x==')'))
					{
						continue;
					}
					else if((s=='{')&&(x=='}'))
					{
						continue;
					}
					else if((s=='[')&&(x==']'))
					{
						continue;
					}
					else
						return false;
				}
				else
					return false;
			}
		}
		if(symbols.isEmpty())
			return true;
		else
			return false;
	}

	//write a toString
	public String toString()
	{
		if(checkExpression())
		{
			return exp+" is correct.";
		}
		else
			return exp+" is incorrect.";
	}
}