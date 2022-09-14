import java.io.*;


class StringXXXXX
{

	public static void main(String args[])
	{

		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello");

		if(str1==str3)
		{
			System.out.println("String are Same");

		}
		else
		{
			System.out.println("String Are Different");
		}


		if(str1.equals(str3))
			{
			System.out.println("String are Same");

		}
		else
		{
			System.out.println("String Are Different");
		}

	}
}