package Thirteen;


public class printMaximum 
{
	public static String toPrint(String s1, String s2, String s3)
	{
		String max = s1;
		if (s2.compareTo(max) > 0)
			max = s2;
		if (s3.compareTo(max) > 0)
			max = s3;
		return max;
	}


	public static void main(String[] args)
	{  
		System.out.println("The Maximum String is: " + toPrint("Apple", "Peach","Banana")+ "\n");
	}  

}


