package Test;

public class Customer {

	String name="";

	Girl g;
	
	public Customer(String name,Girl g){
		this.name=name;
		this.g=g;
		g.occupied();
	}
	
	public void getCustomerDetail(){
		
		System.out.println(this.name+" was service by "+g.getName()+" number: "+g.getNumber());
		
	}
	
	public String getGirlName()
	{
		
		return g.getName();
	}
	
	public String getGirlNumber()
	{
		
		return g.getNumber();
	}
	
	public String getGirlStatus()
	{
		
		return g.getStatus();
	}
	
	public void checkOutGirl(){
		
		g.setFree();
		
	}
}
