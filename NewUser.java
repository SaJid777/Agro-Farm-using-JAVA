import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;  
  
class NewUser extends Frame implements WindowListener,ActionListener{
	private Register register;
	public    Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,submitButton,resetButton1; 
	   public Label l,l0,l1,l2,l3,l4,l5,l6,l7,l8;
       public TextField tf,tf1,tf2,tf3,tf4,tf5,tf6,tf7;	   
	public NewUser(Register r){
		super("Farm Management System/NewUser");
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
		
 l0=new Label("New User Information");
l0.setFont(new Font("New User Information",Font.PLAIN,20));		 
		  l0.setBounds(20,180, 500,45); 
		  		
		 l1=new Label("Full Name");  
		  l1.setFont(new Font("Full Name",Font.PLAIN,20));
		  l1.setBounds(30,230, 150,30);  
		tf=new TextField();  
        tf.setBounds(240,230, 150,30);
		
		l2=new Label("User Id");  
		  l2.setFont(new Font("User Id",Font.PLAIN,20));
		  l2.setBounds(30,280, 150,30);  
		tf1=new TextField();  
        tf1.setBounds(240,280, 150,30);
		
		l8=new Label("Email");  
		  l8.setFont(new Font("Email",Font.PLAIN,20));
		  l8.setBounds(30,320, 150,30);  
		tf2=new TextField();  
        tf2.setBounds(240,320, 150,30);
		
		l3=new Label("Address");  
		  l3.setFont(new Font("Address",Font.PLAIN,20));
		  l3.setBounds(30,370, 150,30);  
		tf3=new TextField();  
        tf3.setBounds(240,370, 150,30);
		
		l4=new Label("Phone");  
		  l4.setFont(new Font("Phone",Font.PLAIN,20));
		  l4.setBounds(30,420, 150,30);  
		tf4=new TextField();  
        tf4.setBounds(240,420, 150,30);
		
		l5=new Label("Position");  
		  l5.setFont(new Font("Position",Font.PLAIN,20));
		  l5.setBounds(30,470, 150,30);  
		tf5=new TextField();  
        tf5.setBounds(240,470, 150,30);
		
		l6=new Label(" password");  
		  l6.setFont(new Font("password",Font.PLAIN,20));
		  l6.setBounds(30,520, 150,30);  
		tf6=new TextField();  
        tf6.setBounds(240,520, 150,30);
		
		l7=new Label("Confirm Password");  
		  l7.setFont(new Font("Confirm Password",Font.PLAIN,20));
		  l7.setBounds(30,570, 170,30);  
		tf7=new TextField();  
        tf7.setBounds(240,570, 150,30);
		
		submitButton=new Button("Submit");  
        submitButton.setBounds(240,620,60,30);  
		
		 resetButton1=new Button("Reset");  
        resetButton1.setBounds(320,620,60,30);  
		
		
       
        add(l);add(l0);add(b);add(b1);add(b2);add(b3);add(b4);add(b5);add(submitButton);add(resetButton1);
		add(tf);add(l1);add(tf1);add(l8);add(tf2);add(l2);add(tf3);add(l3);add(tf4);add(l4);add(tf5);add(l5);add(tf6);add(l6);add(tf7);add(l7);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		
		submitButton.addActionListener(this);
		resetButton1.addActionListener(this);
		addWindowListener(this);
		
        setSize(800,800);  
        setLayout(null);  
        setVisible(false); 
		}
		public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		DataAccess da=new DataAccess();
		String st=e.getActionCommand();
		if(st.equals("Submit")){
			
			if(tf.getText().equals(tf7.getText())){
					
					register.newuser.setVisible(false);
					register.newuser.setVisible(true);
					}
			else if(tf6.getText().equals(tf7.getText())){
				String sql="insert into user (Uid,Uname,Password,Email,Address,Position,Phone) values('"+tf1.getText()+"','"+tf.getText()+"','"+tf6.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf5.getText()+"','"+tf4.getText()+"')";
				da.updateDB(sql);
				System.out.println(sql);
				tf.setText(null);
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf4.setText(null);
				tf5.setText(null);
				tf6.setText(null);
				tf7.setText(null);
				register.newuser.setVisible(false);
				register.Dashboard.setVisible(true);
			}
		}
		if(st.equals("Reset")){
			//register.newuser.setVisible(false);
			//register.newuser.setVisible(true);
				tf.getText();
				tf1.getText();
				tf2.getText();
				tf3.getText();
				tf4.getText();
				tf5.getText();
				tf6.getText();
				tf7.getText();
				tf.setText(null);
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf4.setText(null);
				tf5.setText(null);
				tf6.setText(null);
				tf7.setText(null);
			
			
		}
		
		if(st.equals("Home")){
			register.newuser.setVisible(false);
			register.homePage.setVisible(true);
		}
		else if(st.equals("Dashboard")){
			register.newuser.setVisible(false);
			register.Dashboard.setVisible(true);
		}
		else if(st.equals("Profile")){
			register.newuser.setVisible(false);
			register.userprofile.setVisible(true);
		}
		else if(st.equals("Reports")){
			register.newuser.setVisible(false);
			register.ReportDashboard.setVisible(true);
		}
		else if(st.equals("Change Password")){
			register.newuser.setVisible(false);
			register.ChangePass.setVisible(true);
		}
		else if(st.equals("Logout")){
			register.newuser.setVisible(false);
			register.login.setVisible(true);
		}
		
		
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}


	  public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("logo.PNG");  
        g.drawImage(i, 10,30,this);  
		tf.getText();
				tf1.getText();
				tf2.getText();
				tf3.getText();
				tf4.getText();
				tf5.getText();
				tf6.getText();
				tf7.getText();
				tf.setText(null);
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf4.setText(null);
				tf5.setText(null);
				tf6.setText(null);
				tf7.setText(null);
          
    }  
}