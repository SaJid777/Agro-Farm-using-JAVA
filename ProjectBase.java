public class ProjectBase{
    public static void main(String str[]){
		Register r=new Register();
		r.login=new Login(r);
		r.newuser=new NewUser(r);
		//r.HomePage=new homePage(r);
		r.Dashboard=new Dashboard(r);
		r.ReportDashboard=new ReportDashboard(r);
		r.addemployee=new AddEmployee(r);
		r.addfood=new AddFood(r);
		r.addseed=new AddSeed(r);
		r.ChangePass=new ChangePass(r);
		r.addseed=new AddSeed(r);
		r.addtransaction=new AddTransaction(r);
		r.addwarehouse=new AddWarehouseStatus(r);
		r.addfertilizer=new fertilizerDetails(r);
		r.addpesticide=new pesticideDetails(r);
		r.addtreatment=new treatmentInfo(r);
		r.homePage=new homePage(r);
		r.signup=new SignUp(r);
        r.login.setVisible(true);
		/* r.newuser.setVisible(false);
		 r.homePage.setVisible(false);
		 r.Dashboard.setVisible(false);
		 r.ReportDashboard.setVisible(false);
		 r.addemployee.setVisible(false);
		r.addfood.setVisible(false);
		r.addseed.setVisible(false);
		r.ChangePass.setVisible(false);*/


	r.employeereports=new EmployeeReports(r);
		r.foodreports=new FoodReports(r);
		r.seedreports=new SeedReports(r);
		r.pesticidereports=new pesticideReports(r);
		r.fertilizerreports=new fertilizerReports(r);
		r.transactionreports=new transactionReports(r);
		r.treatmentreports=new treatmentReports(r);
		r.warehousereports=new WarehouseReport(r);
		r.userprofile=new Userprofile(r);
    

    }
}