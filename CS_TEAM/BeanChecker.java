import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BeanChecker {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan=new Scanner(new File("test.txt"));
		int size=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<size;i++)
		{
			String name=scan.next().toLowerCase();
			int weight=scan.nextInt();
			boolean worthy=false;
			if((name.indexOf('e')!=-1)&&(weight%2==1))
			{
				worthy=true;
			}
			if(worthy)
			{
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
	}

}
