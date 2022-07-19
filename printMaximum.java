package Thirteen;

public class genericMethod 
{
	public static <E> void toPrint(E[] inputArray)
	{
		for(E element : inputArray)
		{
			System.out.printf("%s\t",inputArray);
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
		
		System.out.println("Maximum element present in given array: " + max);  
		
		System.out.println("------------------------------------------------");
		
		Double [] doubleArray = {25.5, 11.8, 7.2};  
		double maxdouble = doubleArray[0];  
		for (int i = 0; i < doubleArray.length; i++) 
		{  
			//Compare elements of array with max  
			if(doubleArray[i] > maxdouble)  
				maxdouble = doubleArray[i];  
		}  
		
		System.out.println("Maximum element present in given array: " + maxdouble);  

	}  
}
