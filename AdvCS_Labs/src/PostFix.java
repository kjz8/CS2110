//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix
{
	private Stack<Double> stack;
	private String expression;

	public PostFix()
	{
		stack=new Stack<>();
		expression="";
	}

	public PostFix(String exp)
	{
		stack=new Stack<>();
		setExpression(exp);
	}

	public void setExpression(String exp)
	{
		expression=exp;
	}

	public double calc(double one, double two, char op)
	{
		double ans=0.0;
		if(op=='*')
		{
			ans=one*two;
		}
		else if(op=='/')
		{
			ans=one/two;
		}
		else if(op=='-')
		{
			ans=one-two;
		}
		else if(op=='+')
		{
			ans=one+two;
		}
		return ans;
	}

	public double solve()
	{
		double ans=0.0;
		char[] expChars=expression.toCharArray();
		for(char x:expChars)
		{
			if(Character.isDigit(x))
			{
				stack.push(Double.parseDouble(Character.toString(x)));
			}
			else if((x=='*')||(x=='/')||(x=='+')||(x=='-'))
			{
				double last=stack.pop();
				double first=stack.pop();
				stack.push(calc(first,last,x));
			}
				
		}
		ans=stack.pop();
		return ans;
		
	}

	//add a toString
	public String toString()
	{
		return expression+" = "+solve();
	}
}