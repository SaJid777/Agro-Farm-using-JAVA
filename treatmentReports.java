import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
   
class treatmentReports extends JFrame implements WindowListener,ActionListener{
	private Register register;
	public    Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,submitButton,show,search,delete,resetButton1; 
	   public Label l,l0,l1,l2,l3,l4,l5,l6,l7,l8;
       public TextField tf,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;	
public JLabel messageBox,messageBox1;	   
	public treatmentReports(Register r){
		super("Farm Management System/treatmentreposrts");
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
		
		show=new Button("Show All");  
        show.setBounds(600,200,100,50); 
		
		search =new Button("Search");  
        search.setBounds(790,40,100,30);

		tf8=new TextField();  
        tf8.setBounds(680,40, 100,30);  
	
		
 l0=new Label("Treatment Reports");
l0.setFont(new Font("Treatment Reports",Font.PLAIN,20));		 
		  l0.setBounds(20,180, 500,45); 
	
messageBox=new JLabel("Data to show");
		messageBox.setFont(new Font("Farm Management System",Font.PLAIN, 15));
		messageBox.setBounds(20,200,900,600);
		
		
			
messageBox1=new JLabel("Data to show");
		messageBox1.setFont(new Font("Farm Management",Font.PLAIN, 15));
		messageBox1.setBounds(720,80,200,300);
		
		
		delete=new Button("Delete");  
        delete.setBounds(790,800,100,30); 
		
		tf9=new TextField();  
        tf9.setBounds(680,800, 100,30); 
		  	
				
				add(l);add(l0);add(b);add(b1);add(b2);add(b3);add(b4);add(b5);add(show);add(messageBox);add(search);add(messageBox1);add(tf8);add(delete);add(tf9);
				
				
				
				b.addActionListener(this);
		        b1.addActionListener(this);
                b2.addActionListener(this);
		        b3.addActionListener(this);
		        b4.addActionListener(this);
		        b5.addActionListener(this);
				show.addActionListener(this);
				search.addActionListener(this);
				delete.addActionListener(this);
				addWindowListener(this);
		
        setSize(1000,950);  
        setLayout(null);  
        setVisible(false); 
	}
		
	public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("logo.PNG");  
        g.drawImage(i, 10,30,this);  
		tf8.getText();
		tf8.setText(null);
		tf9.getText();
		tf9.setText(null);
          
    }  
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
	
		if(s.equals("Home")){
			register.treatmentreports.setVisible(false);
			register.homePage.setVisible(true);
		}
		else if(s.equals("Dashboard")){
			register.treatmentreports.setVisible(false);
			register.Dashboard.setVisible(true);
		}
		else if(s.equals("Profile")){
			register.treatmentreports.setVisible(false);
			register.userprofile.setVisible(true);
		}
		else if(s.equals("Reports")){
			register.treatmentreports.setVisible(false);
			register.ReportDashboard.setVisible(true);
		}
		else if(s.equals("Change Password")){
			register.treatmentreports.setVisible(false);
			register.ChangePass.setVisible(true);
		}
		else if(s.equals("Logout")){
			register.treatmentreports.setVisible(false);
			register.login.setVisible(true);
		}
		if(s.equals("Show All")){
			try{
			DataAccess da=new DataAccess();
			ResultSet rs=da.getData("SELECT * FROM treatment");
			messageBox.setText(null);
			String st="<html>";
			while(rs.next()){
				st=st+"  TreatmentId: "+rs.getString("Tid")+"  TreatmentName:  "+rs.getString("Tname");
				st=st+"  Symptom:  "+rs.getString("Symptom")+"  PesticideName: "+rs.getString("Pname")+"  FertilizerName: "+rs.getString("Frname")+"<br/>";
			}
			st+="</html>";
			messageBox.setText(st);
			}
			catch(Exception ex){
			ex.printStackTrace();
		}
			
		}
		
		if(s.equals("Search")){
			try{
			DataAccess da=new DataAccess();
			ResultSet rs=da.getData("SELECT * FROM treatment ");
			messageBox1.setText(null);
			String st=null;
			while(rs.next()){
				String d=rs.getString("Symptom");
				if(d.equals(tf8.getText())){
					st="<html>"+"  TreatmentName:  "+rs.getString("Tname")+"  PesticideName: "+rs.getString("Pname")+"  FertilizerName: "+rs.getString("Frname")+"<br/>"+"</html>";
				}
			}
			
			messageBox1.setText(st);
			}
			catch(Exception ex){
			ex.printStackTrace();
		}
			
		}
		
		if(s.equals("Delete")){
			try{
			DataAccess da=new DataAccess();
			ResultSet rs=da.getData("SELECT * FROM treatment ");
			while(rs.next()){
				String d=rs.getString("Tid");
				if(d.equals(tf9.getText())){					
					String sql="DELETE FROM  treatment WHERE Tid = '"+tf9.getText()+"'";
				da.updateDB(sql);
				System.out.println(sql);
				tf9.setText(null);
				}
			}
			
			}
			catch(Exception ex){
			
		}
			
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