//import java.lang.*;
import java.util.*;


class Exception2
{
	public static void main(String args[])
	{
		int ans=0,no1=0,no2=0;

		Scanner sobj=new Scanner(System.in);

		System.out.println("Please Enter First Number:");
		no1=sobj.nextInt();

		System.out.println("Please Enter Second Number:");
		no2=sobj.nextInt();
		
		try
		{
		 ans=no1/no2;  //Exception Prone code
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Exception occured as :"+obj);
		}
		finally
		{
		 sobj.close();	//resources Release 
		}

		System.out.println("Division is :"+ans);

		
	}
}