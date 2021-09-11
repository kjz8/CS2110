import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BeanSearch {

	public static boolean findWord(String word, char[][] grid) {
		boolean found = false;
		String horiz = "";
		String vert = "";
		String diag2 = "";
		String diag = "";
		StringBuilder d2;
		StringBuilder h;
		StringBuilder v;
		StringBuilder d;
		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[i].length; j++) {
				horiz += grid[i][j];
			}
			
			h = new StringBuilder(horiz);
			if (horiz.indexOf(word) != -1 || h.reverse().toString().indexOf(word) != -1) {
				return true;
			}
			horiz = "";
			
		}
		for(int col=0;col<grid[1].length;col++)
		{
			for(int row=0;row<grid.length;row++)
			{
				vert += grid[row][col];
			}
			v = new StringBuilder(vert);
			if (vert.indexOf(word) != -1 || v.reverse().toString().indexOf(word) != -1) {
				return true;
			}
			vert = "";
		}
		if (grid.length >= grid[1].length) {
			for (int g = 0; g < grid.length; g++) {
				int k = g;
				for (int row = 0; row < grid[1].length; row++) {
					diag += grid[k][row];
					diag2+=grid[k][grid[1].length-1-row];
					if(k+1<grid.length)
						k++;

				}
				d = new StringBuilder(diag);
				if (diag.indexOf(word) != -1 || d.reverse().toString().indexOf(word) != -1) {
					return true;
				} else
					diag = "";
				
				d2 = new StringBuilder(diag2);
				if (diag2.indexOf(word) != -1 || d2.reverse().toString().indexOf(word) != -1) {
					return true;
				} else
					diag2="";
			}
		}
		
		return found;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("test.txt"));
		int size = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < size; i++) {
			int numRows = scan.nextInt();
			int numCols = scan.nextInt();
			scan.nextLine();
			char[][] grid = new char[numRows][numCols];
			for (int row = 0; row < numRows; row++) {
				String line = scan.nextLine();
				for (int col = 0; col < numCols; col++) {
					grid[row][col] = line.charAt(col);
				}
			}
			int numWords = scan.nextInt();
			scan.nextLine();
			for (int w = 0; w < numWords; w++) {
				String word = scan.nextLine();
				if (findWord(word, grid)) {
					System.out.println("FOUND");
				} else
					System.out.println("NOT FOUND");
			}
		}
	}
}
