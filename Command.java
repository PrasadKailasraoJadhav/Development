import java.lang.*;

class Command
{
	public static void main(String arg[])
	{
		System.out.println("Numbe r of cmd argumrnt aren:"+arg)
		System.out.println("First Number is :"+arg[0]);
		System.out.println("Second Number is :"+arg[1]);

		int ans=Integer.parseInt(arg[0])+Integer.parseInt(arg[1]);

		System.out.println("Addition is :"+ans);
	}
}