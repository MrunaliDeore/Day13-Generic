package Thirteen;

//Refactor 1 
//Refactor all the 3 to One Generic Method and find the maximum
//- Ensure the Generic Type extends Comparable

public class FindMaximum<T extends Comparable<T>> 
{	
	T a1, a2, a3, a4, a5, a6;

	public FindMaximum(T a1, T a2, T a3, T a4, T a5, T a6) 
	{
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		this.a5 = a5;
		this.a6 = a6;
	}
	public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3, T a4, T a5, T a6)
	{
		T max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		if (a4.compareTo(max) > 0)
			max = a4;
		if (a5.compareTo(max) > 0)
			max = a5;
		if (a6.compareTo(max) > 0)
			max = a6;
		return max;
	}

	public static void main(String[] args) 
	{
		System.out.println("Welcome To Find Maximun Problem Using Generics \n");
		System.out.println("The maximum value between the three integer is : " + maxOfValues(15, 87, 68, 25, 45, 77)+ "\n");
		System.out.println("The maximum value between the three float is : " + maxOfValues(1.5f, 8.7f, 6.8f, 4.5f, 5.6f, 1.1f) + "\n");
		System.out.println("The maximum value between the three string is : " + maxOfValues("Apple", "Banana", "Peach", "Orange", "Mango", "Lime"));
	}
}

