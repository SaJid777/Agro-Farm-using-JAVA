public class Food{
	private String cid;
	private String name;
	private String type;
	private String quantity;
	public Food(String c,String n,String p,String e){
		cid=c;name=n;
		type=p;quantity=e;
	}
	public String getName(){return name;}
	public String getType(){return type;}
	public String getQuantity(){return quantity;}
	public String getFid(){return cid;}
	public String toString(){
		return name+" : "+quantity;
	}
}