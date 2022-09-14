//import java.lang.*;
import java.util.*;


class Exception1
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Please enter First Number:");
		int no1=sobj.nextInt();

		System.out.println("Please enter Second Number:");
		int no2=sobj.nextInt();

		int ans=no1/no2; ///Exception 

		System.out.println("Division is :"+ans);


	}
}