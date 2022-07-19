package Thirteen;

public class printMaximum 
{
	public static void toPrint(Double[] inputArray)
	{
		for(double element  : inputArray)
		{
			System.out.printf("%s\t", element);
		}
		System.out.println();
	}


	public static void main(String[] args)
	{  


		Double [] intArray = {25.2, 11.6, 7.5};  
		double max = intArray[0];  
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
