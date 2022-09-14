
//Wrong code 


import java.lang.*;
import java.awt.*;
import java.awt.event.*;

//Addition Program

class Arithmatic extends WindowAdapter implements ActionListener
{
	public Frame fobj;
	public Button bobj;
	public TextField tobj1;
	public TextField tobj2;



	public Arithmatic(String name)
	{

		fobj=new Frame(name);
		bobj=new Button("Addition");
		tobj1=new TextField();
		tobj2=new TextField();

		tobj1.setBounds(60,60,170,20);
		tobj2.setBounds(70,70,170,20);
		bobj.setBounds(110,130,90,20);


		fobj.add(bobj);
		fobj.add(tobj1);
		fobj.add(tobj2);


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
	 	
	 	tobj1.getText();
	 	tobj2.getText();
	 }
}

class FrameDemo6
{
	public static void main(String args[])
	{

		System.out.println("Print Data on Console");

		Arithmatic aobj=new Arithmatic("PPA");
		
	}
}