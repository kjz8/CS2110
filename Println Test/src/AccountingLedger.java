import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountingLedger {

	String description;
	String date;
	double change=0.00;
	double initBalance=0.00;
	static double currentBalance=0.00;
	String [] sarr;
	static boolean firstIncr=true;
	static boolean firstDecr=true;
	static boolean firstBal=true;
	AccountingLedger(String s)
	{
		sarr=s.split("::");
		date=sarr[0];
		description=sarr[1];
		change=Double.parseDouble(sarr[2]);
		if(description.equals("Balance forward"))
		{
			initBalance=Double.parseDouble(sarr[2]);
			currentBalance=initBalance;
		}
		else
		{
			currentBalance+=change;
		}
	}
	public double getBalance()
	{
		return currentBalance;
	}
	public double getChange()
	{
		return change;
	}
	public String getDate()
	{
		return date;
	}
	public String getDescription()
	{
		return description;
	}
	
	public String toString()
	{
		String s=sarr[0];
		for(int i=1;i<sarr.length;i++)
		{
			s+=sarr[i];
		}
		return s;
	}
	public static void main(String [] args) throws FileNotFoundException
	{
		Scanner sc=new Scanner(new File("src/JanTransactions.txt"));
		System.out.printf("%-15s", "Date");
		System.out.printf("%-20s", "Description");
		System.out.printf("%15s", "Increase");
		System.out.printf("	%15s", "Decrease");
		System.out.printf("%15s%n", "Balance");
		while(sc.hasNextLine())
		{
		AccountingLedger l1=new AccountingLedger(sc.nextLine());
		
		
		System.out.printf("%-15s", l1.getDate());
		System.out.printf("%-20s", l1.getDescription());
		if(l1.getChange()>0)
		{
			if(firstIncr)
				System.out.printf(" $%,14.2f", l1.getChange());
			else
				System.out.printf(" %,15.2f", l1.getChange());
			
			System.out.printf("	%15s", "");
			firstIncr=false;
		}
		else 
		{
				System.out.printf("	%15s", "");
			if(firstDecr)
				System.out.printf("	$%+,14.2f", l1.getChange());
			else
				System.out.printf("	%+,15.2f", l1.getChange());
			
			firstDecr=false;
		}
		if(firstBal)
			System.out.printf("	$%,14.2f%n", AccountingLedger.currentBalance);
		else
			System.out.printf("	%,15.2f%n", AccountingLedger.currentBalance);
		firstBal=false;
		}
	}
}
