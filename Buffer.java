import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Buffer{
	public Food foodList[];
	public Buffer(int s){
		foodList=new Food[s];
	}
	public void addFood(Food c){
		for(int i=0;i<foodList.length;i++){
			if(foodList[i]==null){
				foodList[i]=c;
				break;
			}
		}
	}
	public void loadFoods(String sql){
		//System.out.println(sql);
		try{
			DataAccess da=new DataAccess();
			ResultSet rs=da.getData(sql);
			
			for(int i=0;i<foodList.length;i++){
				foodList[i]=null;
		}
			
			Food c=null;
			while(rs.next()){
				c=new Food(rs.getString("Fid"),rs.getString("Fname"),rs.getString("Type"),rs.getString("Quantity"));
				addFood(c);
				//System.out.println(rs.getInt("cid"));
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public void showAllFoods(JLabel l){
		printAllFoods();
		
		
		
		l.setText(null);
		String s="<html>";
		for(Food r:foodList){
			
			if(r!=null){
				s=s+"  FoodId: "+r.getFid()+"  FoodName:  "+r.getName();
				s=s+"  FoodType:  "+r.getType()+"  Quantity: "+r.getQuantity()+"<br/>";
				
			}
			
		}
		s+="</html>";
			l.setText(s);
		
	}
	public void printAllFoods(){
		for(Food c:foodList){
			if(c!=null){
				System.out.println(c);
			}
		}
	}
}