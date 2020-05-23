import java.awt.*;
import java.awt.event.*;



class ReportDashboard extends Frame implements WindowListener, ActionListener{
    private Register register;
	   public Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13; 
	   public Label l;  
	
	public ReportDashboard(Register r){
		super("Farm Management System/Reports");
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
		b6=new Button("Food Details Report");  
        b6.setBounds(0,200,800,30);  
		b7=new Button("Seed Details Report");  
        b7.setBounds(0,230,800,30); 
		b8=new Button("Fertilizer Details Report");  
        b8.setBounds(0,260,800,30);
		b9=new Button("Pesticides Report");  
        b9.setBounds(0,290,800,30);
		b10=new Button("Treatment Information Report");  
        b10.setBounds(0,320,800,30);  
		b11=new Button("Employee Information Report");  
        b11.setBounds(0,350,800,30);  
		b12=new Button("Warehouse Status Report");  
        b12.setBounds(0,380,800,30);  
		b13=new Button("Transaction Report");  
        b13.setBounds(0,410,800,30);  
		  

       
        add(l);add(b);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);
		add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		
		addWindowListener(this);
        setSize(800,600);  
        setLayout(null);  
        setVisible(false); 
		
	
	}
	public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("logo.PNG");  
        g.drawImage(i, 10,30,this);  
          
    }

	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		int l=0;
		if(s.equals("Home")){
			register.ReportDashboard.setVisible(false);
			register.homePage.setVisible(true);
		}
		else if(s.equals("Dashboard")){
			register.ReportDashboard.setVisible(false);
			register.Dashboard.setVisible(true);
		}
		else if(s.equals("Profile")){
			register.ReportDashboard.setVisible(false);
			register.userprofile.setVisible(true);
		}
		else if(s.equals("Reports")){
			register.ReportDashboard.setVisible(false);
			register.ReportDashboard.setVisible(true);
		}
		else if(s.equals("Change Password")){
			register.ChangePass.setVisible(true);
			register.ReportDashboard.setVisible(false);
		}
		else if(s.equals("Logout")){
			register.login.setVisible(true);
			register.ReportDashboard.setVisible(false);
		}
else if(s.equals("Food Details Report")){
			register.ReportDashboard.setVisible(false);
			register.foodreports.setVisible(true);
		}	
	
else if(s.equals("Fertilizer Details Report")){
			register.ReportDashboard.setVisible(false);
			register.fertilizerreports.setVisible(true);
		}	
else if(s.equals("Seed Details Report")){
			register.ReportDashboard.setVisible(false);
			register.seedreports.setVisible(true);
		}	
else if(s.equals("Pesticides Report")){
			register.ReportDashboard.setVisible(false);
			register.pesticidereports.setVisible(true);
		}	
else if(s.equals("Treatment Information Report")){
			register.ReportDashboard.setVisible(false);
			register.treatmentreports.setVisible(true);
		}	
else if(s.equals("Employee Information Report")){
			register.ReportDashboard.setVisible(false);
			register.employeereports.setVisible(true);
		}
else if(s.equals("Warehouse Status Report")){
			register.ReportDashboard.setVisible(false);
			register.warehousereports.setVisible(true);
		}
else if(s.equals("Transaction Report")){
			register.ReportDashboard.setVisible(false);
			register.transactionreports.setVisible(true);
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
