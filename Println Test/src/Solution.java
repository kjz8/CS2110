
import java.io.*;
import java.util.*;

public class Solution {

	public static int findLCM(int[] arr) {
		/*Set<Integer> nums = new HashSet<Integer>();
		int m = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (findFactor(arr[i], arr[j]) == 1) {
					continue;
				} else {
					if (findFactor(arr[i], arr[j]) == arr[i] && findFactor(arr[i], arr[j]) == arr[j]) {
						nums.add(arr[i]);
					} else {
						nums.add(arr[i] / findFactor(arr[i], arr[j]));
						nums.add(arr[j] / findFactor(arr[i], arr[j]));
					}
				}
			}
		}
		if(nums.size()==0)
		{
			for(int x:arr)
			{
				nums.add(x);
			}
		}
		for (int x : nums) {
			m = m * x;
		}
		return m;
		*/
		int lcm = (x > b) ? a : b;
        while(true){
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm++;
        }
        return lcm;
	}

	public static int findFactor(int x, int y) {
		int f = 1;
		for (int i = 2; i <= 100; i++) {
			if (x % i == 0 && y % i == 0) {
				f = i;
			}
		}
		return f;
	}

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(new File("test.txt"));
		int numCases = scan.nextInt();
		int[] arr;
		for (int i = 0; i < numCases; i++) {
			int numGroups = scan.nextInt();
			arr = new int[numGroups];
			for (int j = 0; j < numGroups; j++) {
				arr[j] = scan.nextInt();

			}
			System.out.println(findLCM(arr));
		}
	}
}