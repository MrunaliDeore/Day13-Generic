package Thirteen;

public class printMaximum 
{
	public static void toPrint(Integer[] inputArray)
	{
		for(int element  : inputArray)
		{
			System.out.printf("%s\t", element);
		}
		System.out.println();
	}


	public static void main(String[] args)
	{  


		Integer [] intArray = {25, 11, 7};  
		int max = intArray[0];  
		for (int i = 0; i < intArray.length; i++) 
		{  
			//Compare elements of array with max  
			if(intArray[i] > max)  
				max = intArray[i];  
		}  
		printMaximum.toPrint(intArray);
		System.out.println("Maximum element present in given array: " + max);  
	}  
}  
