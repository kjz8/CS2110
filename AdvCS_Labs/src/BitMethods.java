
public class BitMethods {
	/** Return a String representing num in binary.
	* @param i contains the whole number
	* @return binary num in String format
	* Example: 5 returns “00000101”
	*/
	public static String bitString(int i)
	{
		byte n=(byte) (i&0xff);
		return Integer.toBinaryString(n);
	}
	/** Count the number of bits set in an integer.
	* @param num contains the whole number
	* @return the number of bits set in num
	*/
	public static int countBitsSet(int num)
	{
		int count=0;
		int n=num;
		while(n>0)
		{
			if((n&0b1)==1)
			{
				count++;
			}
			n=n>>>1;
		}
		return count;
	}
	/** Break a long variable into 4 separate char’s and place in an
	* array (ex. Integer.MAX_VALUE would save as
	* [0,0,32767,65535]
	* @param num contains the whole number
	* @return an array of char values from num
	*/
	public static char[] splitLongIntoArray (long num)
	{
		long temp=num;
		char[] result=new char[4];
		for(int i=0;i<4;i++)
		{
			result[3-i]=(char) (temp&0xffff);
			temp=temp>>16;
		}
		return result;
	}
	/** Flip each bit in a char (ie. change each bit in a two byte
	* char to its opposite)
	* @param ch contains one character
	* @return the new char, 2 byte value, from flipping each bit
	* in ch
	*/
	public char flipBitsInChar(char ch)
	{
		return (char) (ch^0xff);
	}
	public static void main(String[] args)
	{
		//Test data:78
		System.out.println("78 = " + bitString(78));	//0100 1110
		
		System.out.println("Count of bits is = "+countBitsSet(78));
		System.out.print("Long data split into 4 2-byte chars = " );
		char [] arr= splitLongIntoArray(78L);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((int)arr[i] + " ");
		}
		System.out.println("\n");
		
		//Test data: 70000
		System.out.println("70000 = "+bitString(70000));
		System.out.println("Count of bits is = "+countBitsSet(70000));
		System.out.print("Long data split into 4 2-byte chars = " );
		char [] arr2= splitLongIntoArray(70000L);
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print((int)arr2[i] + " ");
		}
		System.out.println("\n");
		
		//Test data: Integer.MAX_VALUE
		System.out.println("Integer.MAX_VALUE = " + bitString(Integer.MAX_VALUE)); // 0001 00010001 0111 0000
		System.out.println("Count of bits is = " + countBitsSet(Integer.MAX_VALUE)); // 6
		System.out.print("Long data split into 4 2-byte chars = ");
		arr = splitLongIntoArray(Integer.MAX_VALUE); // 0 0 32767 65535
		for (int i=0 ; i<arr.length ; i++)
		System.out.print((int)arr[i] + " ");
		
	}

}
