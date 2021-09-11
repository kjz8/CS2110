import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RomanCalculator {
	enum Letter {
		I("I", 1), V("V", 5), X("X", 10), L("L", 50), C("C", 100), D("D", 500), M("M", 1000);
		int value;
		String name;

		Letter(String n, int num) {
			name = n;
			value = num;
		}
	}

	public static int[] toInteger(String s) {
		char[] ls = s.toCharArray();
		int[] nums = new int[s.length()];
		for (int i = 0; i < ls.length; i++) {
			switch (ls[i]) {
			case 'I':
				nums[i] = Letter.I.value;
				break;
			case 'V':
				nums[i] = Letter.V.value;
				break;
			case 'X':
				nums[i] = Letter.X.value;
				break;
			case 'L':
				nums[i] = Letter.L.value;
				break;
			case 'C':
				nums[i] = Letter.C.value;
				break;
			case 'D':
				nums[i] = Letter.D.value;
				break;
			case 'M':
				nums[i] = Letter.M.value;
				break;
			}
		}
		return nums;
	}

	public void toNumeral(int num) {

	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("E.txt"));
		while (scan.hasNextLine()) {
			String s = scan.nextLine();
			//String[] separator = new String[] { "+", "-", "/", "*" };
			String[] arr = s.split("+?-?/?*?");
			systoInteger(arr[0]);
		}
	}

}
