import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BeanParser {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan=new Scanner(new File("test.txt"));
		
		int size=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<size;i++)
		{
			int count=0;
			String line=scan.nextLine();
			while(line.indexOf("bean")!=-1)
			{
				int index=line.indexOf("bean");
				count++;
				line=line.substring(index+4);
			}
			System.out.println(count);
		}
	}

}
