import java.lang.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import java.awt.*;
import java.awt.event.*;


class ChangePass extends JFrame implements WindowListener, ActionListener{
    private Register register;
	
	public	   Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,submitButton,resetButton1; 
	   public Label l,l0,l1,l2,l3,l4,l5,l6,l7,l8;
       public TextField tf,tf1,tf2,tf3,tf4,tf5,tf6,tf7;	   
	
	public ChangePass(Register r){
		super("Farm Management System/ChangePass");
		this.register=r;
		l=new Label("Farm Management System");
		l.setFont(new Font("Farm Management System",Font.PLAIN, 40));
		l.setBounds(150,60,500,45);  
		    
        b=new Button("Home");  
        b.setBounds(20,130,100,50);  
		b1=new Button("Dashboard");  
        b1.setBounds(120,130,100,50);  
		b2=new Button("Profile");  
        b2.setBounds(220,130,100,50);  
		b3=new Button("Reports");  
        b3.setBounds(320,130,100,50); 
		b4=new Button("Change Password");  
        b4.setBounds(420,130,120,50);  
		b5=new Button("Logout");  
        b5.setBounds(540,130,100,50); 
		  		
		 l1=new Label("Old Password");  
		  l1.setFont(new Font("Old Password",Font.PLAIN,20));
		  l1.setBounds(30,230,200,30);  
		tf=new TextField();  
        tf.setBounds(300,230,150,30);
		
		l2=new Label("New Password");  
		  l2.setFont(new Font("New Password",Font.PLAIN,20));
		  l2.setBounds(30,280, 200,30);  
		tf1=new TextField();  
        tf1.setBounds(300,280, 150,30);
		
		l8=new Label("Confirm Password");  
		  l8.setFont(new Font("Confirm Password",Font.PLAIN,20));
		  l8.setBounds(30,320, 200,30);  
		tf2=new TextField();  
        tf2.setBounds(300,320, 150,30);   
		tf.setEchoChar('*');
		tf1.setEchoChar('*');
		tf2.setEchoChar('*');
		
		submitButton=new Button("Submit");  
        submitButton.setBounds(300,380,60,30);  
		
		
       
        add(l);add(b);add(b1);add(b2);add(b3);add(b4);add(b5);add(submitButton);
		add(tf);add(l1);add(l2);add(tf1);add(l8);add(tf2);
        b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		submitButton.addActionListener(this);
		addWindowListener(this);
  		
        setSize(800,600);  
        setLayout(null);  
        setVisible(false); 
		
	}
	
	public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("logo.PNG");  
        g.drawImage(i, 10,30,this);  
        tf.setText(null);
				tf1.setText(null);
				tf2.getText();
				tf2.setText(null);  
    }  
		
	public void actionPerformed(ActionEvent e){
		String st=e.getActionCommand();
		DataAccess da=new DataAccess();
		
		if(st.equals("Submit")){
			Boolean flag=true;
			if(tf.getText().equals(register.login.tf2.getText()))
			{flag=false;
				
			if(tf1.getText().equals(tf2.getText()))
			{
				String sql=" UPDATE user SET Password= '"+tf1.getText()+"' WHERE Password= '"+tf.getText()+"'";
				da.updateDB(sql);
				System.out.println(sql);
				tf.setText(null);
				tf1.setText(null);
				tf2.setText(null);
				
			
				register.ChangePass.setVisible(false);
				register.login.setVisible(true);
			}
			
			}
			
			if(flag)
			{
				JOptionPane.showMessageDialog(this,"Invalid");
			}
			
		}
		
		if(st.equals("Home")){
			register.ChangePass.setVisible(false);
			register.homePage.setVisible(true);
		}
		else if(st.equals("Dashboard")){
			register.ChangePass.setVisible(false);
			register.Dashboard.setVisible(true);
		}
		else if(st.equals("Profile")){
			register.ChangePass.setVisible(false);
			register.userprofile.setVisible(true);
		}
		else if(st.equals("Reports")){
			register.ChangePass.setVisible(false);
			register.ReportDashboard.setVisible(true);
		}
		else if(st.equals("Change Password")){
			register.ChangePass.setVisible(false);
			register.ChangePass.setVisible(true);
		}
		else if(st.equals("Logout")){
			register.ChangePass.setVisible(false);
			register.login.setVisible(true);
		}
		
		
	}
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}


	
}