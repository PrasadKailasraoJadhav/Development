import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class Demo//Backend class
{

	public String DataDe()
	{
		return "jay Bhavni";
	}
}

class MarvellousFrame extends WindowAdapter implements ActionListener
{
	public Frame fobj;
	public Button bobj;
	public TextField tobj;



	public MarvellousFrame(String name)
	{

		fobj=new Frame(name);
		bobj=new Button("Marvellous");
		tobj=new TextField();

		tobj.setBounds(60,60,170,20);
		bobj.setBounds(110,130,90,20);


		fobj.add(bobj);
		fobj.add(tobj);

		fobj.setSize(300,300);
		fobj.setVisible(true);
		fobj.setLayout(null);

		bobj.addActionListener(this);
		fobj.addWindowListener(this);

	}

	 public void windowClosing(WindowEvent obj)
	 {
	 	System.exit(0);
	 }

	 public void actionPerformed(ActionEvent obj)
	 {
	 	Demo dobj=new Demo();//Backend
	 	String str=dobj.DataDe();//Backend
	 	
	 	tobj.setText("Jay Bhavani");
	 }
}

class FrameDemo5
{
	public static void main(String args[])
	{

		System.out.println("Print Data on Console");

		MarvellousFrame mobj=new MarvellousFrame("PPA");
		
	}
}