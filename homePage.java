import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame; 


import java.awt.*;
import java.awt.event.*;

class homePage extends Frame implements WindowListener, ActionListener{
    private Register register;
			public   Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b11,b12,b13,b14; 
	   public Label l;  
      
	public homePage(Register r){
		super("Farm Management System/Home");
		this.register=r; 
          
        
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("home pic.PNG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image backImg = img.getScaledInstance(800, 240, Image.SCALE_SMOOTH);
        ImageIcon backImageIcon = new ImageIcon(backImg);   //creates background image icon
        
        setLayout(new BorderLayout());
        JLabel back=new JLabel(backImageIcon);
        add(back);
        back.setLayout(new FlowLayout());
      
       
		
		l=new Label("Farm Management System");
		l.setFont(new Font("Farm Management System",Font.PLAIN, 40));
		l.setBounds(20,60,500,45);  
		    
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
	   
        add(l);add(b);add(b1);add(b2);add(b3);add(b4);add(b5);
        add(back);
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		addWindowListener(this);
        setSize(800,600);
        setVisible(false);
    
	}
	
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		int l=0;
		if(s.equals("Home")){
			register.login.setVisible(false);
			register.homePage.setVisible(true);
		}
		else if(s.equals("Dashboard")){
			register.homePage.setVisible(false);
			register.Dashboard.setVisible(true);
		}
		else if(s.equals("Profile")){
			register.homePage.setVisible(false);
			register.userprofile.setVisible(true);
		}
		else if(s.equals("Reports")){
			register.homePage.setVisible(false);
			register.ReportDashboard.setVisible(true);
		}
		else if(s.equals("Change Password")){
			register.homePage.setVisible(false);
			register.ChangePass.setVisible(true);
		}
		else if(s.equals("Logout")){
			register.login.setVisible(true);
			register.homePage.setVisible(false);
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
