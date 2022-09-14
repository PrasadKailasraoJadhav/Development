
import java.lang.*;
import java.util.*;

class Input
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Please enter your Name");
		String Name=sobj.nextLine();

		System.out.println("Please enter your Age");
		int Age=sobj.nextInt();

		System.out.println("Please enter your Percentage");
		float Percentage =sobj.nextFloat();

		System.out.println("Your Name       :"+Name);
		System.out.println("Your Age        :"+Age);
		System.out.println("Your Percentage :"+Percentage);
	}

}