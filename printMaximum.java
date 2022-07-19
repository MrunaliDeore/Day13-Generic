package Thirteen;

public class printMaximum 
{
	public static <E> void  toPrint(E[] inputArray)
	{
		for(E element  : inputArray)
		{
			System.out.printf("%s\t", element);
		}
		System.out.println();
	}
	public static void main(String[] args)
	{  
		//maximim int
		Integer [] intArray = { 25,11,7 };  
		int maxint = intArray[0];  
		for (int i = 0; i < intArray.length; i++) 
		{  
			//Compare elements of array with max  
			if(intArray[i] > maxint)  
				maxint = intArray[i];  
		}  
		printMaximum.toPrint(intArray);
		System.out.println("Maximum element present in given array: " + maxint);  
		System.out.println("--------------------------------------------------");
		//max float
		Double [] doubleArray = {25.2, 11.6, 7.5};  
		double maxdouble = doubleArray[0];  
		for (int i = 0; i < doubleArray.length; i++) 
		{  
			//Compare elements of array with max  
			if(doubleArray[i] > maxdouble)  
				maxdouble = doubleArray[i];  
		}  
		printMaximum.toPrint(doubleArray);
		System.out.println("Maximum element present in given array: " + maxdouble);  
		
	}  
}  
