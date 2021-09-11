//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class ArrayAsPQRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		ArrayAsPQ pq1 = new ArrayAsPQ(25);

		//add items to the PQ
		pq1.add(15);
		pq1.enQueue(23);
		pq1.add(5);
		pq1.add(2);
		pq1.add(29);
		pq1.add(17);
		pq1.add(32);
		pq1.add(25);
		pq1.add(2);

		// print all items in the priority queue (no ordering)
		System.out.println(pq1);

		// print the top item in the list
		System.out.println(pq1.peek());


		// print all items in PQ in priority order (list will be empty when finished)
		while(!pq1.isEmpty())
		{
			System.out.println(pq1.deQueue());
		}

	}
}