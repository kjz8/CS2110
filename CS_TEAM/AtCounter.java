//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Arrays;

public class AtCounter
{
   private String[][] atMat;
   private int count;
   private String [][] newMat;
	public AtCounter()
	{
		//size the matrix
		//use nested loops to randomly load the matrix
		//you will need to use Math.random()
		atMat=new String[10][10];
		newMat=new String[10][10];
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
			{
				int num=(int)(Math.random()*2);
				if(num==0)
					atMat[i][j]="@";
				else
					atMat[i][j]="-";
				
			}
		copyMatrix(newMat,atMat);
		
		count=0;
	}
	public void copyMatrix(String[][] copy,String[][] orig)
	{
	for ( int r = 0; r < orig.length; r++)
		{
		
		  for ( int c = 0; c < orig[r].length; c++ )
		
		  {
		
		    copy [ r ] [ c ] = orig [ r ] [ c ];
		
		  }
		
		}
	}
	public int countAts(int r, int c)
	{
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		
		if(r>=0&&r<10&&c<10&&c>=0&&newMat[r][c]=="@")
		{
			count++;
			newMat[r][c]="v";
			if(r+1<10)
			{
				countAts(r+1,c);
			
			}
				
			if(r-1>=0)
			{
				countAts(r-1,c);
		
			}
			if(c-1>=0)
			{
				countAts(r,c-1);
				
			}
			if(c+1<10)
			{
				countAts(r,c+1);
			
			}
			
			
			return count;
		}
		else
			return 0;
		
	}

	/*
	 *this method will return all values in the matrix
	 *this method should return a view of the matrix
	 *that looks like a matrix
	 */
	public String toString()
	{
		String output="";
		for(String[] x:atMat)
		{
			for(String y:x)
				output+=" "+y;
			output+="\n";
		}
		
		copyMatrix(newMat,atMat);
		
		
		return output;
	}
	public String printString(int row,int col)
	{
		String output="";
		count=0;
		copyMatrix(newMat,atMat);
		output+="\n"+row+" "+col+" "+"has "+countAts(row, col)+" @s connected.";
		
		return output;
	}
}