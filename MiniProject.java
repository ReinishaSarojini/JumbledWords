import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.lang.Thread;
import java.sql.*;
class MyFrame3 extends JFrame
{
public static int score=0;
	String ans="";
	JLabel j1;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8;
	JButton bt0,bt1;
	JTextField f1;
	MyFrame3()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
		setTitle("Level 1");
construct();
		design();
		handleEvent();
	}
	public void construct()
	{
j1=new JLabel();
		f1=new JTextField(10);
		b0=new JButton("D ");
		b1=new JButton("P"+"");
		b2=new JButton("O"+"");
		b3=new JButton("V"+"");
		b4=new JButton("E"+"");
		b5=new JButton("E"+"");
		b6=new JButton("L"+"");
		b7=new JButton("Check");
		b8=new JButton("Clear");
		bt0=new JButton("<=");
		bt1=new JButton("=>");
		}
	public void design()
	{
		setLayout(null);
		b0.setBounds(500,150,50,50);
		b1.setBounds(550,150,50,50);
		b2.setBounds(600,150,50,50);
		b3.setBounds(650,150,50,50);
		b4.setBounds(700,150,50,50);
		b5.setBounds(750,150,50,50);
		b6.setBounds(800,150,50,50);
		b7.setBounds(500,300,100,30);
		f1.setBounds(500,250,350,30);
		b8.setBounds(700,300,100,30);
		bt0.setBounds(500,350,50,50);
		bt1.setBounds(800,350,50,50);
		j1.setBounds(500,400,900,500);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(f1);
		add(bt0);
		add(bt1);
		add(j1);
		}
public void handleEvent()
	{
		b0.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"D";
			f1.setText(ans);
		} 
}
 );
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"P";
			f1.setText(ans);
		}
}
);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"O";
			f1.setText(ans);
		}
}
);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"V";
			f1.setText(ans);
		}
 } 
);
		b4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			f1.setText(ans);
		} 
}
 );
		b5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			f1.setText(ans);
		} 
} 
);
		b6.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"L";
			f1.setText(ans);
		}
 }
 );
		b7.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=f1.getText();
			if(r.contains("DEVELOP"))
			{
				setBackground(Color.GREEN);
				j1.setText("Correct Answer");
				j1.setFont(new Font("BOLD",50,50));
				MyFrame3.score+=10;
			}
			else
			{
				j1.setText("Wrong Answer");
				j1.setFont(new Font("BOLD",50,50));
			} 
} 
} 
);
		
		b8.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			f1.setText(ans);
		}
		}
		);
		bt0.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			MyFrame1 f=new MyFrame1();
		}
		}
		);
		bt1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level12 l=new Level12();
		}
		}
		);
	}
}
class Level12 extends JFrame
{
	String ans="";
	JTextField t1;
	JButton[] b;
	JLabel l1;
	Level12()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    	             Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
                          setTitle("Level 2");
                          construct();
                           design();
		handleEvent();
	}
	public void construct()
	{
		b=new JButton[11];
		b[0]=new JButton("O"+"");
		b[1]=new JButton("I"+"");
		b[2]=new JButton("T"+"");
		b[3]=new JButton("N"+"");
		b[4]=new JButton("G"+"");
		b[5]=new JButton("N"+"");
		b[6]=new JButton("H"+"");
		b[7]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		t1=new JTextField(10);
		 l1=new JLabel();
		}
	public void design()
	{
		setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		b[6].setBounds(800,150,50,50);
		b[7].setBounds(500,300,100,30);
		t1.setBounds(500,250,350,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
		add(b[7]);
		add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);
	}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"O";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"I";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"T";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"N";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"G";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"N";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"H";
			t1.setText(ans);
		}
		}
		);
	    b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
		b[7].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			
			if(r.contains("NOTHING"))
			{
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
				MyFrame3.score+=10;
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	    b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			MyFrame3 h=new MyFrame3();
		}
		}
		);
		b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level13 l=new Level13();
		}
		}
		);
		}
}
class Level13 extends JFrame
{
	String ans="";
	JTextField t1;
	JButton[] b;
	JLabel l1;
	Level13()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    	  	Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
        		setTitle("Level 1");
       		 construct();
       		 design();
		handleEvent();
	}
	public void construct()
	{
		b=new JButton[13];
		b[0]=new JButton("E"+"");
		b[1]=new JButton("I"+"");
		b[2]=new JButton("R"+"");
		b[3]=new JButton("T"+"");
		b[4]=new JButton("U"+"");
		b[5]=new JButton("P"+"");
		b[6]=new JButton("C"+"");
		b[7]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		b[11]=new JButton("R");
		b[12]=new JButton("S");
		 t1=new JTextField(10);
		 l1=new JLabel();
		}
	public void design()
	{
       	setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		b[6].setBounds(800,150,50,50);
		b[11].setBounds(850,150,50,50);
		b[12].setBounds(900,150,50,50);
		b[7].setBounds(500,300,100,30);
		t1.setBounds(500,250,350,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
		add(b[7]);
		add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);
		add(b[11]);
		add(b[12]);
	}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"I";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"R";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"T";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"U";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"P";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"C";
			t1.setText(ans);
		}
		}
		);
	    b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
				
		b[11].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"R";
			t1.setText(ans);
		}
		}
		);
		b[12].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"S";
			t1.setText(ans);
		}
		}
		);
		
		b[7].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			
			if(r.contains("SCRIPTURE"))
			{
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
				MyFrame3.score+=10;
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	    b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level12 l=new Level12();
		}
		}
		);
		b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level14 l1=new Level14();
		}
		}
		);
		
	}
}
class Level14 extends JFrame
{
	String ans="";
	JPanel p1,p2,p3,p4;
	JTextField t1;
	JButton[] b;
	JLabel l1;
	Level14()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
        		setTitle("Level 1");
       		 construct();
        		design();
		handleEvent();
	}
	public void construct()
	{
		b=new JButton[11];
		b[0]=new JButton("R"+"");
		b[1]=new JButton("L"+"");
		b[2]=new JButton("A"+"");
		b[3]=new JButton("E"+"");
		b[4]=new JButton("I"+"");
		b[5]=new JButton("N"+"");
		b[6]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		 t1=new JTextField(10);
		 l1=new JLabel();
		}
	public void design()
	{
		setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		b[6].setBounds(500,300,100,30);
		t1.setBounds(500,250,350,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
		\add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);
	}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"R";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"L";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"A";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"I";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"N";
			t1.setText(ans);
		}
		}
		);
		
	    b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			
			if(r.contains("LINEAR"))
			{
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
				MyFrame3.score+=10;
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	    b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level13 l=new Level13();
		}
		}
		);
		b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level15 l=new Level15();
		}
		}
		);
		}
}	
class Level15 extends JFrame
{
	String ans="";
	JTextField t1;
	JButton[] b;
	JLabel l1;
	int i,s;
	String p,name;
	Connection con;
	Statement st,ts;
	ResultSet rs;
	Level15()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
        		setTitle("Level 1");
       		 construct();
        		design();
		handleEvent();
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
					           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","We!cOme@12#");
					    st=con.createStatement(ResultSet.TYPE_SCROLL_
INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ts=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void construct()
	{
		b=new JButton[11];
		b[0]=new JButton("O"+"");
		b[1]=new JButton("M"+"");
		b[2]=new JButton("M"+"");
		b[3]=new JButton("N"+"");
		b[4]=new JButton("T"+"");
		b[5]=new JButton("E"+"");
		b[6]=new JButton("E"+"");
		b[7]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		t1=new JTextField(10);
		l1=new JLabel();
		
	}
	public void design()
	{
       setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		b[6].setBounds(800,150,50,50);
		b[7].setBounds(500,300,100,30);
		t1.setBounds(500,250,350,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
		add(b[7]);
		add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);
	}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"O";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"M";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"M";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"N";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"T";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
	    b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
		b[7].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			
			if(r.contains("MEMENTO"))
			{
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
				MyFrame3.score+=10;
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	    b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level14 l1=new Level14();
		}
		}
		);
		b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			 try
		  {		  
			makeConnection();
			rs=st.executeQuery("select * from register");
			
			JOptionPane.showMessageDialog(null,"Your Current Score is "+MyFrame3.score+" . ");
			while(rs.next())
			{
if(Login.id.contains(rs.getInt(3)+""))
				{
					i=rs.getInt(3);
			  	    	s=rs.getInt(4)+MyFrame3.score;
					p=rs.getString(2);
					name=rs.getString(1);
		ts.executeUpdate("delete from register where id="+i+"");
					ts.executeUpdate("insert into register values('"+name+"','"+p+"',"+i+","+s+")");
				
			    }
			}
		}
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
			MyFrame1 h=new MyFrame1();
		}
		}
		);
		
		
	}
	
	
}	
class Level21 extends JFrame
{
	String ans="";
	JTextField t1;
	JButton[] b;
	JLabel l1;
	Level21()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
        		setTitle("Level 1");
        		construct();	
	    	design();
		handleEvent();
	}
	public void construct()
	{
		b=new JButton[13];
		b[0]=new JButton("E"+"");
		b[1]=new JButton("D"+"");
		b[2]=new JButton("E"+"");
		b[3]=new JButton("T"+"");
		b[4]=new JButton("F"+"");
		b[5]=new JButton("V"+"");
		b[6]=new JButton("C"+"");
		b[7]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		b[11]=new JButton("I"+"");
		b[12]=new JButton("E"+"");
		t1=new JTextField(10);
		l1=new JLabel();
		}
	public void design()
	{
		setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		b[6].setBounds(800,150,50,50);
		b[11].setBounds(850,150,50,50);
		b[12].setBounds(900,150,50,50);
		b[7].setBounds(500,300,100,30);
		t1.setBounds(500,250,350,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
		add(b[7]);
		add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);
		add(b[11]);
		add(b[12]);
	}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"D";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"T";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"F";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"V";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"C";
			t1.setText(ans);
		}
		}
		);
	    b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
				
		b[11].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"I";
			t1.setText(ans);
		}
		}
		);
		b[12].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		
		b[7].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			
			if(r.contains("DEFECTIVE"))
			{
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
				MyFrame3.score+=10;
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	    b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			MyFrame1 h=new MyFrame1();
		}
		}
		);
		b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level22 l=new Level22();
		}
		}
		);
		
	}
}
class Level22 extends JFrame
{
	String ans="";
	
	JTextField t1;
	JButton[] b;
	JLabel l1;
	Level22()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
        		setTitle("Level 2");
       		 construct();	
		design();
		handleEvent();
	}
	public void construct()
	{
		b=new JButton[11];
		b[0]=new JButton("O"+"");
		b[1]=new JButton("L"+"");
		b[2]=new JButton("L"+"");
		b[3]=new JButton("N"+"");
		b[4]=new JButton("Y"+"");
		b[5]=new JButton("E"+"");
		b[6]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		t1=new JTextField(10);
		l1=new JLabel();
		
	}
	public void design()
	{
		setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		t1.setBounds(500,250,350,30);
		b[6].setBounds(500,300,100,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);

		add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);
		}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"O";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"L";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"L";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"N";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"Y";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			if(r.contains("LONELY"))
			{
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
				MyFrame3.score+=10;
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	    b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level21 a=new Level21();
		}
		}
		);
		b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
		    Level23 a=new Level23();	
		}
		}
		);
		}
}
class Level23 extends JFrame
{
	String ans="";
	JTextField t1;
	JButton[] b;
	JLabel l1;
	Level23()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
        		setTitle("Level 2");
       		 construct();
       		 design();
		handleEvent();
	}
	public void construct()
	{
		b=new JButton[11];
		b[0]=new JButton("E"+"");
		b[1]=new JButton("P"+"");
		b[2]=new JButton("C"+"");
		b[3]=new JButton("S"+"");
		b[4]=new JButton("I"+"");
		b[5]=new JButton("R"+"");
        b[6]=new JButton("E"+"");
		b[7]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		t1=new JTextField(10);
		l1=new JLabel();
		
	}
	public void design()
	{
		setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		b[6].setBounds(800,150,50,50);
		b[7].setBounds(500,300,100,30);
		t1.setBounds(500,250,350,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
		add(b[7]);
		add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);
	}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"P";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"C";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"S";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"I";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"R";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
		b[7].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			
			if(r.contains("PRECISE"))
			{
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
				MyFrame3.score+=10;
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	    b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level22 a=new Level22();
		}
		}
		);
		b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
		    Level24 a=new Level24();	
		}
		}
		);
		}
}
class Level24 extends JFrame
{
	String ans="";
	JTextField t1;
	JButton[] b;
	JLabel l1;
	Level24()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
        		setTitle("Level 2");
        		construct();
        		design();
		handleEvent();
	}
	public void construct()
	{
		b=new JButton[15];
		b[0]=new JButton("O"+"");
		b[1]=new JButton("D"+"");
		b[2]=new JButton("R"+"");
		b[3]=new JButton("N"+"");
		b[4]=new JButton("M"+"");
		b[5]=new JButton("E"+"");
b[6]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		t1=new JTextField(10);
		l1=new JLabel();
		}
	public void design()
	{
		setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		t1.setBounds(500,250,350,30);
		b[6].setBounds(500,300,100,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);
		}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"O";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"D";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"R";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"N";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"M";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		
	    b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			
			if(r.contains("MODERN"))
			{
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
				MyFrame3.score+=10;
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	    b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level23 a=new Level23();
		}
		}
		);
		b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
		    Level25 a=new Level25();	
		}
		}
		);
		}
}
class Level25 extends JFrame
{
	String name,p;
	int i,s;
	String ans="";
	JPanel p1,p2,p3,p4;
	JTextField t1;
	JButton[] b;
	JLabel l1;
	ResultSet rs;
	Statement st,ts;
	Connection con;
	Level25()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
        		setTitle("Level 2");
        		construct();
        		design();
		handleEvent();
	}
	public void makeConnection()
	{
try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","We!cOme@12#");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ts=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void construct()
	{
		b=new JButton[15];
		b[0]=new JButton("E"+"");
		b[1]=new JButton("P"+"");
		b[2]=new JButton("U"+"");
		b[3]=new JButton("S"+"");
		b[4]=new JButton("T"+"");
		b[5]=new JButton("S"+"");
       	          b[6]=new JButton("C"+"");
		b[7]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		 t1=new JTextField(10);
		 l1=new JLabel();
}
	public void design()
	{
		setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		b[6].setBounds(800,150,50,50);
		b[7].setBounds(500,300,100,30);
		t1.setBounds(500,250,350,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
		add(b[7]);
		add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);
	}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"P";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"U";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"S";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"T";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"S";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"C";
			t1.setText(ans);
		}
		}
		);
		
	    b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
		b[7].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			
			if(r.contains("SUSPECT"))
			{
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
				MyFrame3.score+=10;
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	    b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
            Level24 a=new Level24();
		}
		}
		);
		b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			try
		  {		  
			makeConnection();
			rs=st.executeQuery("select * from register");
			
			JOptionPane.showMessageDialog(null,"Your Current Score is "+MyFrame3.score+" . ");
			while(rs.next())
			{
				if(Login.id.contains(rs.getInt(3)+""))
				{
					i=rs.getInt(3);
			  	          s=rs.getInt(4)+MyFrame3.score;
					p=rs.getString(2);
					name=rs.getString(1);
					ts.executeUpdate("delete from register where id="+i+"");
					ts.executeUpdate("insert into register values('"+name+"','"+p+"',"+i+","+s+")");
				 }
			       }
			    }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
			MyFrame1 h=new MyFrame1();		    	
		}
		}
		);
		}
	}
class Level31 extends JFrame
{
	String ans="";
	JPanel p1,p2,p3,p4;
	JTextField t1;
	JButton[] b;
	JLabel l1;
	Level31()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
       		setTitle("Level 3");
        		construct();
       	          design();
		handleEvent();
	}
	public void construct()
	{
		b=new JButton[17];
		b[0]=new JButton("P"+"");
		b[1]=new JButton("E"+"");
		b[2]=new JButton("K"+"");
		b[3]=new JButton("A"+"");
		b[4]=new JButton("M"+"");
		b[5]=new JButton("E"+"");
		b[6]=new JButton("C"+"");
		b[15]=new JButton("A"+"");
		b[16]=new JButton("R"+"");
		b[7]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		 t1=new JTextField(10);
		 l1=new JLabel();
		
	}
	public void design()
	{
		setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		b[6].setBounds(800,150,50,50);
		b[15].setBounds(850,150,50,50);
		b[16].setBounds(900,150,50,50);
		b[7].setBounds(500,300,100,30);
		t1.setBounds(500,250,350,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
		add(b[7]);
		add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);
		add(b[15]);
		add(b[16]);
	}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"P";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"K";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"A";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"M";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"C";
			t1.setText(ans);
		}
		}
		);
	    b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
				
		b[15].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"A";
			t1.setText(ans);
		}
		}
		);
		b[16].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"R";
			t1.setText(ans);
		}
		}
		);
		
		b[7].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			
			if(r.contains("PACEMAKER"))
			{
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
				MyFrame3.score+=10;
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	    b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			MyFrame1 h=new MyFrame1();
		}
		}
		);
		b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level32 l=new Level32();
		}
		}
		);
		}
}
class Level32 extends JFrame
{
	String ans="";
	JTextField t1;
	JButton[] b; 
	JLabel l1;
	JPanel p1,p2,p3,p4;
	Level32()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
        		setTitle("Level 3");
        		construct();
	    	design();
		handleEvent();
	}
	public void construct()
	{
		b=new JButton[15];
		b[0]=new JButton("E"+"");
		b[1]=new JButton("E"+"");
		b[2]=new JButton("L"+"");
		b[3]=new JButton("U"+"");
		b[4]=new JButton("A"+"");
		b[5]=new JButton("G"+"");
		b[6]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		 t1=new JTextField(10);
		 l1=new JLabel();
		 }
	public void design()
	{
		setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		b[6].setBounds(500,300,100,30);
		t1.setBounds(500,250,350,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
		add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);		
		}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"L";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"U";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"A";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"G";
			t1.setText(ans);
		}
		}
		);
		
	    b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			if(r.contains("LEAGUE"))
			{
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
			    MyFrame3.score+=10;
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	    b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level31 a=new Level31();	
		}
		}
		);
		b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
		    Level33 a=new Level33();	
		}
		}
		);
		
	}
	
	
}
class Level33 extends JFrame
{
	String ans="";
	JTextField t1;
	JButton[] b;
	JLabel l1;
	Level33()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
        		setTitle("Level 3");
        		construct();
        		design();
		handleEvent();
		JPanel p1,p2,p3,p4;
	}
	public void construct()
	{
		b=new JButton[15];
		b[0]=new JButton("E"+"");
		b[1]=new JButton("P"+"");
		b[2]=new JButton("M"+"");
		b[3]=new JButton("R"+"");
		b[4]=new JButton("I"+"");
		b[5]=new JButton("R"+"");
        b[6]=new JButton("E"+"");
		b[7]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		t1=new JTextField(10);
		 l1=new JLabel();
		}
	public void design()
	{
		setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		b[6].setBounds(800,150,50,50);
		b[7].setBounds(500,300,100,30);
		t1.setBounds(500,250,350,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
		add(b[7]);
		add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);		
	}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"P";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"M";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"R";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"I";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"R";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		
	    b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
		b[7].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			
			if(r.contains("PREMIER"))
			{
				MyFrame3.score+=10;
				//this.setBackground(Color.GREEN);
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	          b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
		    Level32 a=new Level32();	
		}
		}
		);
	    b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
            Level34 n=new Level34();
		}
		}
		);
}
}
class Level34 extends JFrame
{
	String ans="";
	JPanel p1,p2,p3,p4;
	JTextField t1;
	JButton[] b;
	JLabel l1;
	Level34()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
        		setTitle("Level 3");
        		construct();
        		design();
		handleEvent();
	}
	public void construct()
	{
		b=new JButton[15];
		b[0]=new JButton("I"+"");
		b[1]=new JButton("E"+"");
		b[2]=new JButton("T"+"");
		b[3]=new JButton("B"+"");
		b[4]=new JButton("R"+"");
		b[5]=new JButton("L"+"");
        		b[6]=new JButton("Y"+"");
		b[7]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		 t1=new JTextField(10);
		 l1=new JLabel();
	}
	public void design()
	{
		setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		b[6].setBounds(800,150,50,50);
		b[7].setBounds(500,300,100,30);
		t1.setBounds(500,250,350,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
		add(b[7]);
		add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);			
	}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"I";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"T";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"B";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"R";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"L";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"Y";
			t1.setText(ans);
		}
		}
		);
		 b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
		b[7].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			
			if(r.contains("LIBERTY"))
			{
				MyFrame3.score+=10;
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
		b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level32 a=new Level32();
		}
		}
		);
	    b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Level35 m=new Level35();
		}
		}
		);
	    }
	}
class Level35 extends JFrame
{
	String query="";
	String name,p;
	int s,i;
	String ans="";
	JPanel p1,p2,p3,p4;
	JTextField t1;
	JButton[] b;
	JLabel l1;
	Connection con;
	ResultSet rs;
	Statement st,ts;
	Level35()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
    		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
        setTitle("Level 3");
        construct();
        design();
		handleEvent();
	}
	public void makeConnection()
	{
		try
		{
Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","We!cOme@12#");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ts=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void construct()
	{
		b=new JButton[15];
		b[0]=new JButton("E"+"");
		b[1]=new JButton("E"+"");
		b[2]=new JButton("E"+"");
		b[3]=new JButton("S"+"");
		b[4]=new JButton("S"+"");
		b[5]=new JButton("N"+"");
       		 b[6]=new JButton("C"+"");
		b[7]=new JButton("Check"+"");
		b[8]=new JButton("Clear"+"");
		b[9]=new JButton("<=");
		b[10]=new JButton("=>");
		 t1=new JTextField(10);
		 l1=new JLabel();
		}
	public void design()
	{
		setLayout(null);
		b[0].setBounds(500,150,50,50);
		b[1].setBounds(550,150,50,50);
		b[2].setBounds(600,150,50,50);
		b[3].setBounds(650,150,50,50);
		b[4].setBounds(700,150,50,50);
		b[5].setBounds(750,150,50,50);
		b[6].setBounds(800,150,50,50);
		b[7].setBounds(500,300,100,30);
		t1.setBounds(500,250,350,30);
		b[8].setBounds(700,300,100,30);
		b[9].setBounds(500,350,50,50);
		b[10].setBounds(800,350,50,50);
		l1.setBounds(500,400,900,500);
		add(b[0]);
		add(b[1]);
		add(b[2]);
		add(b[3]);
		add(b[4]);
		add(b[5]);
		add(b[6]);
		add(b[7]);
		add(b[8]);
		add(t1);
		add(l1);
		add(b[9]);
		add(b[10]);		
	}
	public void handleEvent()
	{
		b[0].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[1].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[2].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"E";
			t1.setText(ans);
		}
		}
		);
		b[3].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"S";
			t1.setText(ans);
		}
		}
		);
		b[4].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"S";
			t1.setText(ans);
		}
		}
		);
		b[5].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"N";
			t1.setText(ans);
		}
		}
		);
		b[6].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans=ans+"C";
			t1.setText(ans);
		}
		}
		);
		 b[8].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			ans="";
			t1.setText(ans);
		}
		}
		);
		b[7].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			String r=t1.getText();
			
			if(r.contains("ESSENCE"))
			{
				MyFrame3.score+=10;
				l1.setText("Correct Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
			else
			{
				l1.setText("Wrong Answer");
				l1.setFont(new Font("BOLD",50,50));
			}
		}
		}
		);
	    	b[9].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
		    Level34 a=new Level34();	
		}
		}
		);
		 b[10].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
		  try
		  {		  
			makeConnection();
			rs=st.executeQuery("select * from register");
			
			JOptionPane.showMessageDialog(null,"Your Current Score is "+MyFrame3.score+" . ");
			while(rs.next())
			{
				if(Login.id.contains(rs.getInt(3)+""))
				{
				    i=rs.getInt(3);
			  	    s=rs.getInt(4)+MyFrame3.score;
				    p=rs.getString(2);
				    name=rs.getString(1);
				   ts.executeUpdate("delete from register where id="+i+"");
				   ts.executeUpdate("insert into register values('"+name+"','"+p+"',"+i+","+s+")");
			}
		     }
		}
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
			MyFrame1 h=new MyFrame1();
		}
		}
		);
}
}
class MyFrame1 extends JFrame
{
	JPanel p2;
	JButton bt1,bt2,bt3,bt4,bt5;
	MyFrame1()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
		setTitle("Jumbled Words");
		bt5=new JButton("View Profile");
		bt1=new JButton("Level 1");
		bt2=new JButton("Level 2");
		bt3=new JButton("Level 3");
		bt4=new JButton("Go Back");
		p2=new JPanel();
		p2.add(bt5);
		p2.add(bt1);
		p2.add(bt2);
		p2.add(bt3);
		p2.add(bt4);
         p2.setLayout(new FlowLayout(FlowLayout.CENTER,1000,25));
		add(p2);
		handleEvent();
	}
	public void handleEvent()
	{
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
				MyFrame3 f=new MyFrame3();
			}
		}
		);
		bt5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
				Profile p=new Profile();
			}
		}
		);
		bt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
				Level21 f=new Level21();
			}
		}
		);
		bt3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
				Level31 f=new Level31();
			}
		}
		);
		bt4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
				MyFrame f1=new MyFrame();
			}
		}
		);
	}
}
class Login extends JFrame
{
	static String id="";
	
	MyFrame1 s;
	Connection con;
	Statement st;
	ResultSet rs,rs1;
	JPanel p2;
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField f1;
	JButton bt2,bt3;
	Login()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
		setTitle("Login Page");
	    	construct();
		design();
		try{
		handleEvent();
		}
		catch(Exception e)
		{
		}
	}
	 public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","We!cOme@12#");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	 public void construct()
	 {
		
		bt2=new JButton("Register");
		bt3=new JButton("Sign In");
		t1=new JTextField(20);
		l3=new JLabel();
		l2=new JLabel("Password");
		l1=new JLabel("User ID");
		f1=new JPasswordField();
	 }
	 public void design()
	 {
		 setLayout(null);
		 l1.setBounds(500,200,100,30);
		 t1.setBounds(650,200,100,30);
		 l2.setBounds(500,250,100,30);
		 f1.setBounds(650,250,100,30);
		 bt2.setBounds(500,300,100,30);
		 bt3.setBounds(650,300,100,30);
		 l3.setBounds(500,350,20,100);
		 add(l1);
		 add(t1);
		 add(l2);
		 add(f1);
		 add(bt2);
		 add(bt3);
		 add(l3);
	 }
	 public void handleEvent() 
	{
		bt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
				Register f=new Register();
			}
		}
		);
		bt3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
				int flag=0;
				makeConnection();
		     		try
				{
					
					rs=st.executeQuery("select * from register ");
					while(rs.next())
					{
						
						if(t1.getText().trim().contains(rs.getInt(3)+"")&&rs.getString(2).contains(f1.getText().trim()))
					    {		id=t1.getText();
				            	s=new MyFrame1();
					            
								flag=1;
						}
					}						
					if(flag==0)
					{
						JOptionPane.showMessageDialog(null,"Login Invalid");
					}
					}
				catch(Exception e)
				{
					System.out.println(e);
				}
				}
		}
		);
	}
}
class Profile extends JFrame
{
	JTextField t1;
	Connection con;
	ResultSet rs;
	Statement st;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JButton b1,b2,b3,b4,b5,b6,b7;
	static String code="";
	Profile()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
		setTitle("Profile");
	    	makeConnection();
		construct();
		b4.setEnabled(false);
		design();
		handleEvent();
	}
	public void construct()
	{
		String s1;
		String s2,s3;
		b1=new JButton("Users");
		b2=new JButton("Share Knowledge");
		b3=new JButton("Back");
		b4=new JButton("Play");
		b5=new JButton("Responses");
		b6=new JButton("Change Password");
		b7=new JButton("Logout");
		l10=new JLabel("Responses");
		l11=new JLabel("Change Password");
		l12=new JLabel("Logout");
	 l1=new JLabel("Name :");
	 l3=new JLabel("User ID :");
	 l5=new JLabel("Total Scores :");
	 l4=new JLabel(Login.id);
	 l7=new JLabel("Users");
	 l8=new JLabel("Share your Knowledge");
	 l9=new JLabel("Enter a code");
	 t1=new JTextField(10);
	 try{
	 rs=st.executeQuery("select * from register ");
	 while(rs.next())
	 {
		 if(Login.id.contains(rs.getInt(3)+""))
		 {
			 s1=rs.getString(1);
			 s2=rs.getInt(4)+"";
			 s3=s2.trim();
			 System.out.println(s2);
	         l2=new JLabel(s1);
	        l6=new JLabel(s3);
		 }
	 }
	 }
	 catch(Exception e)
	 {
	 }
	}
	public void design()
	{
		setLayout(null);
		l1.setBounds(500,150,50,50);
		l2.setBounds(650,150,100,50);
		l3.setBounds(500,200,50,50);
		l4.setBounds(650,200,50,50);
		l5.setBounds(500,240,100,50);
		l6.setBounds(650,245,50,50);
		l7.setBounds(500,300,50,10);
		l8.setBounds(500,350,150,10);
		l9.setBounds(500,400,100,10);
		l10.setBounds(500,450,100,20);
		l11.setBounds(500,500,150,20);
		l12.setBounds(500,550,100,20);
		b1.setBounds(650,300,100,30);
		b2.setBounds(650,350,150,30);
		t1.setBounds(650,400,100,30);
		b4.setBounds(800,400,100,30);
		b5.setBounds(650,450,100,30);
		b6.setBounds(650,500,150,30);
		b7.setBounds(650,550,100,30);
		b3.setBounds(550,600,100,30);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(t1);
		add(l10);
		add(l11);
		add(l12);
	}
	public void handleEvent()
	{
		 t1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent i)
        {
            if(t1.getText().equals(""))
               b4.setEnabled(false);
            else
               b4.setEnabled(true);
             }
     }
   );
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			
			Table t=new Table();
		}
		}
		);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			quiz q=new quiz();
		}
		}
		);
		b7.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Login.id="";
			Login l=new Login();
		}
		}
		);
		b5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Response r=new Response();
		}
		}
		);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			MyFrame1 f=new MyFrame1();
		}
		}
		);
		b4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			code=t1.getText();
			Play p=new Play();
		}
		}
		);
		b6.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Pwd d=new Pwd(); 
		}
		}
		);
	}
	 public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","We!cOme@12#");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Register extends JFrame
{
	static int defvalue=1;
	Connection con;
	Statement st;
	ResultSet rs;
	JLabel l1,l2;
	JTextField t1,f1;
	JButton bt1,bt2;
	Register()
	{
		
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
		setTitle("New Registration");	
		construct();
		design();
		handleEvent();
		}
		 public void construct()
		 {
		bt1=new JButton("Register");
		bt2=new JButton("Back");
		t1=new JTextField(20);
		l2=new JLabel("Set Password");
		l1=new JLabel("Name");
		f1=new JTextField(20);
	 }
	 public void design()
	 {
		 setLayout(null);
		 l1.setBounds(500,200,100,30);
		 t1.setBounds(650,200,100,30);
		 l2.setBounds(500,250,100,30);
		 f1.setBounds(650,250,100,30);
		 bt2.setBounds(650,300,100,30);
		 bt1.setBounds(500,300,100,30);
		 add(bt1);
		 add(bt2);
		 add(l1);
		 add(t1);
		 add(l2);
		 add(f1);
		 
	 }
	 public void handleEvent()
	 {
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a)
			{
				makeConnection();
		        
				try
				{
					
					rs=st.executeQuery("select * from register");
					rs.last();
					defvalue=rs.getInt(3);
                      defvalue=defvalue+1; 
					st.executeUpdate("insert into register values('"+t1.getText()+"','"+f1.getText()+"',"+defvalue+","+MyFrame3.score+")");
					
					//rs=st.executeQuery("select * from register");
					 JOptionPane.showMessageDialog(null,"Your User ID is "+defvalue);
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
			}
		}
        );
        bt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
				Login l=new Login();
			}
		}
		);		
	 }
	 public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","We!cOme@12#");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Table extends JFrame
{
	Connection con;
	Statement st;
	ResultSet rs;
	int count=0;
	JTable t;
	JScrollPane sp;
	Table()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
		setTitle("Users");
		try
		{
		makeConnection();
		rs=st.executeQuery("select * from register");
		while(rs.next())
		{
			count+=1;
		}
		}
		catch(Exception e)
		{
		}
		construct();
	}
	public void construct()
	{
		int i=0;
		String[][] data=new String[count][3];
	   String[] column={"Name","ID","Score"};
	  try{
		  rs=st.executeQuery("select * from register");
		  
	   while(rs.next())
	  {
		
			for(int j=0;j<3;j++)
		    {
				
				if(j==0)
				{
					data[i][j]=rs.getString(1);
				}
				else
				{
					
					data[i][j]=rs.getInt(j+2)+"";
				}
			}
		i++;
	  }
	 
	   t=new JTable(data,column);
	   t.setBounds(10,10,100,100);
	  
	   sp=new JScrollPane(t);
	 //   t.setFillsViewPortHeight(true);
	   add(sp);
	  }
	  catch(Exception e)
	  {
	  }
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","We!cOme@12#");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class quiz extends JFrame
{
	String query="";
	String query1="";
	String query2="";
	String query3="";
	String query4="";
	String query5="";
	static int c=1400;
	String s="";
	int res=-1;
	Connection con;
	ResultSet rs;
	Statement st,ts;
	int i=0;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton b1,b2;
	quiz()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
		setTitle("Share Knowledge");
		construct();
		design();
		handleEvent();
	}
	public void construct()
	{
		
		l1=new JLabel("Share knowledge with your friends ");
		l2=new JLabel("First Question :");
		l3=new JLabel("Answer :");
		l4=new JLabel("Second Question :");
		l5=new JLabel("Answer :");
		l6=new JLabel("Third Question :");
		l7=new JLabel("Answer :");
		l8=new JLabel("Fourth Question :");
		l9=new JLabel("Answer :");
		l10=new JLabel("Fifth Question :");
		l11=new JLabel("Answer :");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		t6=new JTextField(10);
		t7=new JTextField(10);
		t8=new JTextField(10);
		t9=new JTextField(10);
		t10=new JTextField(10);
		b1=new JButton("Get Code");
		b2=new JButton("Back");
	}
		 public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","We!cOme@12#");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ts=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void design()
	{
		setLayout(null);
		l1.setBounds(400,30,350,100);
		l1.setFont(new Font("BOLD",70,20));
		l2.setBounds(400,70,100,100);
		l3.setBounds(400,110,100,100);
		l4.setBounds(400,150,100,100);
		l5.setBounds(400,190,100,100);
		l6.setBounds(400,230,100,100);
		l7.setBounds(400,270,100,100);
		l8.setBounds(400,310,100,100);
		l9.setBounds(400,350,100,100);
		l10.setBounds(400,390,100,100);
		l11.setBounds(400,430,100,100);
		
		t10.setBounds(500,470,100,20);
		t1.setBounds(500,110,100,20);
		t2.setBounds(500,150,100,20);
		t3.setBounds(500,190,100,20);
		t4.setBounds(500,230,100,20);
		t5.setBounds(500,270,100,20);
		t6.setBounds(500,310,100,20);
		t7.setBounds(500,350,100,20);
		t8.setBounds(500,390,100,20);
		t9.setBounds(500,430,100,20);
		b1.setBounds(400,520,100,20);
		b2.setBounds(550,520,100,20);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(b1);
		add(b2);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(t9);
		add(t10);
	}
	public void handleEvent()
	{
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
			Profile p=new Profile();
		}
		}
		);
		
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
	      if(t1.getText()!=""&&t2.getText()!=""&&t3.getText()!=""&&t4.getText()!=""&&t5.getText()!=""&&t6.getText()!=""&&t7.getText()!=""&&t8.getText()!=""&&t9.getText()!=""&&t10.getText()!="")
		  {
		  try
		  {
			
			makeConnection();
			rs=st.executeQuery("select * from quiz");
			while(rs.next())
			{
				i++;
			}
			c=c+i;
			JOptionPane.showMessageDialog(null,"your quiz code is "+c);
			s="quiz"+i;
			st.executeUpdate("insert into quiz values("+c+",'"+s+"',"+Login.id+")");
			
			query="create table "+s+"( question varchar(20) , answer varchar(20) )";
			st.execute(query);
			query1="insert into "+s+" values('"+t1.getText()+"','"+t2.getText()+"')"; 
			st.executeUpdate(query1);
			query2="insert into "+s+" values('"+t3.getText()+"','"+t4.getText()+"')"; 
			st.executeUpdate(query2);
			query3="insert into "+s+" values('"+t5.getText()+"','"+t6.getText()+"')"; 
			st.executeUpdate(query3);
			query4="insert into "+s+" values('"+t7.getText()+"','"+t8.getText()+"')"; 
			st.executeUpdate(query4);
			query5="insert into "+s+" values('"+t9.getText()+"','"+t10.getText()+"')"; 
			st.executeUpdate(query5);
			c++;
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  }
		}
		}
		);
	}
}	
class Play extends JFrame
{
	int i;
	String uname;
	String query="";
	String name="";
	Connection con;
	ResultSet rs,sr;
	Statement st,ts;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4,b5,b6,b7;
	static int score=0;
	Play()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
		setTitle("Enjoy Learning");
		construct();
		design();
		handleEvent();
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","We!cOme@12#");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ts=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void construct()
	{
		l6=new JLabel("Enjoy Learning");
		l7=new JLabel();
		l8=new JLabel();
		l9=new JLabel();
		l10=new JLabel();
		l11=new JLabel();
		makeConnection();
		try
		{
		 
			rs=st.executeQuery("select * from quiz");
			while(rs.next())
			{	
				if(Profile.code.contains(rs.getInt(1)+""))
				{
					name=rs.getString(2);
					i=rs.getInt(3);
                    break;
                }					
		   }
		    query="select * from "+name;
			rs=st.executeQuery(query);
		    rs.first();
		    l1=new JLabel(rs.getString(1));
		    rs.next();
			l2=new JLabel(rs.getString(1));
			rs.next();
			l3=new JLabel(rs.getString(1));
			rs.next();
			l4=new JLabel(rs.getString(1));
			rs.next();
			l5=new JLabel(rs.getString(1));
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		b1=new JButton("check");
		b2=new JButton("check");
		b3=new JButton("check");
		b4=new JButton("check");
		b5=new JButton("check");
		b6=new JButton("Back");
		b7=new JButton("Submit");
	    l12=new JLabel(); 
	}
	public void design()
	{
		setLayout(null);
		l6.setBounds(400,30,350,100);
		l6.setFont(new Font("BOLD",70,20));
		l1.setBounds(400,70,350,100);
		l7.setBounds(700,70,350,100);
		l8.setBounds(700,110,350,100);
		l9.setBounds(700,150,350,100);
		l10.setBounds(700,190,350,100);
		l11.setBounds(700,230,350,100);
		l2.setBounds(400,110,350,100);
		l3.setBounds(400,150,350,100);
		l4.setBounds(400,190,350,100);
		l5.setBounds(400,230,350,100);
		t1.setBounds(500,110,100,30);
		t2.setBounds(500,150,100,30);
		t3.setBounds(500,190,100,30);
		t4.setBounds(500,230,100,30);
		t5.setBounds(500,270,100,30);
		b1.setBounds(600,110,70,20);
		b2.setBounds(600,150,70,20);
		b3.setBounds(600,190,70,20);
		b4.setBounds(600,230,70,20);
		b5.setBounds(600,270,70,20);
		b6.setBounds(400,310,70,20);
		b7.setBounds(600,310,100,20);
		l12.setBounds(500,400,150,40);
		add(b7);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
	}
	public void handleEvent()
	{
		makeConnection();
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
                try
				{
					rs=st.executeQuery(query);
			    	rs.first();
					if(t1.getText().contains(rs.getString(2)))
					{	
						l7.setText("Correct Answer");
						score=score+1;
					}
						
					else
						l7.setText("Wrong Answer");
				}
				catch(Exception e)
				{
				}
			}
		}
		);
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
               Profile p=new Profile();
			}
		}
		);
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
                try
				{
					
			    	rs.next();
					if(t2.getText().contains(rs.getString(2)))
					{	
						l8.setText("Correct Answer");
						score=score+1;
					}
						
					else
						l8.setText("Wrong Answer");
				}
				catch(Exception e)
				{
				}
			}
		}
		);
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
                try
				{

			    	rs.next();
					if(t3.getText().contains(rs.getString(2)))
					{	
						l9.setText("Correct Answer");
						score=score+1;
					}
						
					else
						l9.setText("Wrong Answer");
				}
				catch(Exception e)
				{
				}
			}
		}
		);
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
                try
				{
					
			    	rs.next();
					if(t4.getText().contains(rs.getString(2)))
					{	
						l10.setText("Correct Answer");
						score=score+1;
					}
						
					else
						l10.setText("Wrong Answer");
				}
				catch(Exception e)
				{
				}
			}
		}
		);
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
                try
				{
					rs.next();
			    	
					if(t5.getText().contains(rs.getString(2)))
					{	
				        
						l11.setText("Correct Answer");
						score=score+1;
					}
						
					else
						l11.setText("Wrong Answer");
				}
				catch(Exception e)
				{
				}
			}
		}
		);
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
                try
				{
					sr=ts.executeQuery("select * from register");
				    while(sr.next())
					{
						if(Login.id.contains(sr.getInt(3)+""))
							uname=sr.getString(1);
					}
			    	rs=st.executeQuery("select * from answer");
					st.executeUpdate("insert into answer values("+Profile.code+","+i+",'"+uname+"',"+score+")");
					l12.setText("Your response have been submitted");
				}
				catch(Exception e)
				{
				}
			}
		}
		);
	}
}
class Response extends JFrame
{
	Connection con;
	Statement st;
	ResultSet rs;
	int count=0;
	JTable t;
	JScrollPane sp;
   Response()
  {
	    setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
		setTitle("Responses");
		try
		{
		makeConnection();
		rs=st.executeQuery("select * from answer");
		while(rs.next())
		{
			if(Login.id.contains(rs.getInt(2)+""))
			 count+=1;
		}
		}
		catch(Exception e)
		{
		}
		construct();
  }	 
public void construct()
{  
  int i=0;
		String[][] data=new String[count][3];
	   String[] column={"Code","Name","Score"};
	  try{
		  rs=st.executeQuery("select * from answer");
		  
	   while(rs.next())
	  {
		if(Login.id.contains(rs.getInt(2)+""))
		{	
for(int j=0;j<3;j++)
		    {
				
				if(j==1)
					data[i][j]=rs.getString(j+2);
				if(j==0)
					data[i][j]=rs.getInt(1)+"";
				if(j==2)
					data[i][j]=rs.getInt(4)+"";
				}
		i++;
		}
	  }
	   t=new JTable(data,column);
	   t.setBounds(10,10,100,100);
	  sp=new JScrollPane(t);
	   add(sp);
	  }
	  catch(Exception e)
	  {
	  }
	  }
	  public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","We!cOme@12#");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class MyFrame extends JFrame
{
	JPanel p1;
	JButton b1,b2;
    MyFrame()
	{
		setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
		setTitle("Jumbled Words");
	    setLayout(null);
		ImageIcon bk=new ImageIcon("first.jpg");
		Image img=bk.getImage();
		Image t=img.getScaledInstance(d.width,d.height,Image.SCALE_SMOOTH);
		bk=new ImageIcon(t);
		JLabel back=new JLabel(bk);
		
		back.setBounds(0,0,d.width,d.height);
		
		b1=new JButton("Start");
		b2=new JButton("Exit");
		p1=new JPanel();
		p1.add(b1);
		p1.add(b2);
		add(back);
		add(p1);
		handleEvent();
	}
    public void handleEvent()
	{
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
                Login l1=new Login();
			}
		}
		);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
			    System.exit(0);	
			}
		}
		);
	}
	
 }
class Pwd extends JFrame
{
	String p,name;
	int i,s;
	Connection con;
	Statement st,ts;
	ResultSet rs;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2;
    Pwd()
	{
	    setVisible(true);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
		setTitle("Reset Password");
		construct();
		design();
		handleEvent();		
	}		
	public void construct()
	{
		l1=new JLabel("Old Password");
		l2=new JLabel("New Password");
		l3=new JLabel();
		t1=new JTextField(10);
		t2=new JTextField(10);
		b1=new JButton("Back");
		b2=new JButton("Reset");
	}
	 public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","We!cOme@12#");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ts=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void design()
	{
		setLayout(null);
		l1.setBounds(500,300,150,20);
		l2.setBounds(500,350,150,20);
		l3.setBounds(500,450,200,20);
		t1.setBounds(600,300,100,20);
		t2.setBounds(600,350,100,20);
		b1.setBounds(500,400,70,20);
		b2.setBounds(600,400,70,20);
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		add(b2);
		add(t1);
		add(t2);
	}
	public void handleEvent()
	{
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ie)
			{
               Profile p=new Profile();
			}
		}
		);
		 b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ie)
		{
		  try
		  {		  
			makeConnection();
			rs=st.executeQuery("select * from register");
			
			while(rs.next())
			{
				
				if(Login.id.contains(rs.getInt(3)+"")&&t2.getText()!="")
				{
					
					i=rs.getInt(3);
			  	    s=rs.getInt(4);
					p=t2.getText();
					name=rs.getString(1);
					ts.executeUpdate("delete from register where id="+i+"");
					ts.executeUpdate("insert into register values('"+name+"','"+p+"',"+i+","+s+")");
				     l3.setText("Your password has been changed");
			    }
			}
			    
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
			
		}
		}
		);
	}
}	
 public class MiniProject
 {
    public static void main(String[] args)
	{
	   MyFrame f1=new MyFrame();
	   f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
  }
