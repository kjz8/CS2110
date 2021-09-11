import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class F {
	int count=0;
	int [][] board;
	public F(int x,String s)
	{
		int pos=0;
		board=new int[x][x];
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				board[i][j]=Integer.parseInt(s.substring(pos, pos+1));
				pos++;
			}
		}
		
		
	}
	public boolean isMoveY(int x,int xPos,int yPos)
	{
		if(x==0)
			return false;
		else if(yPos+x>=board.length)
			return false;
		else
			return true;
	}
	public boolean isMoveX(int x,int xPos,int yPos)
	{
		if(x==0)
			return false;
		else if(xPos+x>=board.length)
			return false;
		else
			return true;
	}
	public int moveCounter()
	{
		return 0;
	}
	public int move(int xPos,int yPos)
	{
		if(xPos==board.length-1&&yPos==board.length-1)
			count++;
		else if(isMoveY(board[xPos][yPos],xPos,yPos))
		{
			move(xPos,yPos+board[xPos][yPos]);
		}
		if(isMoveX(board[xPos][yPos],xPos,yPos))
		{
			move(xPos+board[xPos][yPos],yPos);
		}
		return count;
	}
	public String toString()
	{
		String s="";
		s+=move(0,0);
		return s;
	}
	public static void main(String args []) throws FileNotFoundException
	{
		Scanner scan=new Scanner(new File("F.txt"));
		int size;
		
		while(scan.hasNextLine())
		{
			String moves="";
			String s=scan.nextLine();
			if(s.length()==1&&!s.equals("-1"))
			{
				size=Integer.parseInt(s);
				for(int i=0;i<size;i++)
				{
					moves+=scan.nextLine();
				}
				System.out.println(moves);
				F f1=new F(size,moves);
				System.out.println(f1);
			}
			
		}
		
	}
}
