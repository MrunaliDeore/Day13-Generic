package Thirteen;

import java.util.Arrays;

public class printMaximum 
{
	static double maxdouble;
	
	public static void maximum(double my_array[]) 
	{
		maxdouble = my_array[0];
		int len = my_array.length;
		for (int i = 1; i < len - 1; i = i + 2) 
		{
			if (i + 1 > len) 
			{
				if (my_array[i] > maxdouble) maxdouble = my_array[i];
			}
			if (my_array[i] > my_array[i + 1]) 
			{
				if (my_array[i] > maxdouble) maxdouble = my_array[i];
			}
			if (my_array[i] < my_array[i + 1]) 
			{
				if (my_array[i + 1] > maxdouble) maxdouble = my_array[i + 1];
			}
		}
	}
	
	

	public static void main(String[] args) 
	{
		double[] my_array = {1.5, 5.4, 12.3};
		maximum(my_array);
		System.out.println(" Original Array: "+Arrays.toString(my_array));
		System.out.println(" Maximum value for the above array = " + maxdouble);
	}
}
