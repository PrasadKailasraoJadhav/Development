import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
	public Frame fobj;
	public MarvellousFrame(String name)
	{

		fobj=new Frame(name);
		fobj.setSize(300,300);
		fobj.setVisible(true);

		fobj.addWindowListener(new MarvellousListener());

	}
}

class MarvellousListener extends WindowAdapter //implements WindowListener
{
	
	 public void windowClosing(WindowEvent obj)
	 {
	 	System.exit(0);
	 }
	 
}
class FrameDemo4
{
	public static void main(String args[])
	{

		System.out.println("Print Data on Console");

		MarvellousFrame mobj=new MarvellousFrame("PPA");
		
	}
}