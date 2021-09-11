import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D {
	
	enum Combo
	{
		TTT("TTT"),TTH("TTH"),THT("THT"),THH("THH"),
		HTT("HTT"),HTH("HTH"),HHT("HHT"),HHH("HHH");
		
		String name;
		Combo(String s)
		{
			name=s;
		}
	}
	public D()
	{
		
	}
	
	public static void main(String [] args) throws FileNotFoundException
	{
		Scanner scan=new Scanner(new File("D.txt"));
		int n=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++)
		{
			int set=scan.nextInt();
			scan.nextLine();
			String input=scan.nextLine();
			int[] matches={0,0,0,0,0,0,0,0};
			for(int j=0;j<input.length()-2;j++)
			{
				String seq=input.substring(j, j+3);
				for(int k=0;k<8;k++)
				{
					if(seq.equals(Combo.values()[k].name))
					{
						matches[k]++;
					}
				}
				
			}
			String out="";
			for(int l=0;l<matches.length;l++)
			{
				out=out+ " "+matches[l];
			}
			System.out.println(set+out);
			//System.out.println(input);
		}
		
		Combo[] arr=new Combo[48];
	}

}
