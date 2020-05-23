import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;  
  
class fertilizerDetails extends Frame implements WindowListener,ActionListener{
	private Register register;
	public    Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,submitButton,resetButton1; 
	   public Label l,l0,l1,l2,l3,l4,l5,l6,l7,l8;
       public TextField tf,tf1,tf2,tf3,tf4,tf5,tf6,tf7;	   
	public fertilizerDetails(Register r){
		super("Farm Management System/fertilizerDetails");
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
		
 l0=new Label("Add Fertilizer Details");
l0.setFont(new Font("Add Fertilizer Details",Font.PLAIN,20));		 
		  l0.setBounds(20,180, 500,45); 
		  		
		 l1=new Label("Fertilizer Id");  
		  l1.setFont(new Font("Fertilizer Id",Font.PLAIN,20));
		  l1.setBounds(30,230, 150,30);  
		tf1=new TextField();  
        tf1.setBounds(240,230, 150,30);
		
		l2=new Label("Fertilizer Name");  
		  l2.setFont(new Font("Fertilizer Name",Font.PLAIN,20));
		  l2.setBounds(30,280, 150,30);  
		tf2=new TextField();  
        tf2.setBounds(240,280, 150,30);
		
		l3=new Label("Quantity");  
		  l3.setFont(new Font("Quantity",Font.PLAIN,20));
		  l3.setBounds(30,320, 150,30);  
		tf3=new TextField();  
        tf3.setBounds(240,320, 150,30);
		
		l4=new Label("Current Rate");  
		  l4.setFont(new Font("Current Rate",Font.PLAIN,20));
		  l4.setBounds(30,370, 150,30);  
		tf4=new TextField();  
        tf4.setBounds(240,370, 150,30);
		
		
		submitButton=new Button("Submit");  
        submitButton.setBounds(240,420,60,30);  
		
		 resetButton1=new Button("Reset");  
        resetButton1.setBounds(320,420,60,30);  
		
		
       
        add(l);add(l0);add(b);add(b1);add(b2);add(b3);add(b4);add(b5);add(submitButton);add(resetButton1);
		add(tf1);add(l1);add(tf2);add(l2);add(tf3);add(l3);add(tf4);add(l4);
		
         submitButton.addActionListener(this);
		resetButton1.addActionListener(this);
		addWindowListener(this);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
        setSize(800,800);  
        setLayout(null);  
        setVisible(false); 
	}
		public void windowClosing(WindowEvent we)
    {
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e)
	{
		DataAccess da=new DataAccess();
		String st=e.getActionCommand();
		if(st.equals("Submit")){
			String sql="insert into fertilizer (FRid,FrName,Quantity,Rate) values('"+tf1.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"')";
				da.updateDB(sql);
				System.out.println(sql);
				tf4.setText(null);
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
		}
		else if(st.equals("Reset")){
			tf1.getText();
				tf2.getText();
				tf3.getText();
				tf4.getText();
				tf4.setText(null);
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
		}
		
		if(st.equals("Home")){
			register.addfertilizer.setVisible(false);
			register.homePage.setVisible(true);
		}
		else if(st.equals("Dashboard")){
			register.addfertilizer.setVisible(false);
			register.Dashboard.setVisible(true);
		}
		else if(st.equals("Profile")){
			register.addfertilizer.setVisible(false);
			register.userprofile.setVisible(true);
		}
		else if(st.equals("Reports")){
			register.addfertilizer.setVisible(false);
			register.ReportDashboard.setVisible(true);
		}
		else if(st.equals("Change Password")){
			register.addfertilizer.setVisible(false);
			register.ChangePass.setVisible(true);
		}
		else if(st.equals("Logout")){
			register.addfertilizer.setVisible(false);
			register.login.setVisible(true);
		}
		
		
		

	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}


	  public void paint(Graphics g) 
   {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("logo.PNG");  
        g.drawImage(i, 10,30,this);  
		tf1.getText();
				tf2.getText();
				tf3.getText();
				tf4.getText();
				tf4.setText(null);
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
          
    }  
}