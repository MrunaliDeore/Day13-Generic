package Thirteen;

public class maximumTest<T extends Comparable<T>>
{
	T x, y, z;
	
	public maximumTest(T x, T y, T z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}	
	public T maximum()
	{
		return maximumTest.maximum(x, y, z);
	}
	public static  <T extends Comparable<T>> T maximum (T x, T y, T z)
	{
		T max = x;
		if(y.compareTo(max)>0)
		{
			max = y;
		}
		if(z.compareTo(max)>0)
		{
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	public static String testMaximum(String x, String y, String z)
	{
		String max = x;
		if(y.compareTo(max)>0)
		{
			max = y;
		}
		if(z.compareTo(max)>0)
		{
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	public static <T> void printMax(T x, T y, T z, T max)
	{
		System.out.printf("%s %s %s Max is: %s\n", x, y, z, max);
	}
	public static void main(String[] args)
	{
		Integer xInt=3, yInt=6, zInt=8;
		Float xFl=3.5f, yFl=6.2f, zFl=8.1f;
		String xStr="Apple", yStr="Orange", zStr="Mango";
		
		maximumTest.testMaximum(xStr, yStr, zStr);
		new maximumTest(xInt, yInt, zInt).maximum();
		new maximumTest(xFl, yFl, zFl).maximum();
		new maximumTest(xStr, yStr, zStr).maximum();
		
	}
}
