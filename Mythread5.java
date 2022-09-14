import java.lang.*;

class Demo extends Thread
{

	public void run()//Running State
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("value of i:"+i);
			try
			{
			Thread.sleep(1000);//Waiting State
			}
			catch(Exception obj)
			{}
		}
	}
}


class Mythread5
{

	public static void main(String args[])throws Exception
	{
		Demo obj1=new Demo();
		Thread t1 =new Thread(obj1,"First");// new State

		Demo obj2=new Demo();
		Thread t2 =new Thread(obj2,"Second");// new State

		t1.start();//Runable State

		t1.join();  //

		t2.start();//Runable State


		//Dead State

	}
}