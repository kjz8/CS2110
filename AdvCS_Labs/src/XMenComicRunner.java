import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class XMenComicRunner {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file=new Scanner(new File("ComicBook.txt"));
		TreeMap<Integer,XMenComic> comics=new TreeMap<>();
		while(file.hasNextLine())
		{
			XMenComic comic=new XMenComic(file.nextLine().trim());
			comics.put(comic.getIssueNum(), comic);
		}
		java.util.Iterator<Integer> b= comics.keySet().iterator();

		while(b.hasNext())
		{
			System.out.println(comics.get(b.next()));
		}
		
		comics.remove(1);
		System.out.println("After removing first comic: ");
		java.util.Iterator<Integer> c= comics.keySet().iterator();

		while(c.hasNext())
		{
			System.out.println(comics.get(c.next()));
		}
		System.out.println("Comics Issue #20 to Issue #40: ");
		for(int j=20;j<41;j++)
		{
			System.out.println(comics.get(j));
		}
	}

}
