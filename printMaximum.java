package Thirteen;

import java.util.Arrays;

public class printMaximum 
{
	static int maxint;
	public static void maximum(int my_array[]) 
	{
		maxint = my_array[0];
		int len = my_array.length;
		for (int i = 1; i < len - 1; i = i + 2) 
		{
			if (i + 1 > len) 
			{
				if (my_array[i] > maxint) maxint = my_array[i];
			}
			if (my_array[i] > my_array[i + 1]) 
			{
				if (my_array[i] > maxint) maxint = my_array[i];
			}
			if (my_array[i] < my_array[i + 1]) 
			{
				if (my_array[i + 1] > maxint) maxint = my_array[i + 1];
			}
		}
	}

	public static void main(String[] args) 
	{
		int[] my_array = {25, 14, 56};
		maximum(my_array);
		System.out.println(" Original Array: "+Arrays.toString(my_array));
		System.out.println(" Maximum value for the above array = " + maxint);
	}
}
