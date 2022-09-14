import java.lang.Exception;
import java.util.*;

class AgeInvalid extends Exception
{

	public AgeInvalid(String str)
	{
		super(str);
	}
}

class Exception5
{
	public static void main(String args[])
	{
		
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter age ");
		int age=sobj.nextInt();
		try
		{
			if(age<18)
			{
				throw new AgeInvalid("Age is bellow 18");
			}
		}
		catch(AgeInvalid obj)
		{
			System.out.println("inside Catch");
			System.out.println(obj);
		}
	}
}