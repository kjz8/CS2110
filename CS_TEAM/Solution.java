import java.io.*;
import java.util.*;

public class Solution {
    int[][] map;
    int size;
    int setNum;
    int shortest=(size-1)*2;
    int count=0;
    int numSteps=0;

    public Solution(int n, int s) {
        setNum = n;
        size=s;
        map = new int[s][s];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j <= i; j++) {
                map[j][i] = 1;
            }
        }
    }

    public int[][] getMap() {
        return map;
    }
    public boolean isValidPos(int x,int y)
    {
    	if(x<size&&y<size&&x>=0&&y>=0)
    	{
    		return true;
    	}
    	else
    		return false;
    }

    public boolean findRoutes(int x,int y) {
    	if(x==size-1&&y==size-1&&numSteps==shortest)
    	{
    		numSteps=0;
    		count++;
    		return true;
    	}
    	else
    	{
    		if(isValidPos(x+1,y))
    		{
    			numSteps++;
    			findRoutes(x+1,y);
    			return false;
    		}
    		if(isValidPos(x,y+1))
    		{
    			numSteps++;
    			findRoutes(x,y+1);
    			return false;
    		}
    	}
		return false;
    }
    public int getRoutes()
    {
    	findRoutes(0,0);
    	return count;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Solution[] dataSets = new Solution[size];
        for (int i = 0; i < size; i++) {
            Solution test = new Solution(scan.nextInt(), scan.nextInt());
            // for(int j=0;j<size;j++)
            // {
            //     System.out.println(Arrays.toString(test.map[j]));
            // }
            System.out.println(test.getRoutes());
            dataSets[i] = test;
        }
    }
}