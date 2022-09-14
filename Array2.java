import java.lang.*;
import java.util.*;

class Array2
{
	public static void main(String args[])
	{
		int iCnt=0;

		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number of Elements:");
		int size=sobj.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter Elements of Array :");

		for(iCnt=0;iCnt<arr.length;iCnt++)
		{
 			arr[iCnt]=sobj.nextInt();

		}

		System.out.println("Enter if array are :");
		for(iCnt=0;iCnt<arr.length;iCnt++)
		{
		System.out.println(arr[iCnt]);

		}


		}
}
