import java.util.Arrays;

//Name -
//Date -
//Class -
//Lab  -

public class ArrayAsPQ
{
	// instance data
	private int[] arr;
	private int maxSize;
	private int numElements;
	// constructors
	public ArrayAsPQ(int size)
	{
		arr=new int[size];
		numElements=0;
		maxSize=size;
	}

	// return methods
	public int peek()
	{
		return arr[0];
	}

	public  <E> void enQueue(int item)
	{
		int index=numElements;
		arr[numElements]=item;
		numElements++;
		reheapUp();
	}
	
	public int deQueue()
	{
		int top=arr[0];
		arr[0]=arr[numElements-1];
		arr[numElements-1]=0;
		numElements--;
		reheapDown();
		
		return top;
	}
	
	public boolean isEmpty()
	{
		if(numElements==0)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean add(int x)
	{
		if(numElements==maxSize)
		{
			return false;
		}
		else
		{
			enQueue(x);
			return true;
		}
			
	}
	public boolean remove()
	{
		if(arr.length==0)
		{
			return false;
		}
		else
		{
			deQueue();
			return true;
		}
	}
	// helper methods
	private void reheapUp()
	{
		int curr=numElements-1;
		while(curr>0)
		{
			int parent =(curr-1)/2;
			if(arr[parent]>arr[curr])
			{
				int temp=arr[parent];
				arr[parent]=arr[curr];
				arr[curr]=temp;
				curr=parent;
			}
			else
				break;
		}
	}

	private void reheapDown()
	{
		int curr=0;
		int leftIndex=0;
		int rightIndex=0;
		int minChild=0;
		while(curr<numElements)
		{
			//find left and right children indexes
			leftIndex=(curr*2)+1;
			rightIndex=(curr*2)+2;
			if(leftIndex<numElements)
			{
				if(rightIndex<numElements)
				{
					if(arr[rightIndex]<arr[leftIndex])
					{
						minChild=rightIndex;
					}
					else
						minChild=leftIndex;
				}
				else
				{
					minChild=leftIndex;
				}
					
			}
			else
				break;
			
			if(arr[curr]>arr[minChild])
			{
				int temp=arr[minChild];
				arr[minChild]=arr[curr];
				arr[curr]=temp;
				curr=minChild;
			}
			else
				break;
		}
		
	}

	// toString
	public String toString()
	{
		return Arrays.toString(arr);
	}

}