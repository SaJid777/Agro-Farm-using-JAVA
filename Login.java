import java.lang.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Login extends Frame implements WindowListener, ActionListener{
	private Register register;
	  public TextField tf,tf2;
public	  Button b,b1;
public Label l0,l1,l2; 
	
	public Login(Register r){
		super("User Login Window");
		this.register=r;
		l0=new Label("Farm Management System");
l0.setFont(new Font("Farm Management System",Font.PLAIN,40));		 
		  l0.setBounds(180,195, 500,45); 
		  
		  
		  l1=new Label("User Name");  
		  l1.setFont(new Font("User Name",Font.PLAIN,20));
		  l1.setBounds(340,295, 150,30);  
		tf=new TextField();  
        tf.setBounds(340,330, 150,20);
l2=new Label("Password");  		
l2.setFont(new Font("Password",Font.PLAIN,20));		
		
		
    l2.setBounds(340,380, 100,30); 
         tf2=new TextField();  
        tf2.setBounds(340,415, 150,20);  
		tf2.setEchoChar('*');
        b=new Button("Login");  
        b.setBounds(340,460,60,30);
		
		 b1=new Button("SignUp");  
        b1.setBounds(420,460,60,30); 
		
		
		   add(b);add(tf);add(tf2); add(l1); add(l2);add(l0); add(b1); 
		b.addActionListener(this);
		b1.addActionListener(this);
		addWindowListener(this);
		setSize(800,600);  
        setLayout(null);  
        setVisible(false);
	}
	 public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("logo.PNG");  
        g.drawImage(i, 60,160,this);
		tf.getText();
		tf2.getText();
		tf.setText(null);
		tf2.setText(null);
          
    }  
		public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	
	public void actionPerformed(ActionEvent e){
		DataAccess da=new DataAccess();
		String s = e.getActionCommand();
		
		if(s.equals("Login"))
		{
			String q= "SELECT * FROM user;";     
			Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		
		try
		{

						Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farm","root","");
			System.out.println("connection done");//connection with database established
			st= con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(q);//getting result
			System.out.println("results received");
			Boolean flag=true;
        		
			while(rs.next())
			{
                String uname = rs.getString("Uname");
				String password = rs.getString("Password");
				
				
				
				if(uname.equals(tf.getText()) && password.equals(tf2.getText()))
				{
					register.login.setVisible(false);
					register.homePage.setVisible(true);
					flag=false;
				
					
				}
				
			}
			
			if(flag)
				{
					JOptionPane.showMessageDialog(this,"Invalid ID or Password"); 
				}
			
		}
			
			catch(Exception ex)
		{
			System.out.println("Exception : " );
        }
        finally
		{
            try
			{
                if(rs!=null)
					rs.close();

                if(st!=null)
					st.close();

                if(con!=null)
					con.close();
            }
            catch(Exception ex){}
        }
			
		}
		
		else if(s.equals("SignUp")){
			register.login.setVisible(false);
			register.signup.setVisible(true);
		}
	}
	
	
	
	
	
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

}
