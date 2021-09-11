import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;





public class PlayerRunner {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan=new Scanner(new File("Records.txt"));
		ArrayList<Player> players=new ArrayList<>();
		while(scan.hasNextLine())
		{
			String data=scan.nextLine();
			String[] arr=data.split(":");
			ArrayList<String> records=new ArrayList(Arrays.asList(arr));
			char[] pwd=records.get(2).toCharArray();
			Player.Gender g1=Player.Gender.valueOf(records.get(3).toUpperCase());
			Player p1=new Player(records.get(0),records.get(1),pwd,g1,records.get(4),records.get(5));
			players.add(p1);
		}
		//System.out.println(players);
		for(Player x:Player.findFNames(players))
		{
			System.out.println(x);
		}
		System.out.println("");
		for(Player x:Player.findLNames(players)) 
		{
			System.out.println(x);
		}
	}

}
