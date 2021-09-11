import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class PreFixSolver {
	private Stack<Double> stack;
	private Stack<String> toPosts;
	private String expression;

	public PreFixSolver()
	{
		stack=new Stack<>();
		toPosts=new Stack<>();
		expression="";
	}

	public PreFixSolver(String exp)
	{
		stack=new Stack<>();
		toPosts=new Stack<>();
		setExpression(exp);
	}

	public void setExpression(String exp)
	{
		String postFix="";
		char[] expChars=exp.toCharArray();
		for(int i=expChars.length-1;i>-1;i--)
		{
			if(Character.isDigit(expChars[i]))
			{
				toPosts.push(Character.toString(expChars[i]));
			}
			else if((expChars[i]=='*')||(expChars[i]=='/')||(expChars[i]=='+')||(expChars[i]=='-'))
			{
				String last=toPosts.pop();
				String first=toPosts.pop();
				postFix=last+first+expChars[i];
				toPosts.push(postFix);
			}
				
		}
		expression=toPosts.pop();
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
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file=new Scanner(new File("prefixExp.in"));
		while(file.hasNextLine())
		{
			PreFixSolver fs=new PreFixSolver(file.nextLine());
			System.out.println(fs);
		}
		
	}

}
