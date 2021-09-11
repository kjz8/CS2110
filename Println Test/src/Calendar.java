import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
	// place enum Month here
	enum Month{
		JAN(31,"January"), FEB(28,"February"), MAR(31,"March"), APR(30,"April");
		int maxDays;
		String longName;
		private Month(int days,String s)
		{
			maxDays=days;
			longName=s;
		}
	}



	private Month m;
	private int day;
	private int year;
	
	public Calendar(Month m,int d, int y)
	{
		this.m=m;
		day=d;
		year=y;
	}
	public String toString()
	{
		return m+" "+day+" "+year;
	}
	public static void main(String[] args) {
		
		// Iterate over the months of the year
		for (Month m : Calendar.Month.values())
			System.out.println(m);

		// Create several Calendar objects (ie. dates of the year
		Calendar foolsDay=new Calendar(Month.APR, 1, 2018);
		Calendar day1=new Calendar(Month.APR,9,2018);
		Calendar day2=new Calendar(Month.MAR,17,2018);
		
		// Iterate over the dates and print them to the screen (ie. use the "for each" loop
		System.out.println(foolsDay);
		List<Calendar> list=new ArrayList<Calendar>();
		
		list.add(foolsDay);
		list.add(day1);
		list.add(day2);
		
		for(Calendar x: list)
		{
			System.out.println(x);
		}


	}

}
